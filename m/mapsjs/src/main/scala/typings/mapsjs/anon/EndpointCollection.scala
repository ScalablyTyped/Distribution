package typings.mapsjs.anon

import typings.mapsjs.mod.tile.quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointCollection extends StObject {
  
  var endpointCollection: js.Array[String]
  
  var idxMinX: Double
  
  var idxMinY: Double
  
  var quadCollection: js.Array[quad]
  
  var ulX: Double
  
  var ulY: Double
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
  implicit class EndpointCollectionMutableBuilder[Self <: EndpointCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointCollection(value: js.Array[String]): Self = StObject.set(x, "endpointCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointCollectionVarargs(value: String*): Self = StObject.set(x, "endpointCollection", js.Array(value :_*))
    
    @scala.inline
    def setIdxMinX(value: Double): Self = StObject.set(x, "idxMinX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdxMinY(value: Double): Self = StObject.set(x, "idxMinY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuadCollection(value: js.Array[quad]): Self = StObject.set(x, "quadCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuadCollectionVarargs(value: quad*): Self = StObject.set(x, "quadCollection", js.Array(value :_*))
    
    @scala.inline
    def setUlX(value: Double): Self = StObject.set(x, "ulX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUlY(value: Double): Self = StObject.set(x, "ulY", value.asInstanceOf[js.Any])
  }
}
