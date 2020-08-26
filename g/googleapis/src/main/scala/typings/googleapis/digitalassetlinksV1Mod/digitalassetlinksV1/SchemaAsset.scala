package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Uniquely identifies an asset.  A digital asset is an identifiable and
  * addressable online entity that typically provides some service or content.
  * Examples of assets are websites, Android apps, Twitter feeds, and Plus
  * Pages.
  */
@js.native
trait SchemaAsset extends js.Object {
  /**
    * Set if this is an Android App asset.
    */
  var androidApp: js.UndefOr[SchemaAndroidAppAsset] = js.native
  /**
    * Set if this is a web asset.
    */
  var web: js.UndefOr[SchemaWebAsset] = js.native
}

object SchemaAsset {
  @scala.inline
  def apply(): SchemaAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsset]
  }
  @scala.inline
  implicit class SchemaAssetOps[Self <: SchemaAsset] (val x: Self) extends AnyVal {
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
    def setAndroidApp(value: SchemaAndroidAppAsset): Self = this.set("androidApp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidApp: Self = this.set("androidApp", js.undefined)
    @scala.inline
    def setWeb(value: SchemaWebAsset): Self = this.set("web", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeb: Self = this.set("web", js.undefined)
  }
  
}

