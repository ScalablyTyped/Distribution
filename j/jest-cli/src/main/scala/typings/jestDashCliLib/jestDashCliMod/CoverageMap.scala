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
    addFileCoverage: RawFileCoverage => scala.Unit,
    data: RawCoverage,
    fileCoverageFor: java.lang.String => FileCoverage,
    files: () => js.Array[java.lang.String],
    getCoverageSummary: () => FileCoverage,
    merge: org.scalablytyped.runtime.StringDictionary[js.Any] => scala.Unit
  ): CoverageMap = {
    val __obj = js.Dynamic.literal(addFileCoverage = js.Any.fromFunction1(addFileCoverage), data = data, fileCoverageFor = js.Any.fromFunction1(fileCoverageFor), files = js.Any.fromFunction0(files), getCoverageSummary = js.Any.fromFunction0(getCoverageSummary), merge = js.Any.fromFunction1(merge))
  
    __obj.asInstanceOf[CoverageMap]
  }
}

