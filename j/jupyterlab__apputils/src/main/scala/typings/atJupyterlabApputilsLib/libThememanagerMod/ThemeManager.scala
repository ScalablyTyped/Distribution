package typings
package atJupyterlabApputilsLib.libThememanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/thememanager", "ThemeManager")
@js.native
class ThemeManager protected () extends js.Object {
  /**
    * Construct a new theme manager.
    */
  def this(options: atJupyterlabApputilsLib.libThememanagerMod.ThemeManagerNs.IOptions) = this()
  var _base: js.Any = js.native
  var _current: js.Any = js.native
  var _host: js.Any = js.native
  var _links: js.Any = js.native
  /**
    * Handle the current settings.
    */
  var _loadSettings: js.Any = js.native
  /**
    * Load the theme.
    *
    * #### Notes
    * This method assumes that the `theme` exists.
    */
  var _loadTheme: js.Any = js.native
  /**
    * Handle a theme error.
    */
  var _onError: js.Any = js.native
  var _outstanding: js.Any = js.native
  var _pending: js.Any = js.native
  var _requests: js.Any = js.native
  var _settings: js.Any = js.native
  var _splash: js.Any = js.native
  var _themeChanged: js.Any = js.native
  var _themes: js.Any = js.native
  /**
    * Get the name of the current theme.
    */
  val theme: java.lang.String | scala.Null = js.native
  /**
    * A signal fired when the application theme changes.
    */
  val themeChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    atJupyterlabCoreutilsLib.libInterfacesMod.IChangedArgs[java.lang.String]
  ] = js.native
  /**
    * The names of the registered themes.
    */
  val themes: js.Array[java.lang.String] = js.native
  /**
    * Test whether a given theme is light.
    */
  def isLight(name: java.lang.String): scala.Boolean = js.native
  /**
    * Load a theme CSS file by path.
    *
    * @param path - The path of the file to load.
    */
  def loadCSS(path: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Register a theme with the theme manager.
    *
    * @param theme - The theme to register.
    *
    * @returns A disposable that can be used to unregister the theme.
    */
  def register(theme: atJupyterlabApputilsLib.libThememanagerMod.ThemeManagerNs.ITheme): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
  /**
    * Set the current theme.
    */
  def setTheme(name: java.lang.String): js.Promise[scala.Unit] = js.native
}

