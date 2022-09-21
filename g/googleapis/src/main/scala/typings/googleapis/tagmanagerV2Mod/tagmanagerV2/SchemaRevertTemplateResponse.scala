package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRevertTemplateResponse extends StObject {
  
  /**
    * Template as it appears in the latest container version since the last workspace synchronization operation. If no template is present, that means the template was deleted in the latest container version.
    */
  var template: js.UndefOr[SchemaCustomTemplate] = js.undefined
}
object SchemaRevertTemplateResponse {
  
  inline def apply(): SchemaRevertTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevertTemplateResponse]
  }
  
  extension [Self <: SchemaRevertTemplateResponse](x: Self) {
    
    inline def setTemplate(value: SchemaCustomTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
