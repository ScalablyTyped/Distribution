package typings.jsonServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ForeignKeySuffix extends StObject {
    
    var foreignKeySuffix: String
  }
  object ForeignKeySuffix {
    
    inline def apply(foreignKeySuffix: String): ForeignKeySuffix = {
      val __obj = js.Dynamic.literal(foreignKeySuffix = foreignKeySuffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForeignKeySuffix]
    }
    
    extension [Self <: ForeignKeySuffix](x: Self) {
      
      inline def setForeignKeySuffix(value: String): Self = StObject.set(x, "foreignKeySuffix", value.asInstanceOf[js.Any])
    }
  }
}
