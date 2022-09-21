package typings.googleapis.datafusionV1beta1Mod.datafusionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNamespace extends StObject {
  
  /**
    * IAM policy associated with this namespace.
    */
  var iamPolicy: js.UndefOr[SchemaIAMPolicy] = js.undefined
  
  /**
    * Name of the given namespace.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaNamespace {
  
  inline def apply(): SchemaNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamespace]
  }
  
  extension [Self <: SchemaNamespace](x: Self) {
    
    inline def setIamPolicy(value: SchemaIAMPolicy): Self = StObject.set(x, "iamPolicy", value.asInstanceOf[js.Any])
    
    inline def setIamPolicyUndefined: Self = StObject.set(x, "iamPolicy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
