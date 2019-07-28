package typings.atJupyterlabApputils.libTokensMod

import typings.atJupyterlabApputils.libTokensMod.IThemeManagerNs.ITheme
import typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemeManager extends js.Object {
  /**
    * Get the name of the current theme.
    */
  val theme: String | Null
  /**
    * A signal fired when the application theme changes.
    */
  val themeChanged: ISignal[this.type, IChangedArgs[String]]
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

object IThemeManager {
  @scala.inline
  def apply(
    isLight: String => Boolean,
    loadCSS: String => js.Promise[Unit],
    register: ITheme => IDisposable,
    setTheme: String => js.Promise[Unit],
    themeChanged: ISignal[IThemeManager, IChangedArgs[String]],
    themeScrollbars: String => Boolean,
    themes: js.Array[String],
    theme: String = null
  ): IThemeManager = {
    val __obj = js.Dynamic.literal(isLight = js.Any.fromFunction1(isLight), loadCSS = js.Any.fromFunction1(loadCSS), register = js.Any.fromFunction1(register), setTheme = js.Any.fromFunction1(setTheme), themeChanged = themeChanged, themeScrollbars = js.Any.fromFunction1(themeScrollbars), themes = themes)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IThemeManager]
  }
}

