package typings.magicmirrorModule

import typings.magicmirrorModule.Module.ModuleProperties
import typings.magicmirrorModule.magicmirrorModuleNumbers.`12`
import typings.magicmirrorModule.magicmirrorModuleNumbers.`24`
import typings.magicmirrorModule.magicmirrorModuleStrings.imperial
import typings.magicmirrorModule.magicmirrorModuleStrings.metric
import typings.std.NonNullable
import typings.std.Partial
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Module {
    
    @JSGlobal("Module")
    @js.native
    val ^ : js.Any = js.native
    
    /* tslint:disable:no-unnecessary-generics */
    inline def register[T](
      moduleName: String,
      moduleProperties: ThisType[NonNullable[ModuleProperties[T]]] & Partial[ModuleProperties[T]]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(moduleName.asInstanceOf[js.Any], moduleProperties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object config {
    
    @JSGlobal("config")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("config.address")
    @js.native
    def address: String = js.native
    inline def address_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("address")(x.asInstanceOf[js.Any])
    
    @JSGlobal("config.customCss")
    @js.native
    def customCss: String = js.native
    inline def customCss_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customCss")(x.asInstanceOf[js.Any])
    
    @JSGlobal("config.electronOptions")
    @js.native
    def electronOptions: Any = js.native
    inline def electronOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("electronOptions")(x.asInstanceOf[js.Any])
    
    @JSGlobal("config.ipWhitelist")
    @js.native
    def ipWhitelist: js.Array[String] = js.native
    inline def ipWhitelist_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ipWhitelist")(x.asInstanceOf[js.Any])
    
    @JSGlobal("config.language")
    @js.native
    def language: String = js.native
    inline def language_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
    
    @JSGlobal("config.locale")
    @js.native
    def locale: String = js.native
    inline def locale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
    
    @JSGlobal("config.modules")
    @js.native
    def modules: js.Array[Any] = js.native
    inline def modules_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modules")(x.asInstanceOf[js.Any])
    
    @JSGlobal("config.port")
    @js.native
    def port: Double = js.native
    inline def port_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("port")(x.asInstanceOf[js.Any])
    
    @JSGlobal("config.timeFormat")
    @js.native
    def timeFormat: `12` | `24` = js.native
    inline def timeFormat_=(x: `12` | `24`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeFormat")(x.asInstanceOf[js.Any])
    
    @JSGlobal("config.units")
    @js.native
    def units: metric | imperial = js.native
    inline def units_=(x: metric | imperial): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("units")(x.asInstanceOf[js.Any])
    
    @JSGlobal("config.zoom")
    @js.native
    def zoom: Double = js.native
    inline def zoom_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoom")(x.asInstanceOf[js.Any])
  }
}
