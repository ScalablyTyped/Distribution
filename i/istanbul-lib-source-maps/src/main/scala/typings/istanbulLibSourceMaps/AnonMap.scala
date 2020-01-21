package typings.istanbulLibSourceMaps

import typings.istanbulLibCoverage.mod.CoverageMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMap extends js.Object {
  var map: CoverageMap
  def sourceFinder(path: String): String
}

object AnonMap {
  @scala.inline
  def apply(map: CoverageMap, sourceFinder: String => String): AnonMap = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], sourceFinder = js.Any.fromFunction1(sourceFinder))
  
    __obj.asInstanceOf[AnonMap]
  }
}

