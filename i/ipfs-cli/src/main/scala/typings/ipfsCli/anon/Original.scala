package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Original extends StObject {
  
  var original: js.Any
  
  var updated: js.Any
}
object Original {
  
  inline def apply(original: js.Any, updated: js.Any): Original = {
    val __obj = js.Dynamic.literal(original = original.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Original]
  }
  
  extension [Self <: Original](x: Self) {
    
    inline def setOriginal(value: js.Any): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: js.Any): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
