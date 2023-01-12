package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomSourceLocation extends StObject {
  
  /** Whether this source is stateful. */
  var stateful: js.UndefOr[Boolean] = js.undefined
}
object CustomSourceLocation {
  
  inline def apply(): CustomSourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomSourceLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomSourceLocation] (val x: Self) extends AnyVal {
    
    inline def setStateful(value: Boolean): Self = StObject.set(x, "stateful", value.asInstanceOf[js.Any])
    
    inline def setStatefulUndefined: Self = StObject.set(x, "stateful", js.undefined)
  }
}
