package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request of getting a code for user confirmation (reset password, change
  * email etc.)
  */
@js.native
trait SchemaRelyingparty extends js.Object {
  /**
    * whether or not to install the android app on the device where the link is
    * opened
    */
  var androidInstallApp: js.UndefOr[Boolean] = js.native
  /**
    * minimum version of the app. if the version on the device is lower than
    * this version then the user is taken to the play store to upgrade the app
    */
  var androidMinimumVersion: js.UndefOr[String] = js.native
  /**
    * android package name of the android app to handle the action code
    */
  var androidPackageName: js.UndefOr[String] = js.native
  /**
    * whether or not the app can handle the oob code without first going to web
    */
  var canHandleCodeInApp: js.UndefOr[Boolean] = js.native
  /**
    * The recaptcha response from the user.
    */
  var captchaResp: js.UndefOr[String] = js.native
  /**
    * The recaptcha challenge presented to the user.
    */
  var challenge: js.UndefOr[String] = js.native
  /**
    * The url to continue to the Gitkit app
    */
  var continueUrl: js.UndefOr[String] = js.native
  /**
    * The email of the user.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * iOS app store id to download the app if it&#39;s not already installed
    */
  var iOSAppStoreId: js.UndefOr[String] = js.native
  /**
    * the iOS bundle id of iOS app to handle the action code
    */
  var iOSBundleId: js.UndefOr[String] = js.native
  /**
    * The user&#39;s Gitkit login token for email change.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * The fixed string &quot;identitytoolkit#relyingparty&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The new email if the code is for email change.
    */
  var newEmail: js.UndefOr[String] = js.native
  /**
    * The request type.
    */
  var requestType: js.UndefOr[String] = js.native
  /**
    * The IP address of the user.
    */
  var userIp: js.UndefOr[String] = js.native
}

object SchemaRelyingparty {
  @scala.inline
  def apply(): SchemaRelyingparty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelyingparty]
  }
  @scala.inline
  implicit class SchemaRelyingpartyOps[Self <: SchemaRelyingparty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAndroidInstallApp(value: Boolean): Self = this.set("androidInstallApp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidInstallApp: Self = this.set("androidInstallApp", js.undefined)
    @scala.inline
    def setAndroidMinimumVersion(value: String): Self = this.set("androidMinimumVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidMinimumVersion: Self = this.set("androidMinimumVersion", js.undefined)
    @scala.inline
    def setAndroidPackageName(value: String): Self = this.set("androidPackageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidPackageName: Self = this.set("androidPackageName", js.undefined)
    @scala.inline
    def setCanHandleCodeInApp(value: Boolean): Self = this.set("canHandleCodeInApp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanHandleCodeInApp: Self = this.set("canHandleCodeInApp", js.undefined)
    @scala.inline
    def setCaptchaResp(value: String): Self = this.set("captchaResp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptchaResp: Self = this.set("captchaResp", js.undefined)
    @scala.inline
    def setChallenge(value: String): Self = this.set("challenge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChallenge: Self = this.set("challenge", js.undefined)
    @scala.inline
    def setContinueUrl(value: String): Self = this.set("continueUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinueUrl: Self = this.set("continueUrl", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setIOSAppStoreId(value: String): Self = this.set("iOSAppStoreId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIOSAppStoreId: Self = this.set("iOSAppStoreId", js.undefined)
    @scala.inline
    def setIOSBundleId(value: String): Self = this.set("iOSBundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIOSBundleId: Self = this.set("iOSBundleId", js.undefined)
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNewEmail(value: String): Self = this.set("newEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewEmail: Self = this.set("newEmail", js.undefined)
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
  
}

