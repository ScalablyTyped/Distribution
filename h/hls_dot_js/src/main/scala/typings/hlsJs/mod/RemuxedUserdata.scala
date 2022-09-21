package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemuxedUserdata extends StObject {
  
  var samples: js.Array[UserdataSample]
}
object RemuxedUserdata {
  
  inline def apply(samples: js.Array[UserdataSample]): RemuxedUserdata = {
    val __obj = js.Dynamic.literal(samples = samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemuxedUserdata]
  }
  
  extension [Self <: RemuxedUserdata](x: Self) {
    
    inline def setSamples(value: js.Array[UserdataSample]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSamplesVarargs(value: UserdataSample*): Self = StObject.set(x, "samples", js.Array(value*))
  }
}
