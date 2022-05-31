package typings.jsonPatchGen

import typings.jsonPatchGen.mod.JsonPatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def diff(): js.Array[JsonPatch] = js.Dynamic.global.applyDynamic("diff")().asInstanceOf[js.Array[JsonPatch]]
  inline def diff(obj1: js.Object): js.Array[JsonPatch] = js.Dynamic.global.applyDynamic("diff")(obj1.asInstanceOf[js.Any]).asInstanceOf[js.Array[JsonPatch]]
  inline def diff(obj1: js.Object, obj2: js.Object): js.Array[JsonPatch] = (js.Dynamic.global.applyDynamic("diff")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[js.Array[JsonPatch]]
  inline def diff(obj1: Null, obj2: js.Object): js.Array[JsonPatch] = (js.Dynamic.global.applyDynamic("diff")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[js.Array[JsonPatch]]
}
