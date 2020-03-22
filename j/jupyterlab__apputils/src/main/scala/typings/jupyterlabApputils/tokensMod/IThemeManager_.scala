package typings.jupyterlabApputils.tokensMod

import typings.jupyterlabApputils.tokensMod.IThemeManager.ITheme
import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemeManager_ extends js.Object {
  /**
    * Get the name of the current theme.
    */
  val theme: String | Null
  /**
    * A signal fired when the application theme changes.
    */
  val themeChanged: ISignal[this.type, IChangedArgs[String, String | Null, String]]
  /**
    * The names of the registered themes.
    */
  val themes: js.Array[String]
  /**
    * Test whether a given theme is light.
    */
  def isLight(name: String): Boolean
  /**
    * Load a theme CSS file by path.
    *
    * @param path - The path of the file to load.
    */
  def loadCSS(path: String): js.Promise[Unit]
  /**
    * Register a theme with the theme manager.
    *
    * @param theme - The theme to register.
    *
    * @returns A disposable that can be used to unregister the theme.
    */
  def register(theme: ITheme): IDisposable
  /**
    * Set the current theme.
    */
  def setTheme(name: String): js.Promise[Unit]
  /**
    * Test whether a given theme styles scrollbars,
    * and if the user has scrollbar styling enabled.
    */
  def themeScrollbars(name: String): Boolean
}

object IThemeManager_ {
  @scala.inline
  def apply(
    isLight: String => Boolean,
    loadCSS: String => js.Promise[Unit],
    register: ITheme => IDisposable,
    setTheme: String => js.Promise[Unit],
    themeChanged: ISignal[IThemeManager_, IChangedArgs[String, String | Null, String]],
    themeScrollbars: String => Boolean,
    themes: js.Array[String],
    theme: String = null
  ): IThemeManager_ = {
    val __obj = js.Dynamic.literal(isLight = js.Any.fromFunction1(isLight), loadCSS = js.Any.fromFunction1(loadCSS), register = js.Any.fromFunction1(register), setTheme = js.Any.fromFunction1(setTheme), themeChanged = themeChanged.asInstanceOf[js.Any], themeScrollbars = js.Any.fromFunction1(themeScrollbars), themes = themes.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeManager_]
  }
}

