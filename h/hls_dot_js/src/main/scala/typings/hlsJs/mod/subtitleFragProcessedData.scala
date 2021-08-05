package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait subtitleFragProcessedData extends StObject {
  
  var frag: Fragment
  
  var success: Boolean
}
object subtitleFragProcessedData {
  
  inline def apply(frag: Fragment, success: Boolean): subtitleFragProcessedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[subtitleFragProcessedData]
  }
  
  extension [Self <: subtitleFragProcessedData](x: Self) {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
