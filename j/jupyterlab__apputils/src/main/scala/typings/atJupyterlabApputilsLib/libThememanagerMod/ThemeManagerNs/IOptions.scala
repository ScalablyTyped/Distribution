package typings
package atJupyterlabApputilsLib.libThememanagerMod.ThemeManagerNs

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
  var host: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget
  /**
    * The setting registry key that holds theme setting data.
    */
  var key: java.lang.String
  /**
    * The settings registry.
    */
  var settings: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistry
  /**
    * The splash screen to show when loading themes.
    */
  var splash: atJupyterlabApputilsLib.libSplashMod.ISplashScreen
  /**
    * The url for local theme loading.
    */
  var url: java.lang.String
}

object IOptions {
  @scala.inline
  def apply(
    host: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget,
    key: java.lang.String,
    settings: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistry,
    splash: atJupyterlabApputilsLib.libSplashMod.ISplashScreen,
    url: java.lang.String
  ): IOptions = {
    val __obj = js.Dynamic.literal(host = host, key = key, settings = settings, splash = splash, url = url)
  
    __obj.asInstanceOf[IOptions]
  }
}

