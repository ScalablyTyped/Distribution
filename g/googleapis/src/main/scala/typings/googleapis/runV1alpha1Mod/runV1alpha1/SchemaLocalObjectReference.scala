package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocalObjectReference extends StObject {
  
  /**
    * (Optional) Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaLocalObjectReference {
  
  inline def apply(): SchemaLocalObjectReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalObjectReference]
  }
  
  extension [Self <: SchemaLocalObjectReference](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
