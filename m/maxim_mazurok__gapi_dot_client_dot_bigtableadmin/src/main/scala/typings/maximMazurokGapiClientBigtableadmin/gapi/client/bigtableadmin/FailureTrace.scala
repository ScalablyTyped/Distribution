package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailureTrace extends StObject {
  
  var frames: js.UndefOr[js.Array[Frame]] = js.undefined
}
object FailureTrace {
  
  inline def apply(): FailureTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureTrace]
  }
  
  extension [Self <: FailureTrace](x: Self) {
    
    inline def setFrames(value: js.Array[Frame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    inline def setFramesVarargs(value: Frame*): Self = StObject.set(x, "frames", js.Array(value :_*))
  }
}
