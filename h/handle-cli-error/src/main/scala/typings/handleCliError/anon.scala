package typings.handleCliError

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<handle-cli-error.handle-cli-error.Options, 'classes'> */
  trait OmitOptionsclasses extends StObject {
    
    var exitCode: js.UndefOr[Double] = js.undefined
    
    var short: js.UndefOr[Boolean] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object OmitOptionsclasses {
    
    inline def apply(): OmitOptionsclasses = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitOptionsclasses]
    }
    
    extension [Self <: OmitOptionsclasses](x: Self) {
      
      inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
      
      inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
      
      inline def setShort(value: Boolean): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
