package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVoiceOfMerchantState extends StObject {
  
  /**
    * The location fails to comply with our [guidelines](https://support.google.com/business/answer/3038177) and requires additional steps for reinstatement. To fix this issue, consult the [Help Center Article](https://support.google.com/business/answer/4569145).
    */
  var complyWithGuidelines: js.UndefOr[SchemaComplyWithGuidelines] = js.undefined
  
  /**
    * Indicates whether the location has the authority (ownership) over the business on Google. If true, another location cannot take over and become the dominant listing on Maps. However, edits will not become live unless Voice of Merchant is gained (i.e. has_voice_of_merchant is true).
    */
  var hasBusinessAuthority: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether the location is in good standing and has control over the business on Google. Any edits made to the location will propagate to Maps after passing the review phase.
    */
  var hasVoiceOfMerchant: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This location duplicates another location that is in good standing. If you have access to the location in good standing, use that location's id to perform operations. Otherwise, request access from the current owner.
    */
  var resolveOwnershipConflict: js.UndefOr[SchemaResolveOwnershipConflict] = js.undefined
  
  /**
    * Start or continue the verification process.
    */
  var verify: js.UndefOr[SchemaVerify] = js.undefined
  
  /**
    * Wait to gain Voice of Merchant. The location is under review for quality purposes.
    */
  var waitForVoiceOfMerchant: js.UndefOr[SchemaWaitForVoiceOfMerchant] = js.undefined
}
object SchemaVoiceOfMerchantState {
  
  inline def apply(): SchemaVoiceOfMerchantState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoiceOfMerchantState]
  }
  
  extension [Self <: SchemaVoiceOfMerchantState](x: Self) {
    
    inline def setComplyWithGuidelines(value: SchemaComplyWithGuidelines): Self = StObject.set(x, "complyWithGuidelines", value.asInstanceOf[js.Any])
    
    inline def setComplyWithGuidelinesUndefined: Self = StObject.set(x, "complyWithGuidelines", js.undefined)
    
    inline def setHasBusinessAuthority(value: Boolean): Self = StObject.set(x, "hasBusinessAuthority", value.asInstanceOf[js.Any])
    
    inline def setHasBusinessAuthorityNull: Self = StObject.set(x, "hasBusinessAuthority", null)
    
    inline def setHasBusinessAuthorityUndefined: Self = StObject.set(x, "hasBusinessAuthority", js.undefined)
    
    inline def setHasVoiceOfMerchant(value: Boolean): Self = StObject.set(x, "hasVoiceOfMerchant", value.asInstanceOf[js.Any])
    
    inline def setHasVoiceOfMerchantNull: Self = StObject.set(x, "hasVoiceOfMerchant", null)
    
    inline def setHasVoiceOfMerchantUndefined: Self = StObject.set(x, "hasVoiceOfMerchant", js.undefined)
    
    inline def setResolveOwnershipConflict(value: SchemaResolveOwnershipConflict): Self = StObject.set(x, "resolveOwnershipConflict", value.asInstanceOf[js.Any])
    
    inline def setResolveOwnershipConflictUndefined: Self = StObject.set(x, "resolveOwnershipConflict", js.undefined)
    
    inline def setVerify(value: SchemaVerify): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
    
    inline def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
    
    inline def setWaitForVoiceOfMerchant(value: SchemaWaitForVoiceOfMerchant): Self = StObject.set(x, "waitForVoiceOfMerchant", value.asInstanceOf[js.Any])
    
    inline def setWaitForVoiceOfMerchantUndefined: Self = StObject.set(x, "waitForVoiceOfMerchant", js.undefined)
  }
}
