package typings.jestHasteMap

import org.scalablytyped.runtime.Instantiable1
import typings.jestHasteMap.moduleMapMod.ModuleMap
import typings.jestHasteMap.moduleMapMod.SerializableModuleMap
import typings.jestHasteMap.moduleMapMod.default
import typings.jestHasteMap.typesMod.RawModuleMap
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofHasteModuleMap extends Instantiable1[/* raw */ RawModuleMap, default] {
  var mapFromArrayRecursive: js.Any = js.native
  var mapToArrayRecursive: js.Any = js.native
  def create(rootDir: Path): ModuleMap = js.native
  def fromJSON(serializableModuleMap: SerializableModuleMap): ModuleMap = js.native
}

