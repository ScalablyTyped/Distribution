package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleApiServiceusageV1OperationMetadata extends StObject {
  
  /**
    * The full name of the resources that this operation is directly associated with.
    */
  var resourceNames: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleApiServiceusageV1OperationMetadata {
  
  inline def apply(): SchemaGoogleApiServiceusageV1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleApiServiceusageV1OperationMetadata]
  }
  
  extension [Self <: SchemaGoogleApiServiceusageV1OperationMetadata](x: Self) {
    
    inline def setResourceNames(value: js.Array[String]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
    
    inline def setResourceNamesNull: Self = StObject.set(x, "resourceNames", null)
    
    inline def setResourceNamesUndefined: Self = StObject.set(x, "resourceNames", js.undefined)
    
    inline def setResourceNamesVarargs(value: String*): Self = StObject.set(x, "resourceNames", js.Array(value*))
  }
}
