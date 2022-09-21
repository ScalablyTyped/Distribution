package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContainer extends StObject {
  
  /**
    * Optional container image id, when provided by the container runtime. Uniquely identifies the container image launched using a container image digest.
    */
  var imageId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Container labels, as provided by the container runtime.
    */
  var labels: js.UndefOr[js.Array[SchemaLabel]] = js.undefined
  
  /**
    * Container name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Container image URI provided when configuring a pod/container. May identify a container image version using mutable tags.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaContainer {
  
  inline def apply(): SchemaContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainer]
  }
  
  extension [Self <: SchemaContainer](x: Self) {
    
    inline def setImageId(value: String): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdNull: Self = StObject.set(x, "imageId", null)
    
    inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
    
    inline def setLabels(value: js.Array[SchemaLabel]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: SchemaLabel*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
