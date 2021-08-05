package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request of getting a code for user confirmation (reset password, change
  * email etc.)
  */
trait SchemaRelyingparty extends StObject {
  
  /**
    * whether or not to install the android app on the device where the link is
    * opened
    */
  var androidInstallApp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * minimum version of the app. if the version on the device is lower than
    * this version then the user is taken to the play store to upgrade the app
    */
  var androidMinimumVersion: js.UndefOr[String] = js.undefined
  
  /**
    * android package name of the android app to handle the action code
    */
  var androidPackageName: js.UndefOr[String] = js.undefined
  
  /**
    * whether or not the app can handle the oob code without first going to web
    */
  var canHandleCodeInApp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The recaptcha response from the user.
    */
  var captchaResp: js.UndefOr[String] = js.undefined
  
  /**
    * The recaptcha challenge presented to the user.
    */
  var challenge: js.UndefOr[String] = js.undefined
  
  /**
    * The url to continue to the Gitkit app
    */
  var continueUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The email of the user.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * iOS app store id to download the app if it&#39;s not already installed
    */
  var iOSAppStoreId: js.UndefOr[String] = js.undefined
  
  /**
    * the iOS bundle id of iOS app to handle the action code
    */
  var iOSBundleId: js.UndefOr[String] = js.undefined
  
  /**
    * The user&#39;s Gitkit login token for email change.
    */
  var idToken: js.UndefOr[String] = js.undefined
  
  /**
    * The fixed string &quot;identitytoolkit#relyingparty&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The new email if the code is for email change.
    */
  var newEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The request type.
    */
  var requestType: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address of the user.
    */
  var userIp: js.UndefOr[String] = js.undefined
}
object SchemaRelyingparty {
  
  inline def apply(): SchemaRelyingparty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelyingparty]
  }
  
  extension [Self <: SchemaRelyingparty](x: Self) {
    
    inline def setAndroidInstallApp(value: Boolean): Self = StObject.set(x, "androidInstallApp", value.asInstanceOf[js.Any])
    
    inline def setAndroidInstallAppUndefined: Self = StObject.set(x, "androidInstallApp", js.undefined)
    
    inline def setAndroidMinimumVersion(value: String): Self = StObject.set(x, "androidMinimumVersion", value.asInstanceOf[js.Any])
    
    inline def setAndroidMinimumVersionUndefined: Self = StObject.set(x, "androidMinimumVersion", js.undefined)
    
    inline def setAndroidPackageName(value: String): Self = StObject.set(x, "androidPackageName", value.asInstanceOf[js.Any])
    
    inline def setAndroidPackageNameUndefined: Self = StObject.set(x, "androidPackageName", js.undefined)
    
    inline def setCanHandleCodeInApp(value: Boolean): Self = StObject.set(x, "canHandleCodeInApp", value.asInstanceOf[js.Any])
    
    inline def setCanHandleCodeInAppUndefined: Self = StObject.set(x, "canHandleCodeInApp", js.undefined)
    
    inline def setCaptchaResp(value: String): Self = StObject.set(x, "captchaResp", value.asInstanceOf[js.Any])
    
    inline def setCaptchaRespUndefined: Self = StObject.set(x, "captchaResp", js.undefined)
    
    inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
    
    inline def setContinueUrl(value: String): Self = StObject.set(x, "continueUrl", value.asInstanceOf[js.Any])
    
    inline def setContinueUrlUndefined: Self = StObject.set(x, "continueUrl", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setIOSAppStoreId(value: String): Self = StObject.set(x, "iOSAppStoreId", value.asInstanceOf[js.Any])
    
    inline def setIOSAppStoreIdUndefined: Self = StObject.set(x, "iOSAppStoreId", js.undefined)
    
    inline def setIOSBundleId(value: String): Self = StObject.set(x, "iOSBundleId", value.asInstanceOf[js.Any])
    
    inline def setIOSBundleIdUndefined: Self = StObject.set(x, "iOSBundleId", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNewEmail(value: String): Self = StObject.set(x, "newEmail", value.asInstanceOf[js.Any])
    
    inline def setNewEmailUndefined: Self = StObject.set(x, "newEmail", js.undefined)
    
    inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    
    inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
    
    inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
  }
}
