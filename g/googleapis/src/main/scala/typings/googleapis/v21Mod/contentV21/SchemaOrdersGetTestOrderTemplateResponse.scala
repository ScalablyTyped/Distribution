package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersGetTestOrderTemplateResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersGetTestOrderTemplateResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The requested test order template.
    */
  var template: js.UndefOr[SchemaTestOrder] = js.undefined
}
object SchemaOrdersGetTestOrderTemplateResponse {
  
  inline def apply(): SchemaOrdersGetTestOrderTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersGetTestOrderTemplateResponse]
  }
  
  extension [Self <: SchemaOrdersGetTestOrderTemplateResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTemplate(value: SchemaTestOrder): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
