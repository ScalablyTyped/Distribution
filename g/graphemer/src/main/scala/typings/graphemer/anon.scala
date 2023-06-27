package typings.graphemer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Done extends StObject {
    
    var done: Boolean
    
    var value: String
  }
  object Done {
    
    inline def apply(done: Boolean, value: String): Done = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Done] (val x: Self) extends AnyVal {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
