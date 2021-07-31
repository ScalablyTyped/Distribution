package typings.inversifyDevtools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inversify-devtools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(container: String): ConnectKernel = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(container.asInstanceOf[js.Any]).asInstanceOf[ConnectKernel]
  
  @js.native
  trait ConnectKernel
    extends js.Function {
    
    def apply(
      kernel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify inversify.interfaces.Kernel */ js.Any
    ): Unit = js.native
  }
}
