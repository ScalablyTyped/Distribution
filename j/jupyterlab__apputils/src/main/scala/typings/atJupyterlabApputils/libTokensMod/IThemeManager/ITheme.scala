package typings.atJupyterlabApputils.libTokensMod.IThemeManager

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
  var isLight: Boolean
  /**
    * The display name of the theme.
    */
  var name: String
  /**
    * Whether the theme includes styling for the scrollbar.
    * If set to false, this theme will leave the native scrollbar untouched.
    */
  var themeScrollbars: js.UndefOr[Boolean] = js.undefined
  /**
    * Load the theme.
    *
    * @returns A promise that resolves when the theme has loaded.
    */
  def load(): js.Promise[Unit]
  /**
    * Unload the theme.
    *
    * @returns A promise that resolves when the theme has unloaded.
    */
  def unload(): js.Promise[Unit]
}

object ITheme {
  @scala.inline
  def apply(
    isLight: Boolean,
    load: () => js.Promise[Unit],
    name: String,
    unload: () => js.Promise[Unit],
    themeScrollbars: js.UndefOr[Boolean] = js.undefined
  ): ITheme = {
    val __obj = js.Dynamic.literal(isLight = isLight.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), name = name.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload))
    if (!js.isUndefined(themeScrollbars)) __obj.updateDynamic("themeScrollbars")(themeScrollbars.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITheme]
  }
}

