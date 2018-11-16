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
  def merge(data: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Unit
}

