package typings.jestConfig

import typings.jestTypes.configMod.InitialOptions
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-config/build/readConfigFileAndSetRootDir", JSImport.Namespace)
@js.native
object readConfigFileAndSetRootDirMod extends js.Object {
  def default(configPath: Path): js.Promise[InitialOptions] = js.native
}

