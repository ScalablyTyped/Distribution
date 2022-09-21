package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductStatusDestinationStatus extends StObject {
  
  /**
    * Whether the approval status might change due to further processing.
    */
  var approvalPending: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The destination's approval status. Acceptable values are: - "`approved`" - "`disapproved`"
    */
  var approvalStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the destination
    */
  var destination: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Provided for backward compatibility only. Always set to "required". Acceptable values are: - "`default`" - "`excluded`" - "`optional`" - "`required`"
    */
  var intention: js.UndefOr[String | Null] = js.undefined
}
object SchemaProductStatusDestinationStatus {
  
  inline def apply(): SchemaProductStatusDestinationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductStatusDestinationStatus]
  }
  
  extension [Self <: SchemaProductStatusDestinationStatus](x: Self) {
    
    inline def setApprovalPending(value: Boolean): Self = StObject.set(x, "approvalPending", value.asInstanceOf[js.Any])
    
    inline def setApprovalPendingNull: Self = StObject.set(x, "approvalPending", null)
    
    inline def setApprovalPendingUndefined: Self = StObject.set(x, "approvalPending", js.undefined)
    
    inline def setApprovalStatus(value: String): Self = StObject.set(x, "approvalStatus", value.asInstanceOf[js.Any])
    
    inline def setApprovalStatusNull: Self = StObject.set(x, "approvalStatus", null)
    
    inline def setApprovalStatusUndefined: Self = StObject.set(x, "approvalStatus", js.undefined)
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationNull: Self = StObject.set(x, "destination", null)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setIntention(value: String): Self = StObject.set(x, "intention", value.asInstanceOf[js.Any])
    
    inline def setIntentionNull: Self = StObject.set(x, "intention", null)
    
    inline def setIntentionUndefined: Self = StObject.set(x, "intention", js.undefined)
  }
}
