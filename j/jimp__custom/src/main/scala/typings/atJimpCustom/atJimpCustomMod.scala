package typings.atJimpCustom

import typings.atJimpCore.typesEtcMod.Image
import typings.atJimpCore.typesJimpMod.Jimp
import typings.atJimpCore.typesJimpMod.JimpConstructors
import typings.atJimpCore.typesPluginsMod.JimpPlugin
import typings.atJimpCore.typesPluginsMod.JimpType
import typings.atJimpCore.typesUtilsMod.FunctionRet
import typings.atJimpCore.typesUtilsMod.GetIntersectionFromPlugins
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/custom", JSImport.Namespace)
@js.native
object atJimpCustomMod extends js.Object {
  def default[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: Jimp */](configuration: Anon_Plugins[TypesFuncArr, PluginFuncArr]): JimpInstance[TypesFuncArr, PluginFuncArr, J] = js.native
  def default[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: Jimp */](configuration: Anon_Plugins[TypesFuncArr, PluginFuncArr], jimpInstance: J): JimpInstance[TypesFuncArr, PluginFuncArr, J] = js.native
  type JimpInstance[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: Jimp */] = (Exclude[J, js.UndefOr[scala.Nothing]]) with (GetIntersectionFromPlugins[Exclude[TypesFuncArr | PluginFuncArr, js.UndefOr[scala.Nothing]]]) with JimpConstructors
}

