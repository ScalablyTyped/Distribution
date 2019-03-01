package typings
package istanbulDashLibDashSourceDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Map extends js.Object {
  var map: istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.CoverageMap
  def sourceFinder(path: java.lang.String): java.lang.String
}

object Anon_Map {
  @scala.inline
  def apply(
    map: istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.CoverageMap,
    sourceFinder: js.Function1[java.lang.String, java.lang.String]
  ): Anon_Map = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("sourceFinder")(sourceFinder)
    __obj.asInstanceOf[Anon_Map]
  }
}

