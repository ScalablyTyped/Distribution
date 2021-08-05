package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for a module that exports an extension or extensions as
  * the default value.
  */
trait IExtensionModule extends StObject {
  
  /**
    * The default export.
    */
  val default: IExtension | js.Array[IExtension]
}
object IExtensionModule {
  
  inline def apply(default: IExtension | js.Array[IExtension]): IExtensionModule = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtensionModule]
  }
  
  extension [Self <: IExtensionModule](x: Self) {
    
    inline def setDefault(value: IExtension | js.Array[IExtension]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultVarargs(value: IExtension*): Self = StObject.set(x, "default", js.Array(value :_*))
  }
}
