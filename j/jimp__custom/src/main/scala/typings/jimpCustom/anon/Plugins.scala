package typings.jimpCustom.anon

import typings.jimpCore.etcMod.Image
import typings.jimpCore.pluginsMod.JimpPlugin
import typings.jimpCore.pluginsMod.JimpType
import typings.jimpCore.utilsMod.FunctionRet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugins[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */] extends js.Object {
  var plugins: js.UndefOr[PluginFuncArr] = js.undefined
  var types: js.UndefOr[TypesFuncArr] = js.undefined
}

object Plugins {
  @scala.inline
  def apply[/* <: js.UndefOr[
  typings.jimpCore.utilsMod.FunctionRet[typings.jimpCore.pluginsMod.JimpType[typings.jimpCore.etcMod.Image]]] */ TypesFuncArr, /* <: js.UndefOr[
  typings.jimpCore.utilsMod.FunctionRet[typings.jimpCore.pluginsMod.JimpPlugin[typings.jimpCore.etcMod.Image]]] */ PluginFuncArr](plugins: PluginFuncArr = null, types: TypesFuncArr = null): Plugins[TypesFuncArr, PluginFuncArr] = {
    val __obj = js.Dynamic.literal()
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugins[TypesFuncArr, PluginFuncArr]]
  }
}

