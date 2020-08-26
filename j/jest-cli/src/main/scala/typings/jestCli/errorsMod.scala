package typings.jestCli

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-cli/build/init/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  class MalformedPackageJsonError protected () extends Error {
    def this(packageJsonPath: String) = this()
  }
  
  @js.native
  class NotFoundPackageJsonError protected () extends Error {
    def this(rootDir: String) = this()
  }
  
}

