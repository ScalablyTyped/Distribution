package typings.googleapis.polyV1Mod.polyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data about the user&#39;s asset.
  */
@js.native
trait SchemaUserAsset extends js.Object {
  /**
    * An Asset.
    */
  var asset: js.UndefOr[SchemaAsset] = js.native
}

object SchemaUserAsset {
  @scala.inline
  def apply(): SchemaUserAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserAsset]
  }
  @scala.inline
  implicit class SchemaUserAssetOps[Self <: SchemaUserAsset] (val x: Self) extends AnyVal {
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
    def setAsset(value: SchemaAsset): Self = this.set("asset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsset: Self = this.set("asset", js.undefined)
  }
  
}

