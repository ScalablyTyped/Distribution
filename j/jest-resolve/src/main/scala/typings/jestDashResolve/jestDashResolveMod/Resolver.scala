package typings.jestDashResolve.jestDashResolveMod

import typings.atJestTypes.buildConfigMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolver extends js.Object {
  var _getAbsolutePath: js.Any = js.native
  var _getMockPath: js.Any = js.native
  var _getModuleType: js.Any = js.native
  var _getVirtualMockPath: js.Any = js.native
  var _isModuleResolved: js.Any = js.native
  val _moduleIDCache: js.Any = js.native
  val _moduleMap: js.Any = js.native
  val _moduleNameCache: js.Any = js.native
  val _modulePathCache: js.Any = js.native
  val _options: js.Any = js.native
  val _supportsNativePlatform: js.Any = js.native
  def getMockModule(from: Path, name: String): Path | Null = js.native
  def getModule(name: String): Path | Null = js.native
  def getModuleID(virtualMocks: BooleanObject, from: Path): String = js.native
  def getModuleID(virtualMocks: BooleanObject, from: Path, _moduleName: String): String = js.native
  def getModulePath(from: Path, moduleName: String): String = js.native
  def getModulePaths(from: Path): js.Array[Path] = js.native
  def getPackage(name: String): Path | Null = js.native
  def isCoreModule(moduleName: String): Boolean = js.native
  def resolveModule(from: Path, moduleName: String): Path = js.native
  def resolveModule(from: Path, moduleName: String, options: ResolveModuleConfig): Path = js.native
  def resolveModuleFromDirIfExists(dirname: Path, moduleName: String): Path | Null = js.native
  def resolveModuleFromDirIfExists(dirname: Path, moduleName: String, options: ResolveModuleConfig): Path | Null = js.native
  def resolveStubModuleName(from: Path, moduleName: String): Path | Null = js.native
}

