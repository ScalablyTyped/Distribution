package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRefundReason extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var reasonCode: js.UndefOr[String] = js.native
}
object SchemaRefundReason {
  
  @scala.inline
  def apply(): SchemaRefundReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRefundReason]
  }
  
  @scala.inline
  implicit class SchemaRefundReasonMutableBuilder[Self <: SchemaRefundReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setReasonCode(value: String): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
  }
}
