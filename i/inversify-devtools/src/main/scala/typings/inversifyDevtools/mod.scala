package typings.inversifyDevtools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inversify-devtools", JSImport.Default)
  @js.native
  def default(container: String): ConnectKernel = js.native
  
  @js.native
  trait ConnectKernel
    extends js.Function {
    
    def apply(
      kernel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify inversify.interfaces.Kernel */ js.Any
    ): Unit = js.native
  }
}
