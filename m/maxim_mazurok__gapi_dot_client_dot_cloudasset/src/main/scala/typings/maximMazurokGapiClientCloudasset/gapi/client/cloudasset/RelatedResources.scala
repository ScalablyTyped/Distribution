package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedResources extends StObject {
  
  /** The detailed related resources of the primary resource. */
  var relatedResources: js.UndefOr[js.Array[RelatedResource]] = js.undefined
}
object RelatedResources {
  
  inline def apply(): RelatedResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedResources]
  }
  
  extension [Self <: RelatedResources](x: Self) {
    
    inline def setRelatedResources(value: js.Array[RelatedResource]): Self = StObject.set(x, "relatedResources", value.asInstanceOf[js.Any])
    
    inline def setRelatedResourcesUndefined: Self = StObject.set(x, "relatedResources", js.undefined)
    
    inline def setRelatedResourcesVarargs(value: RelatedResource*): Self = StObject.set(x, "relatedResources", js.Array(value*))
  }
}
