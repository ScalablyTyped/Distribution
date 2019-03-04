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
    val __obj = js.Dynamic.literal(endpointCollection = endpointCollection, idxMinX = idxMinX, idxMinY = idxMinY, quadCollection = quadCollection, ulX = ulX, ulY = ulY)
  
    __obj.asInstanceOf[Anon_EndpointCollection]
  }
}

