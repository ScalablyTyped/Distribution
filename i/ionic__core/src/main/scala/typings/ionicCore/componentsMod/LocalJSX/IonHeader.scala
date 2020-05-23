package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.condense
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonHeader extends js.Object {
  /**
    * Describes the scroll effect that will be applied to the header `condense` only applies in iOS mode.  Typically used for [Collapsible Large Titles](https://ionicframework.com/docs/api/title#collapsible-large-titles)
    */
  var collapse: js.UndefOr[condense] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * If `true`, the header will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).  Note: In order to scroll content behind the header, the `fullscreen` attribute needs to be set on the content.
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}

object IonHeader {
  @scala.inline
  def apply(collapse: condense = null, mode: ios | md = null, translucent: js.UndefOr[Boolean] = js.undefined): IonHeader = {
    val __obj = js.Dynamic.literal()
    if (collapse != null) __obj.updateDynamic("collapse")(collapse.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonHeader]
  }
}

