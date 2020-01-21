package typings.jestHasteMap.moduleMapMod

import org.scalablytyped.runtime.Instantiable4
import typings.jestHasteMap.typesMod.DuplicatesSet
import typings.jestHasteMap.typesMod.RawModuleMap
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-haste-map/build/ModuleMap", JSImport.Default)
@js.native
class default protected () extends ModuleMap {
  def this(raw: RawModuleMap) = this()
}

/* static members */
@JSImport("jest-haste-map/build/ModuleMap", JSImport.Default)
@js.native
object default extends js.Object {
  var DuplicateHasteCandidatesError: Instantiable4[
    /* name */ String, 
    /* platform */ String, 
    /* supportsNativePlatform */ Boolean, 
    /* duplicatesSet */ DuplicatesSet, 
    typings.jestHasteMap.moduleMapMod.DuplicateHasteCandidatesError
  ] = js.native
  var mapFromArrayRecursive: js.Any = js.native
  var mapToArrayRecursive: js.Any = js.native
  def create(rootDir: Path): ModuleMap = js.native
  def fromJSON(serializableModuleMap: SerializableModuleMap): ModuleMap = js.native
}

