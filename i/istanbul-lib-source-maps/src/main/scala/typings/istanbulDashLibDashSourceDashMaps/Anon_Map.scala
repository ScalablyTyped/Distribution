package typings.istanbulDashLibDashSourceDashMaps

import typings.istanbulDashLibDashCoverage.istanbulDashLibDashCoverageMod.CoverageMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Map extends js.Object {
  var map: CoverageMap
  def sourceFinder(path: String): String
}

object Anon_Map {
  @scala.inline
  def apply(map: CoverageMap, sourceFinder: String => String): Anon_Map = {
    val __obj = js.Dynamic.literal(map = map, sourceFinder = js.Any.fromFunction1(sourceFinder))
  
    __obj.asInstanceOf[Anon_Map]
  }
}

