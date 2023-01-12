package typings.lestate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Force extends StObject {
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var id: Double
    
    def selector(state: Any): js.Object
  }
  object Force {
    
    inline def apply(id: Double, selector: Any => js.Object): Force = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], selector = js.Any.fromFunction1(selector))
      __obj.asInstanceOf[Force]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Force] (val x: Self) extends AnyVal {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: Any => js.Object): Self = StObject.set(x, "selector", js.Any.fromFunction1(value))
    }
  }
  
  trait Id extends StObject {
    
    var id: Double
  }
  object Id {
    
    inline def apply(id: Double): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait InitialState extends StObject
}
