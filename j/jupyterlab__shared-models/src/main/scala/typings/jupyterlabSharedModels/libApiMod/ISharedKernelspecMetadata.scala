package typings.jupyterlabSharedModels.libApiMod

import typings.jupyterlabNbformat.mod.IKernelspecMetadata
import typings.luminoDisposable.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISharedKernelspecMetadata
  extends StObject
     with IKernelspecMetadata
     with IDisposable
object ISharedKernelspecMetadata {
  
  inline def apply(display_name: String, dispose: () => Unit, isDisposed: Boolean, name: String): ISharedKernelspecMetadata = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISharedKernelspecMetadata]
  }
}
