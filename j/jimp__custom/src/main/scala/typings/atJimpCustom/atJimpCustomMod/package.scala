package typings.atJimpCustom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atJimpCustomMod {
  import typings.atJimpCore.typesEtcMod.Image
  import typings.atJimpCore.typesJimpMod.Jimp
  import typings.atJimpCore.typesJimpMod.JimpConstructors
  import typings.atJimpCore.typesPluginsMod.JimpPlugin
  import typings.atJimpCore.typesPluginsMod.JimpType
  import typings.atJimpCore.typesUtilsMod.FunctionRet
  import typings.atJimpCore.typesUtilsMod.GetIntersectionFromPlugins
  import typings.std.Exclude

  type JimpInstance[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: Jimp */] = (Exclude[J, js.UndefOr[scala.Nothing]]) with (GetIntersectionFromPlugins[Exclude[TypesFuncArr | PluginFuncArr, js.UndefOr[scala.Nothing]]]) with JimpConstructors
}
