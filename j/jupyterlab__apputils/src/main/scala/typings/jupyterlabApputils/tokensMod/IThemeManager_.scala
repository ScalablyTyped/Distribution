package typings.jupyterlabApputils.tokensMod

import typings.jupyterlabApputils.tokensMod.IThemeManager.ITheme
import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThemeManager_ extends js.Object {
  
  /**
    * Test whether a given theme is light.
    */
  def isLight(name: String): Boolean = js.native
  
  /**
    * Load a theme CSS file by path.
    *
    * @param path - The path of the file to load.
    */
  def loadCSS(path: String): js.Promise[Unit] = js.native
  
  /**
    * Register a theme with the theme manager.
    *
    * @param theme - The theme to register.
    *
    * @returns A disposable that can be used to unregister the theme.
    */
  def register(theme: ITheme): IDisposable = js.native
  
  /**
    * Set the current theme.
    */
  def setTheme(name: String): js.Promise[Unit] = js.native
  
  /**
    * Get the name of the current theme.
    */
  val theme: String | Null = js.native
  
  /**
    * A signal fired when the application theme changes.
    */
  val themeChanged: ISignal[this.type, IChangedArgs[String, String | Null, String]] = js.native
  
  /**
    * Test whether a given theme styles scrollbars,
    * and if the user has scrollbar styling enabled.
    */
  def themeScrollbars(name: String): Boolean = js.native
  
  /**
    * The names of the registered themes.
    */
  val themes: js.Array[String] = js.native
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
    themes: js.Array[String]
  ): IThemeManager_ = {
    val __obj = js.Dynamic.literal(isLight = js.Any.fromFunction1(isLight), loadCSS = js.Any.fromFunction1(loadCSS), register = js.Any.fromFunction1(register), setTheme = js.Any.fromFunction1(setTheme), themeChanged = themeChanged.asInstanceOf[js.Any], themeScrollbars = js.Any.fromFunction1(themeScrollbars), themes = themes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeManager_]
  }
  
  @scala.inline
  implicit class IThemeManager_Ops[Self <: IThemeManager_] (val x: Self) extends AnyVal {
    
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
    def setIsLight(value: String => Boolean): Self = this.set("isLight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadCSS(value: String => js.Promise[Unit]): Self = this.set("loadCSS", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegister(value: ITheme => IDisposable): Self = this.set("register", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTheme(value: String => js.Promise[Unit]): Self = this.set("setTheme", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThemeChanged(value: ISignal[IThemeManager_, IChangedArgs[String, String | Null, String]]): Self = this.set("themeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeScrollbars(value: String => Boolean): Self = this.set("themeScrollbars", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThemesVarargs(value: String*): Self = this.set("themes", js.Array(value :_*))
    
    @scala.inline
    def setThemes(value: js.Array[String]): Self = this.set("themes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeNull: Self = this.set("theme", null)
  }
}
