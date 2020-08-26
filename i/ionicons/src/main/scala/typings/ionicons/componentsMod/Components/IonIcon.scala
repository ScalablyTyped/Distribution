package typings.ionicons.componentsMod.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonIcon extends js.Object {
  /**
    * Specifies the label to use for accessibility. Defaults to the icon name.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * The color to use for the background of the item.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Specifies whether the icon should horizontally flip when `dir` is `"rtl"`.
    */
  var flipRtl: js.UndefOr[Boolean] = js.native
  /**
    * A combination of both `name` and `src`. If a `src` url is detected it will set the `src` property. Otherwise it assumes it's a built-in named SVG and set the `name` property.
    */
  var icon: js.UndefOr[js.Any] = js.native
  /**
    * Specifies which icon to use on `ios` mode.
    */
  var ios: js.UndefOr[String] = js.native
  /**
    * If enabled, ion-icon will be loaded lazily when it's visible in the viewport. Default, `false`.
    */
  var `lazy`: Boolean = js.native
  /**
    * Specifies which icon to use on `md` mode.
    */
  var md: js.UndefOr[String] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: String = js.native
  /**
    * Specifies which icon to use from the built-in set of icons.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The size of the icon. Available options are: `"small"` and `"large"`.
    */
  var size: js.UndefOr[String] = js.native
  /**
    * Specifies the exact `src` of an SVG file to use.
    */
  var src: js.UndefOr[String] = js.native
}

object IonIcon {
  @scala.inline
  def apply(`lazy`: Boolean, mode: String): IonIcon = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonIcon]
  }
  @scala.inline
  implicit class IonIconOps[Self <: IonIcon] (val x: Self) extends AnyVal {
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
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFlipRtl(value: Boolean): Self = this.set("flipRtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipRtl: Self = this.set("flipRtl", js.undefined)
    @scala.inline
    def setIcon(value: js.Any): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIos(value: String): Self = this.set("ios", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
    @scala.inline
    def setMd(value: String): Self = this.set("md", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMd: Self = this.set("md", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
  
}

