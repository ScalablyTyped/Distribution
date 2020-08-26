package typings.mapsjs.anon

import typings.mapsjs.mod.tile.quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointCollection extends js.Object {
  var endpointCollection: js.Array[String] = js.native
  var idxMinX: Double = js.native
  var idxMinY: Double = js.native
  var quadCollection: js.Array[quad] = js.native
  var ulX: Double = js.native
  var ulY: Double = js.native
}

object EndpointCollection {
  @scala.inline
  def apply(
    endpointCollection: js.Array[String],
    idxMinX: Double,
    idxMinY: Double,
    quadCollection: js.Array[quad],
    ulX: Double,
    ulY: Double
  ): EndpointCollection = {
    val __obj = js.Dynamic.literal(endpointCollection = endpointCollection.asInstanceOf[js.Any], idxMinX = idxMinX.asInstanceOf[js.Any], idxMinY = idxMinY.asInstanceOf[js.Any], quadCollection = quadCollection.asInstanceOf[js.Any], ulX = ulX.asInstanceOf[js.Any], ulY = ulY.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointCollection]
  }
  @scala.inline
  implicit class EndpointCollectionOps[Self <: EndpointCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndpointCollectionVarargs(value: String*): Self = this.set("endpointCollection", js.Array(value :_*))
    @scala.inline
    def setEndpointCollection(value: js.Array[String]): Self = this.set("endpointCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdxMinX(value: Double): Self = this.set("idxMinX", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdxMinY(value: Double): Self = this.set("idxMinY", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuadCollectionVarargs(value: quad*): Self = this.set("quadCollection", js.Array(value :_*))
    @scala.inline
    def setQuadCollection(value: js.Array[quad]): Self = this.set("quadCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def setUlX(value: Double): Self = this.set("ulX", value.asInstanceOf[js.Any])
    @scala.inline
    def setUlY(value: Double): Self = this.set("ulY", value.asInstanceOf[js.Any])
  }
  
}

