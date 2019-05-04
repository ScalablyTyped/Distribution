package typings
package atJupyterlabApputilsLib.libThememanagerMod.ThemeManagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a theme.
  */
trait ITheme extends js.Object {
  /**
    * Whether the theme is light or dark. Downstream authors
    * of extensions can use this information to customize their
    * UI depending upon the current theme.
    */
  var isLight: scala.Boolean
  /**
    * The display name of the theme.
    */
  var name: java.lang.String
  /**
    * Load the theme.
    *
    * @returns A promise that resolves when the theme has loaded.
    */
  def load(): js.Promise[scala.Unit]
  /**
    * Unload the theme.
    *
    * @returns A promise that resolves when the theme has unloaded.
    */
  def unload(): js.Promise[scala.Unit]
}

object ITheme {
  @scala.inline
  def apply(
    isLight: scala.Boolean,
    load: () => js.Promise[scala.Unit],
    name: java.lang.String,
    unload: () => js.Promise[scala.Unit]
  ): ITheme = {
    val __obj = js.Dynamic.literal(isLight = isLight, load = js.Any.fromFunction0(load), name = name, unload = js.Any.fromFunction0(unload))
  
    __obj.asInstanceOf[ITheme]
  }
}

