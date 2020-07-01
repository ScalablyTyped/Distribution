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
  def apply(
    anonymous: js.UndefOr[Boolean] = js.undefined,
    clientId: String = null,
    displayText: String = null,
    etag: String = null,
    kind: String = null,
    nativeApp: js.UndefOr[Boolean] = js.undefined,
    scopes: js.Array[String] = null,
    userKey: String = null
  ): SchemaToken = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous.get.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (displayText != null) __obj.updateDynamic("displayText")(displayText.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(nativeApp)) __obj.updateDynamic("nativeApp")(nativeApp.get.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (userKey != null) __obj.updateDynamic("userKey")(userKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaToken]
  }
}

