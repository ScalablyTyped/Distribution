package typings.indefinite

import typings.indefinite.indefiniteStrings.colloquial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(word: String): String = ^.asInstanceOf[js.Dynamic].apply(word.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(word: String, opts: Options): String = (^.asInstanceOf[js.Dynamic].apply(word.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(word: Double): String = ^.asInstanceOf[js.Dynamic].apply(word.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(word: Double, opts: Options): String = (^.asInstanceOf[js.Dynamic].apply(word.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("indefinite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var articleOnly: js.UndefOr[Boolean] = js.undefined
    
    var capitalize: js.UndefOr[Boolean] = js.undefined
    
    var caseInsensitive: js.UndefOr[Boolean] = js.undefined
    
    var numbers: js.UndefOr[colloquial] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setArticleOnly(value: Boolean): Self = StObject.set(x, "articleOnly", value.asInstanceOf[js.Any])
      
      inline def setArticleOnlyUndefined: Self = StObject.set(x, "articleOnly", js.undefined)
      
      inline def setCapitalize(value: Boolean): Self = StObject.set(x, "capitalize", value.asInstanceOf[js.Any])
      
      inline def setCapitalizeUndefined: Self = StObject.set(x, "capitalize", js.undefined)
      
      inline def setCaseInsensitive(value: Boolean): Self = StObject.set(x, "caseInsensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseInsensitiveUndefined: Self = StObject.set(x, "caseInsensitive", js.undefined)
      
      inline def setNumbers(value: colloquial): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
      
      inline def setNumbersUndefined: Self = StObject.set(x, "numbers", js.undefined)
    }
  }
}
