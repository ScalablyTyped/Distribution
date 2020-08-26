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
  def apply(): SchemaIosInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosInfo]
  }
  @scala.inline
  implicit class SchemaIosInfoOps[Self <: SchemaIosInfo] (val x: Self) extends AnyVal {
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
    def setIosAppStoreId(value: String): Self = this.set("iosAppStoreId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosAppStoreId: Self = this.set("iosAppStoreId", js.undefined)
    @scala.inline
    def setIosBundleId(value: String): Self = this.set("iosBundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosBundleId: Self = this.set("iosBundleId", js.undefined)
    @scala.inline
    def setIosCustomScheme(value: String): Self = this.set("iosCustomScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosCustomScheme: Self = this.set("iosCustomScheme", js.undefined)
    @scala.inline
    def setIosFallbackLink(value: String): Self = this.set("iosFallbackLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosFallbackLink: Self = this.set("iosFallbackLink", js.undefined)
    @scala.inline
    def setIosIpadBundleId(value: String): Self = this.set("iosIpadBundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosIpadBundleId: Self = this.set("iosIpadBundleId", js.undefined)
    @scala.inline
    def setIosIpadFallbackLink(value: String): Self = this.set("iosIpadFallbackLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosIpadFallbackLink: Self = this.set("iosIpadFallbackLink", js.undefined)
    @scala.inline
    def setIosMinimumVersion(value: String): Self = this.set("iosMinimumVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosMinimumVersion: Self = this.set("iosMinimumVersion", js.undefined)
  }
  
}

