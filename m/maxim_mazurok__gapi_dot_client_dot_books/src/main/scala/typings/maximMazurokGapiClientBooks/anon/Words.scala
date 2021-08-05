package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Words extends StObject {
  
  /** The source, url and attribution for this dictionary data. */
  var source: js.UndefOr[Attribution] = js.undefined
  
  var words: js.UndefOr[js.Array[Derivatives]] = js.undefined
}
object Words {
  
  inline def apply(): Words = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Words]
  }
  
  extension [Self <: Words](x: Self) {
    
    inline def setSource(value: Attribution): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setWords(value: js.Array[Derivatives]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    
    inline def setWordsVarargs(value: Derivatives*): Self = StObject.set(x, "words", js.Array(value :_*))
  }
}
