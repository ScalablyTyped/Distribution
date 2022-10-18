package typings.jimpCustom

import typings.jimpCore.typesEtcMod.Image
import typings.jimpCore.typesJimpMod.JimpConstructors
import typings.jimpCore.typesPluginsMod.JimpPlugin
import typings.jimpCore.typesPluginsMod.JimpType
import typings.jimpCore.typesUtilsMod.FunctionRet
import typings.jimpCore.typesUtilsMod.GetIntersectionFromPluginsStatics
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
