package typings.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Begin extends StObject {
    
    var begin: Double
    
    var cueType: String
    
    var text: String
  }
  object Begin {
    
    inline def apply(begin: Double, cueType: String, text: String): Begin = {
      val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], cueType = cueType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Begin]
    }
    
    extension [Self <: Begin](x: Self) {
      
      inline def setBegin(value: Double): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      inline def setCueType(value: String): Self = StObject.set(x, "cueType", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
