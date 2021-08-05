package typings.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericClientOptions extends StObject {
  
  /**
    * Indicates that the old argument order should be used for methods, with
    * optional arguments at the end instead of the callback at the end. This
    * option is only a temporary stopgap measure to smooth an API breakage.
    * It is deprecated, and new code should not use it.
    */
  var deprecatedArgumentOrder: js.UndefOr[Boolean] = js.undefined
}
object GenericClientOptions {
  
  inline def apply(): GenericClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericClientOptions]
  }
  
  extension [Self <: GenericClientOptions](x: Self) {
    
    inline def setDeprecatedArgumentOrder(value: Boolean): Self = StObject.set(x, "deprecatedArgumentOrder", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedArgumentOrderUndefined: Self = StObject.set(x, "deprecatedArgumentOrder", js.undefined)
  }
}
