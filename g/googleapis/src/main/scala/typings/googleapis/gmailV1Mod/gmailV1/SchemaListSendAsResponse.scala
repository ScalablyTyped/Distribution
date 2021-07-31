package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the ListSendAs method.
  */
trait SchemaListSendAsResponse extends StObject {
  
  /**
    * List of send-as aliases.
    */
  var sendAs: js.UndefOr[js.Array[SchemaSendAs]] = js.undefined
}
object SchemaListSendAsResponse {
  
  @scala.inline
  def apply(): SchemaListSendAsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSendAsResponse]
  }
  
  @scala.inline
  implicit class SchemaListSendAsResponseMutableBuilder[Self <: SchemaListSendAsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSendAs(value: js.Array[SchemaSendAs]): Self = StObject.set(x, "sendAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendAsUndefined: Self = StObject.set(x, "sendAs", js.undefined)
    
    @scala.inline
    def setSendAsVarargs(value: SchemaSendAs*): Self = StObject.set(x, "sendAs", js.Array(value :_*))
  }
}
