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
    
    extension [Self <: Plurals](x: Self) {
      
      inline def setPlurals(value: Any): Self = StObject.set(x, "plurals", value.asInstanceOf[js.Any])
    }
  }
}
