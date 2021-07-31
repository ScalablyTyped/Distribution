package typings.googleapis.contentV2Mod.contentV2

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
  
  @scala.inline
  def apply(): SchemaOrdersGetTestOrderTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersGetTestOrderTemplateResponse]
  }
  
  @scala.inline
  implicit class SchemaOrdersGetTestOrderTemplateResponseMutableBuilder[Self <: SchemaOrdersGetTestOrderTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setTemplate(value: SchemaTestOrder): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
