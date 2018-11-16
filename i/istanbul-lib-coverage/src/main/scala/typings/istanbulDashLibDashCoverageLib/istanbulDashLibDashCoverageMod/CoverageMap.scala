package typings
package istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-coverage", "CoverageMap")
@js.native
class CoverageMap protected () extends js.Object {
  def this(data: CoverageMapData) = this()
  var data: CoverageMapData = js.native
  def addFileCoverage(pathOrObject: FileCoverageData): scala.Unit = js.native
  def addFileCoverage(pathOrObject: java.lang.String): scala.Unit = js.native
  def fileCoverageFor(filename: java.lang.String): FileCoverage = js.native
  def files(): js.Array[java.lang.String] = js.native
  def filter(callback: js.Function1[/* key */ java.lang.String, scala.Boolean]): scala.Unit = js.native
  def merge(data: CoverageMap): scala.Unit = js.native
  def merge(data: CoverageMapData): scala.Unit = js.native
  def toJSON(): js.Object = js.native
}

