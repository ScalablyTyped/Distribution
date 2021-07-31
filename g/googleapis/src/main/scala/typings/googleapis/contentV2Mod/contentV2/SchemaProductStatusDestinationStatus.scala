package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductStatusDestinationStatus extends StObject {
  
  /**
    * Whether the approval status might change due to further processing.
    */
  var approvalPending: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The destination&#39;s approval status.
    */
  var approvalStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the destination
    */
  var destination: js.UndefOr[String] = js.undefined
  
  /**
    * Provided for backward compatibility only. Always set to
    * &quot;required&quot;.
    */
  var intention: js.UndefOr[String] = js.undefined
}
object SchemaProductStatusDestinationStatus {
  
  @scala.inline
  def apply(): SchemaProductStatusDestinationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductStatusDestinationStatus]
  }
  
  @scala.inline
  implicit class SchemaProductStatusDestinationStatusMutableBuilder[Self <: SchemaProductStatusDestinationStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalPending(value: Boolean): Self = StObject.set(x, "approvalPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalPendingUndefined: Self = StObject.set(x, "approvalPending", js.undefined)
    
    @scala.inline
    def setApprovalStatus(value: String): Self = StObject.set(x, "approvalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalStatusUndefined: Self = StObject.set(x, "approvalStatus", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setIntention(value: String): Self = StObject.set(x, "intention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentionUndefined: Self = StObject.set(x, "intention", js.undefined)
  }
}
