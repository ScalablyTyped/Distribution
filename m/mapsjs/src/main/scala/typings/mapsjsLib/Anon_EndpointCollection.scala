package typings
package mapsjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointCollection extends js.Object {
  var endpointCollection: js.Array[java.lang.String]
  var idxMinX: scala.Double
  var idxMinY: scala.Double
  var quadCollection: js.Array[mapsjsLib.mapsjsMod.tileNs.quad]
  var ulX: scala.Double
  var ulY: scala.Double
}

object Anon_EndpointCollection {
  @scala.inline
  def apply(
    endpointCollection: js.Array[java.lang.String],
    idxMinX: scala.Double,
    idxMinY: scala.Double,
    quadCollection: js.Array[mapsjsLib.mapsjsMod.tileNs.quad],
    ulX: scala.Double,
    ulY: scala.Double
  ): Anon_EndpointCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endpointCollection")(endpointCollection)
    __obj.updateDynamic("idxMinX")(idxMinX)
    __obj.updateDynamic("idxMinY")(idxMinY)
    __obj.updateDynamic("quadCollection")(quadCollection)
    __obj.updateDynamic("ulX")(ulX)
    __obj.updateDynamic("ulY")(ulY)
    __obj.asInstanceOf[Anon_EndpointCollection]
  }
}

