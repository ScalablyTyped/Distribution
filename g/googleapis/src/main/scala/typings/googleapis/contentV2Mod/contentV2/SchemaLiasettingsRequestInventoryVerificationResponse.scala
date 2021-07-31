package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiasettingsRequestInventoryVerificationResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsRequestInventoryVerificationResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaLiasettingsRequestInventoryVerificationResponse {
  
  @scala.inline
  def apply(): SchemaLiasettingsRequestInventoryVerificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsRequestInventoryVerificationResponse]
  }
  
  @scala.inline
  implicit class SchemaLiasettingsRequestInventoryVerificationResponseMutableBuilder[Self <: SchemaLiasettingsRequestInventoryVerificationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
