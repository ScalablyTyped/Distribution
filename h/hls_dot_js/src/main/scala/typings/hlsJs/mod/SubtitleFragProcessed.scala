package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtitleFragProcessed extends StObject {
  
  var frag: Fragment
  
  var success: Boolean
}
object SubtitleFragProcessed {
  
  inline def apply(frag: Fragment, success: Boolean): SubtitleFragProcessed = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtitleFragProcessed]
  }
  
  extension [Self <: SubtitleFragProcessed](x: Self) {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
