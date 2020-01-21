package typings.jupyterlabApputils.thememanagerMod

import typings.jupyterlabApputils.thememanagerMod.ThemeManager.IOptions
import typings.jupyterlabApputils.tokensMod.IThemeManager
import typings.jupyterlabApputils.tokensMod.IThemeManager.ITheme
import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.phosphorDisposable.mod.IDisposable
import typings.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/thememanager", "ThemeManager")
@js.native
class ThemeManager_ protected () extends IThemeManager {
  /**
    * Construct a new theme manager.
    */
  def this(options: IOptions) = this()
  var _base: js.Any = js.native
  var _current: js.Any = js.native
  var _host: js.Any = js.native
  /**
    * Change a font size by a positive or negative increment.
    */
  var _incrFontSize: js.Any = js.native
  /**
    * Initialize the key -> property dict for the overrides
    */
  var _initOverrideProps: js.Any = js.native
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
  var _overrideProps: js.Any = js.native
  var _overrides: js.Any = js.native
  var _pending: js.Any = js.native
  var _requests: js.Any = js.native
  var _settings: js.Any = js.native
  var _splash: js.Any = js.native
  var _themeChanged: js.Any = js.native
  var _themes: js.Any = js.native
  /**
    * Get the name of the current theme.
    */
  /* CompleteClass */
  override val theme: String | Null = js.native
  /**
    * A signal fired when the application theme changes.
    */
  /* CompleteClass */
  override val themeChanged: ISignal[this.type, IChangedArgs[String, String]] = js.native
  /**
    * The names of the registered themes.
    */
  /* CompleteClass */
  override val themes: js.Array[String] = js.native
  /**
    * Decrease a font size w.r.t. its current setting or its value in the
    * current theme.
    *
    * @param key - A Jupyterlab font size CSS variable, without the leading '--jp-'.
    */
  def decrFontSize(key: String): js.Promise[Unit] = js.native
  /**
    * Get the value of a CSS variable from its key.
    *
    * @param key - A Jupyterlab CSS variable, without the leading '--jp-'.
    *
    * @return value - The current value of the Jupyterlab CSS variable
    */
  def getCSS(key: String): String = js.native
  /**
    * Increase a font size w.r.t. its current setting or its value in the
    * current theme.
    *
    * @param key - A Jupyterlab font size CSS variable, without the leading '--jp-'.
    */
  def incrFontSize(key: String): js.Promise[Unit] = js.native
  /**
    * Test whether a given theme is light.
    */
  /* CompleteClass */
  override def isLight(name: String): Boolean = js.native
  /**
    * Test if the user has scrollbar styling enabled.
    */
  def isToggledThemeScrollbars(): Boolean = js.native
  /**
    * Load a theme CSS file by path.
    *
    * @param path - The path of the file to load.
    */
  /* CompleteClass */
  override def loadCSS(path: String): js.Promise[Unit] = js.native
  /**
    * Loads all current CSS overrides from settings. If an override has been
    * removed or is invalid, this function unloads it instead.
    */
  def loadCSSOverrides(): Unit = js.native
  /**
    * Register a theme with the theme manager.
    *
    * @param theme - The theme to register.
    *
    * @returns A disposable that can be used to unregister the theme.
    */
  /* CompleteClass */
  override def register(theme: ITheme): IDisposable = js.native
  /**
    * Add a CSS override to the settings.
    */
  def setCSSOverride(key: String, value: String): js.Promise[Unit] = js.native
  /**
    * Set the current theme.
    */
  /* CompleteClass */
  override def setTheme(name: String): js.Promise[Unit] = js.native
  /**
    * Test whether a given theme styles scrollbars,
    * and if the user has scrollbar styling enabled.
    */
  /* CompleteClass */
  override def themeScrollbars(name: String): Boolean = js.native
  /**
    * Toggle the `theme-scrollbbars` setting.
    */
  def toggleThemeScrollbars(): js.Promise[Unit] = js.native
  /**
    * Validate a CSS value w.r.t. a key
    *
    * @param key - A Jupyterlab CSS variable, without the leading '--jp-'.
    *
    * @param val - A candidate CSS value
    */
  def validateCSS(key: String, `val`: String): Boolean = js.native
}

