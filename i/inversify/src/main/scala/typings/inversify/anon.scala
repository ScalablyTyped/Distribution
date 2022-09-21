package typings.inversify

import typings.std.NewableFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Constructor extends StObject {
    
    var constructor: NewableFunction
  }
  object Constructor {
    
    inline def apply(constructor: NewableFunction): Constructor = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setConstructor(value: NewableFunction): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String | Null
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal(name = null)
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
    }
  }
}
