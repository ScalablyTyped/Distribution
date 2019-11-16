package typings.jestDashHasteDashMap.buildModuleMapMod

import typings.atJestTypes.buildConfigMod.Path
import typings.jestDashHasteDashMap.buildTypesMod.HTypeValue
import typings.jestDashHasteDashMap.buildTypesMod.RawModuleMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleMap extends js.Object {
  var _assertNoDuplicates: js.Any = js.native
  /**
    * When looking up a module's data, we walk through each eligible platform for
    * the query. For each platform, we want to check if there are known
    * duplicates for that name+platform pair. The duplication logic normally
    * removes elements from the `map` object, but we want to check upfront to be
    * extra sure. If metadata exists both in the `duplicates` object and the
    * `map`, this would be a bug.
    */
  var _getModuleMetadata: js.Any = js.native
  val _raw: js.Any = js.native
  var json: js.Any = js.native
  def getMockModule(name: String): js.UndefOr[Path] = js.native
  def getModule(name: String): Path | Null = js.native
  def getModule(name: String, platform: String): Path | Null = js.native
  def getModule(name: String, platform: String, supportsNativePlatform: Boolean): Path | Null = js.native
  def getModule(name: String, platform: String, supportsNativePlatform: Boolean, `type`: HTypeValue): Path | Null = js.native
  def getModule(name: String, platform: String, supportsNativePlatform: Null, `type`: HTypeValue): Path | Null = js.native
  def getModule(name: String, platform: Null, supportsNativePlatform: Boolean): Path | Null = js.native
  def getModule(name: String, platform: Null, supportsNativePlatform: Boolean, `type`: HTypeValue): Path | Null = js.native
  def getModule(name: String, platform: Null, supportsNativePlatform: Null, `type`: HTypeValue): Path | Null = js.native
  def getPackage(name: String): Path | Null = js.native
  def getPackage(name: String, platform: js.UndefOr[scala.Nothing], _supportsNativePlatform: Boolean): Path | Null = js.native
  def getPackage(name: String, platform: String): Path | Null = js.native
  def getPackage(name: String, platform: String, _supportsNativePlatform: Boolean): Path | Null = js.native
  def getPackage(name: String, platform: Null, _supportsNativePlatform: Boolean): Path | Null = js.native
  def getRawModuleMap(): RawModuleMap = js.native
  def toJSON(): SerializableModuleMap = js.native
}

