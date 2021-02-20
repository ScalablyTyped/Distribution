package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugOptions extends StObject {
  
  /** If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field. */
  var enableDebugging: js.UndefOr[Boolean] = js.native
}
object DebugOptions {
  
  @scala.inline
  def apply(): DebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugOptions]
  }
  
  @scala.inline
  implicit class DebugOptionsMutableBuilder[Self <: DebugOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableDebugging(value: Boolean): Self = StObject.set(x, "enableDebugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDebuggingUndefined: Self = StObject.set(x, "enableDebugging", js.undefined)
  }
}
