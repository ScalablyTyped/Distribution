package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Words extends StObject {
  
  /** The source, url and attribution for this dictionary data. */
  var source: js.UndefOr[Attribution] = js.native
  
  var words: js.UndefOr[js.Array[Derivatives]] = js.native
}
object Words {
  
  @scala.inline
  def apply(): Words = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Words]
  }
  
  @scala.inline
  implicit class WordsMutableBuilder[Self <: Words] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Attribution): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setWords(value: js.Array[Derivatives]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    
    @scala.inline
    def setWordsVarargs(value: Derivatives*): Self = StObject.set(x, "words", js.Array(value :_*))
  }
}
