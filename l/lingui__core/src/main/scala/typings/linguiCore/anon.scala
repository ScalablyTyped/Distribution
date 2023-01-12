package typings.linguiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Plurals extends StObject {
    
    var plurals: Any
  }
  object Plurals {
    
    inline def apply(plurals: Any): Plurals = {
      val __obj = js.Dynamic.literal(plurals = plurals.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plurals]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Plurals] (val x: Self) extends AnyVal {
      
      inline def setPlurals(value: Any): Self = StObject.set(x, "plurals", value.asInstanceOf[js.Any])
    }
  }
}
