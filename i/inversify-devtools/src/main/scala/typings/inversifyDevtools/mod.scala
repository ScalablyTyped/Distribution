package typings.inversifyDevtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-devtools", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait ConnectKernel
    extends js.Function {
    def apply(
      kernel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify inversify.interfaces.Kernel */ js.Any
    ): Unit = js.native
  }
  
  def default(container: String): ConnectKernel = js.native
}

