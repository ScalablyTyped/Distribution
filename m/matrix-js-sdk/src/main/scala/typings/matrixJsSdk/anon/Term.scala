package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Term extends StObject {
  
  // the term to search for
  var filter: js.UndefOr[js.Object] = js.undefined
  
  var term: String
}
object Term {
  
  inline def apply(term: String): Term = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[Term]
  }
  
  extension [Self <: Term](x: Self) {
    
    inline def setFilter(value: js.Object): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
  }
}
