package typings.jestDashHasteDashMap

import org.scalablytyped.runtime.Instantiable1
import typings.atJestTypes.buildConfigMod.Path
import typings.jestDashHasteDashMap.buildModuleMapMod.ModuleMap
import typings.jestDashHasteDashMap.buildModuleMapMod.SerializableModuleMap
import typings.jestDashHasteDashMap.buildModuleMapMod.default
import typings.jestDashHasteDashMap.buildTypesMod.RawModuleMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassHasteModuleMap extends Instantiable1[/* raw */ RawModuleMap, default] {
  var mapFromArrayRecursive: js.Any = js.native
  var mapToArrayRecursive: js.Any = js.native
  def create(rootDir: Path): ModuleMap = js.native
  def fromJSON(serializableModuleMap: SerializableModuleMap): ModuleMap = js.native
}

