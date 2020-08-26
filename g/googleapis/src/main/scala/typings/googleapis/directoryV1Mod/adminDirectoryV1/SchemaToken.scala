package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for token resource in Directory API.
  */
@js.native
trait SchemaToken extends js.Object {
  /**
    * Whether the application is registered with Google. The value is true if
    * the application has an anonymous Client ID.
    */
  var anonymous: js.UndefOr[Boolean] = js.native
  /**
    * The Client ID of the application the token is issued to.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * The displayable name of the application the token is issued to.
    */
  var displayText: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The type of the API resource. This is always admin#directory#token.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Whether the token is issued to an installed application. The value is
    * true if the application is installed to a desktop or mobile device.
    */
  var nativeApp: js.UndefOr[Boolean] = js.native
  /**
    * A list of authorization scopes the application is granted.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The unique ID of the user that issued the token.
    */
  var userKey: js.UndefOr[String] = js.native
}

object SchemaToken {
  @scala.inline
  def apply(): SchemaToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToken]
  }
  @scala.inline
  implicit class SchemaTokenOps[Self <: SchemaToken] (val x: Self) extends AnyVal {
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
    def setAnonymous(value: Boolean): Self = this.set("anonymous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnonymous: Self = this.set("anonymous", js.undefined)
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setDisplayText(value: String): Self = this.set("displayText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayText: Self = this.set("displayText", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNativeApp(value: Boolean): Self = this.set("nativeApp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeApp: Self = this.set("nativeApp", js.undefined)
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
    @scala.inline
    def setUserKey(value: String): Self = this.set("userKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserKey: Self = this.set("userKey", js.undefined)
  }
  
}

