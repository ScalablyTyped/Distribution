package typings.jest.jestMod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageMap extends js.Object {
  var data: RawCoverage
  def addFileCoverage(fileCoverage: RawFileCoverage): Unit
  def fileCoverageFor(file: String): FileCoverage
  def files(): js.Array[String]
  def getCoverageSummary(): FileCoverage
  def merge(data: js.Object): Unit
}

object CoverageMap {
  @scala.inline
  def apply(
    addFileCoverage: RawFileCoverage => Unit,
    data: RawCoverage,
    fileCoverageFor: String => FileCoverage,
    files: () => js.Array[String],
    getCoverageSummary: () => FileCoverage,
    merge: js.Object => Unit
  ): CoverageMap = {
    val __obj = js.Dynamic.literal(addFileCoverage = js.Any.fromFunction1(addFileCoverage), data = data.asInstanceOf[js.Any], fileCoverageFor = js.Any.fromFunction1(fileCoverageFor), files = js.Any.fromFunction0(files), getCoverageSummary = js.Any.fromFunction0(getCoverageSummary), merge = js.Any.fromFunction1(merge))
  
    __obj.asInstanceOf[CoverageMap]
  }
}

