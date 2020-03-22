package typings.jestConfig.mod

import typings.jestTypes.configMod.Argv
import typings.jestTypes.configMod.InitialOptions
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-config", "readConfig")
@js.native
object readConfig extends js.Object {
  def apply(argv: Argv, packageRootOrConfig: InitialOptions): js.Promise[ReadConfig_] = js.native
  def apply(argv: Argv, packageRootOrConfig: InitialOptions, skipArgvConfigOption: Boolean): js.Promise[ReadConfig_] = js.native
  def apply(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigPath: Null,
    projectIndex: Double
  ): js.Promise[ReadConfig_] = js.native
  def apply(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigPath: Path
  ): js.Promise[ReadConfig_] = js.native
  def apply(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigPath: Path,
    projectIndex: Double
  ): js.Promise[ReadConfig_] = js.native
  def apply(argv: Argv, packageRootOrConfig: Path): js.Promise[ReadConfig_] = js.native
  def apply(argv: Argv, packageRootOrConfig: Path, skipArgvConfigOption: Boolean): js.Promise[ReadConfig_] = js.native
  def apply(
    argv: Argv,
    packageRootOrConfig: Path,
    skipArgvConfigOption: Boolean,
    parentConfigPath: Null,
    projectIndex: Double
  ): js.Promise[ReadConfig_] = js.native
  def apply(argv: Argv, packageRootOrConfig: Path, skipArgvConfigOption: Boolean, parentConfigPath: Path): js.Promise[ReadConfig_] = js.native
  def apply(
    argv: Argv,
    packageRootOrConfig: Path,
    skipArgvConfigOption: Boolean,
    parentConfigPath: Path,
    projectIndex: Double
  ): js.Promise[ReadConfig_] = js.native
}

