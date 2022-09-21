package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Genericsearchterm extends StObject {
  
  //  Filter parameters
  var generic_search_term: String
}
object Genericsearchterm {
  
  inline def apply(generic_search_term: String): Genericsearchterm = {
    val __obj = js.Dynamic.literal(generic_search_term = generic_search_term.asInstanceOf[js.Any])
    __obj.asInstanceOf[Genericsearchterm]
  }
  
  extension [Self <: Genericsearchterm](x: Self) {
    
    inline def setGeneric_search_term(value: String): Self = StObject.set(x, "generic_search_term", value.asInstanceOf[js.Any])
  }
}
