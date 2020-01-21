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
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class NotFoundPackageJsonError protected () extends Error {
    def this(rootDir: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

