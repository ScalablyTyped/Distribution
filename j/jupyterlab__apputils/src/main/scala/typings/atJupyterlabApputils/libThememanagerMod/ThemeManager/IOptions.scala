package typings.atJupyterlabApputils.libThememanagerMod.ThemeManager

import typings.atJupyterlabApputils.libSplashMod.ISplashScreen
import typings.atJupyterlabCoreutils.libTokensMod.ISettingRegistry
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a theme manager.
  */
trait IOptions extends js.Object {
  /**
    * The host widget for the theme manager.
    */
  var host: Widget
  /**
    * The setting registry key that holds theme setting data.
    */
  var key: String
  /**
    * The settings registry.
    */
  var settings: ISettingRegistry
  /**
    * The splash screen to show when loading themes.
    */
  var splash: js.UndefOr[ISplashScreen] = js.undefined
  /**
    * The url for local theme loading.
    */
  var url: String
}

object IOptions {
  @scala.inline
  def apply(host: Widget, key: String, settings: ISettingRegistry, url: String, splash: ISplashScreen = null): IOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (splash != null) __obj.updateDynamic("splash")(splash.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

