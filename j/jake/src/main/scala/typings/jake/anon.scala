package typings.jake

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictname
    extends StObject
       with /* name */ StringDictionary[Any] {
    
    var quiet: Boolean
  }
  object Dictname {
    
    inline def apply(quiet: Boolean): Dictname = {
      val __obj = js.Dynamic.literal(quiet = quiet.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictname]
    }
    
    extension [Self <: Dictname](x: Self) {
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    }
  }
}
