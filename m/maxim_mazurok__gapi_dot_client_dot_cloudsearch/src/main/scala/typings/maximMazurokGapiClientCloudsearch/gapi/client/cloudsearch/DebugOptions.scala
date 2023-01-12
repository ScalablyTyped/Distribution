package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugOptions extends StObject {
  
  /** If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field. */
  var enableDebugging: js.UndefOr[Boolean] = js.undefined
}
object DebugOptions {
  
  inline def apply(): DebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DebugOptions] (val x: Self) extends AnyVal {
    
    inline def setEnableDebugging(value: Boolean): Self = StObject.set(x, "enableDebugging", value.asInstanceOf[js.Any])
    
    inline def setEnableDebuggingUndefined: Self = StObject.set(x, "enableDebugging", js.undefined)
  }
}
