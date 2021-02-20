package typings.indefinite

import typings.indefinite.indefiniteStrings.colloquial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("indefinite", JSImport.Namespace)
  @js.native
  def apply(word: String): String = js.native
  @JSImport("indefinite", JSImport.Namespace)
  @js.native
  def apply(word: String, opts: Options): String = js.native
  @JSImport("indefinite", JSImport.Namespace)
  @js.native
  def apply(word: Double): String = js.native
  @JSImport("indefinite", JSImport.Namespace)
  @js.native
  def apply(word: Double, opts: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    var articleOnly: js.UndefOr[Boolean] = js.native
    
    var capitalize: js.UndefOr[Boolean] = js.native
    
    var caseInsensitive: js.UndefOr[Boolean] = js.native
    
    var numbers: js.UndefOr[colloquial] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArticleOnly(value: Boolean): Self = StObject.set(x, "articleOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArticleOnlyUndefined: Self = StObject.set(x, "articleOnly", js.undefined)
      
      @scala.inline
      def setCapitalize(value: Boolean): Self = StObject.set(x, "capitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapitalizeUndefined: Self = StObject.set(x, "capitalize", js.undefined)
      
      @scala.inline
      def setCaseInsensitive(value: Boolean): Self = StObject.set(x, "caseInsensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseInsensitiveUndefined: Self = StObject.set(x, "caseInsensitive", js.undefined)
      
      @scala.inline
      def setNumbers(value: colloquial): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumbersUndefined: Self = StObject.set(x, "numbers", js.undefined)
    }
  }
}
