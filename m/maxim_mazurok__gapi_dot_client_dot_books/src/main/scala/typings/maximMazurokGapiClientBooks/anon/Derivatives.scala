package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Derivatives extends StObject {
  
  var derivatives: js.UndefOr[js.Array[Source]] = js.undefined
  
  var examples: js.UndefOr[js.Array[Source]] = js.undefined
  
  var senses: js.UndefOr[js.Array[Conjugations]] = js.undefined
  
  /** The words with different meanings but not related words, e.g. "go" (game) and "go" (verb). */
  var source: js.UndefOr[Attribution] = js.undefined
}
object Derivatives {
  
  inline def apply(): Derivatives = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Derivatives]
  }
  
  extension [Self <: Derivatives](x: Self) {
    
    inline def setDerivatives(value: js.Array[Source]): Self = StObject.set(x, "derivatives", value.asInstanceOf[js.Any])
    
    inline def setDerivativesUndefined: Self = StObject.set(x, "derivatives", js.undefined)
    
    inline def setDerivativesVarargs(value: Source*): Self = StObject.set(x, "derivatives", js.Array(value*))
    
    inline def setExamples(value: js.Array[Source]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setExamplesVarargs(value: Source*): Self = StObject.set(x, "examples", js.Array(value*))
    
    inline def setSenses(value: js.Array[Conjugations]): Self = StObject.set(x, "senses", value.asInstanceOf[js.Any])
    
    inline def setSensesUndefined: Self = StObject.set(x, "senses", js.undefined)
    
    inline def setSensesVarargs(value: Conjugations*): Self = StObject.set(x, "senses", js.Array(value*))
    
    inline def setSource(value: Attribution): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
