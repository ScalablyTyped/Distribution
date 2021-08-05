package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTemplateVersionLabelRequest extends StObject {
  
  /** The label key for update. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Requests for add label to TemplateVersion or remove label from TemplateVersion. */
  var op: js.UndefOr[String] = js.undefined
  
  /** The label value for update. */
  var value: js.UndefOr[String] = js.undefined
}
object ModifyTemplateVersionLabelRequest {
  
  inline def apply(): ModifyTemplateVersionLabelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTemplateVersionLabelRequest]
  }
  
  extension [Self <: ModifyTemplateVersionLabelRequest](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
