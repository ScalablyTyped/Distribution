package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * iOS related attributes to the Dynamic Link..
  */
@js.native
trait SchemaIosInfo extends js.Object {
  /**
    * iOS App Store ID.
    */
  var iosAppStoreId: js.UndefOr[String] = js.native
  /**
    * iOS bundle ID of the app.
    */
  var iosBundleId: js.UndefOr[String] = js.native
  /**
    * Custom (destination) scheme to use for iOS. By default, we’ll use the
    * bundle ID as the custom scheme. Developer can override this behavior
    * using this param.
    */
  var iosCustomScheme: js.UndefOr[String] = js.native
  /**
    * Link to open on iOS if the app is not installed.
    */
  var iosFallbackLink: js.UndefOr[String] = js.native
  /**
    * iPad bundle ID of the app.
    */
  var iosIpadBundleId: js.UndefOr[String] = js.native
  /**
    * If specified, this overrides the ios_fallback_link value on iPads.
    */
  var iosIpadFallbackLink: js.UndefOr[String] = js.native
  /**
    * iOS minimum version.
    */
  var iosMinimumVersion: js.UndefOr[String] = js.native
}

object SchemaIosInfo {
  @scala.inline
  def apply(
    iosAppStoreId: String = null,
    iosBundleId: String = null,
    iosCustomScheme: String = null,
    iosFallbackLink: String = null,
    iosIpadBundleId: String = null,
    iosIpadFallbackLink: String = null,
    iosMinimumVersion: String = null
  ): SchemaIosInfo = {
    val __obj = js.Dynamic.literal()
    if (iosAppStoreId != null) __obj.updateDynamic("iosAppStoreId")(iosAppStoreId.asInstanceOf[js.Any])
    if (iosBundleId != null) __obj.updateDynamic("iosBundleId")(iosBundleId.asInstanceOf[js.Any])
    if (iosCustomScheme != null) __obj.updateDynamic("iosCustomScheme")(iosCustomScheme.asInstanceOf[js.Any])
    if (iosFallbackLink != null) __obj.updateDynamic("iosFallbackLink")(iosFallbackLink.asInstanceOf[js.Any])
    if (iosIpadBundleId != null) __obj.updateDynamic("iosIpadBundleId")(iosIpadBundleId.asInstanceOf[js.Any])
    if (iosIpadFallbackLink != null) __obj.updateDynamic("iosIpadFallbackLink")(iosIpadFallbackLink.asInstanceOf[js.Any])
    if (iosMinimumVersion != null) __obj.updateDynamic("iosMinimumVersion")(iosMinimumVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIosInfo]
  }
}

