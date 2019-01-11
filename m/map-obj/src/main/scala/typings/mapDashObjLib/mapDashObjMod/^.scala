package typings
package mapDashObjLib.mapDashObjMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("map-obj", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[O /* <: js.Object */, T /* <: java.lang.String */](
    source: O,
    mapper: mapDashObjLib.mapDashObjMod.mapObjNs.Mapper[O, T, _],
    options: mapDashObjLib.mapDashObjMod.mapObjNs.DeepOptions
  ): js.Object = js.native
  def apply[O /* <: js.Object */, T /* <: java.lang.String */, U](source: O, mapper: mapDashObjLib.mapDashObjMod.mapObjNs.Mapper[O, T, U]): mapDashObjLib.mapDashObjLibStrings.namespaced with js.Any = js.native
  def apply[O /* <: js.Object */, T /* <: java.lang.String */, U](
    source: O,
    mapper: mapDashObjLib.mapDashObjMod.mapObjNs.Mapper[O, T, U],
    options: mapDashObjLib.mapDashObjMod.mapObjNs.Options
  ): mapDashObjLib.mapDashObjLibStrings.namespaced with js.Any = js.native
  def apply[O /* <: js.Object */, O2 /* <: js.Object */, T /* <: java.lang.String */, U](
    source: O,
    mapper: mapDashObjLib.mapDashObjMod.mapObjNs.Mapper[O, T, U],
    options: mapDashObjLib.mapDashObjMod.mapObjNs.TargetOptions[O2]
  ): O2 with mapDashObjLib.mapDashObjLibStrings.namespaced with js.Any = js.native
}

