package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageMap extends js.Object {
  var data: RawCoverage
  def addFileCoverage(fileCoverage: RawFileCoverage): scala.Unit
  def fileCoverageFor(file: java.lang.String): FileCoverage
  def files(): js.Array[java.lang.String]
  def getCoverageSummary(): FileCoverage
  def merge(data: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit
}

object CoverageMap {
  @scala.inline
  def apply(
    addFileCoverage: js.Function1[RawFileCoverage, scala.Unit],
    data: RawCoverage,
    fileCoverageFor: js.Function1[java.lang.String, FileCoverage],
    files: js.Function0[js.Array[java.lang.String]],
    getCoverageSummary: js.Function0[FileCoverage],
    merge: js.Function1[org.scalablytyped.runtime.StringDictionary[js.Any], scala.Unit]
  ): CoverageMap = {
    val __obj = js.Dynamic.literal(addFileCoverage = addFileCoverage, data = data, fileCoverageFor = fileCoverageFor, files = files, getCoverageSummary = getCoverageSummary, merge = merge)
  
    __obj.asInstanceOf[CoverageMap]
  }
}

