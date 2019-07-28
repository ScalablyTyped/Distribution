package typings.mapsjs

import typings.mapsjs.mapsjsMod.tileNs.quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointCollection extends js.Object {
  var endpointCollection: js.Array[String]
  var idxMinX: Double
  var idxMinY: Double
  var quadCollection: js.Array[quad]
  var ulX: Double
  var ulY: Double
}

object Anon_EndpointCollection {
  @scala.inline
  def apply(
    endpointCollection: js.Array[String],
    idxMinX: Double,
    idxMinY: Double,
    quadCollection: js.Array[quad],
    ulX: Double,
    ulY: Double
  ): Anon_EndpointCollection = {
    val __obj = js.Dynamic.literal(endpointCollection = endpointCollection, idxMinX = idxMinX, idxMinY = idxMinY, quadCollection = quadCollection, ulX = ulX, ulY = ulY)
  
    __obj.asInstanceOf[Anon_EndpointCollection]
  }
}

