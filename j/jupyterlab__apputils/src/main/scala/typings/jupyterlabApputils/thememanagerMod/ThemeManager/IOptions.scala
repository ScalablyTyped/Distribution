package typings.jupyterlabApputils.thememanagerMod.ThemeManager

import typings.jupyterlabApputils.splashMod.ISplashScreen
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to create a theme manager.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The host widget for the theme manager.
    */
  var host: Widget = js.native
  
  /**
    * The setting registry key that holds theme setting data.
    */
  var key: String = js.native
  
  /**
    * The settings registry.
    */
  var settings: ISettingRegistry = js.native
  
  /**
    * The splash screen to show when loading themes.
    */
  var splash: js.UndefOr[ISplashScreen] = js.native
  
  /**
    * The url for local theme loading.
    */
  var url: String = js.native
}
object IOptions {
  
  @scala.inline
  def apply(host: Widget, key: String, settings: ISettingRegistry, url: String): IOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setHost(value: Widget): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: ISettingRegistry): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplash(value: ISplashScreen): Self = this.set("splash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplash: Self = this.set("splash", js.undefined)
  }
}
