package typings.jimpCustom

import typings.jimpCore.etcMod.Image
import typings.jimpCore.pluginsMod.JimpPlugin
import typings.jimpCore.pluginsMod.JimpType
import typings.jimpCore.utilsMod.FunctionRet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Plugins[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */] extends StObject {
    
    var plugins: js.UndefOr[PluginFuncArr] = js.undefined
    
    var types: js.UndefOr[TypesFuncArr] = js.undefined
  }
  object Plugins {
    
    @scala.inline
    def apply[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */](): Plugins[TypesFuncArr, PluginFuncArr] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plugins[TypesFuncArr, PluginFuncArr]]
    }
    
    @scala.inline
    implicit class PluginsMutableBuilder[Self <: Plugins[?, ?], TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */] (val x: Self & (Plugins[TypesFuncArr, PluginFuncArr])) extends AnyVal {
      
      @scala.inline
      def setPlugins(value: PluginFuncArr): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setTypes(value: TypesFuncArr): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    }
  }
}
