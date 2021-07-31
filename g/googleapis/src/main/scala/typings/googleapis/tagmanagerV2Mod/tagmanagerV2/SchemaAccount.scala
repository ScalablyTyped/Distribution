package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Account.
  */
trait SchemaAccount extends StObject {
  
  /**
    * The Account ID uniquely identifies the GTM Account.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The fingerprint of the GTM Account as computed at storage time. This
    * value is recomputed whenever the account is modified.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * Account display name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * GTM Account&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the account shares data anonymously with Google and others. This
    * flag enables benchmarking by sharing your data in an anonymous form.
    * Google will remove all identifiable information about your website,
    * combine the data with hundreds of other anonymous sites and report
    * aggregate trends in the benchmarking service.
    */
  var shareData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Auto generated link to the tag manager UI
    */
  var tagManagerUrl: js.UndefOr[String] = js.undefined
}
object SchemaAccount {
  
  @scala.inline
  def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  
  @scala.inline
  implicit class SchemaAccountMutableBuilder[Self <: SchemaAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setShareData(value: Boolean): Self = StObject.set(x, "shareData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareDataUndefined: Self = StObject.set(x, "shareData", js.undefined)
    
    @scala.inline
    def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
  }
}
