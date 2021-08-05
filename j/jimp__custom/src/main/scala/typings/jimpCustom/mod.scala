package typings.jimpCustom

import typings.jimpCore.etcMod.Image
import typings.jimpCore.jimpMod.JimpConstructors
import typings.jimpCore.pluginsMod.JimpPlugin
import typings.jimpCore.pluginsMod.JimpType
import typings.jimpCore.utilsMod.FunctionRet
import typings.jimpCore.utilsMod.GetIntersectionFromPluginsStatics
import typings.jimpCustom.anon.Plugins
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/custom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: JimpConstructors */](configuration: Plugins[TypesFuncArr, PluginFuncArr]): JimpInstance[TypesFuncArr, PluginFuncArr, J] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(configuration.asInstanceOf[js.Any]).asInstanceOf[JimpInstance[TypesFuncArr, PluginFuncArr, J]]
  inline def default[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: JimpConstructors */](configuration: Plugins[TypesFuncArr, PluginFuncArr], jimpInstance: J): JimpInstance[TypesFuncArr, PluginFuncArr, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(configuration.asInstanceOf[js.Any], jimpInstance.asInstanceOf[js.Any])).asInstanceOf[JimpInstance[TypesFuncArr, PluginFuncArr, J]]
  
  type JimpInstance[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: JimpConstructors */] = J & (GetIntersectionFromPluginsStatics[Exclude[TypesFuncArr | PluginFuncArr, Unit]]) & js.Object
}
