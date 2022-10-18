package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LimitTerm extends StObject {
  
  // the term with which to search.
  var limit: js.UndefOr[Double] = js.undefined
  
  var term: String
}
object LimitTerm {
  
  inline def apply(term: String): LimitTerm = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitTerm]
  }
  
  extension [Self <: LimitTerm](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
  }
}
