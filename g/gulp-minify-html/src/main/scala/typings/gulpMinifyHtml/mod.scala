package typings.gulpMinifyHtml

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-minify-html", JSImport.Namespace)
  @js.native
  def apply(): ReadWriteStream = js.native
  @JSImport("gulp-minify-html", JSImport.Namespace)
  @js.native
  def apply(options: Options): ReadWriteStream = js.native
  
  // Options from https://github.com/Swaagie/minimize#options
  @js.native
  trait Options extends StObject {
    
    // Do not strip CDATA from scripts
    var cdata: js.UndefOr[Boolean] = js.native
    
    // Do not remove comments
    var comments: js.UndefOr[Boolean] = js.native
    
    // Do not remove conditional internet explorer comments
    var conditionals: js.UndefOr[Boolean] = js.native
    
    // Do not remove empty attributes
    var empty: js.UndefOr[Boolean] = js.native
    
    // Preserve one whitespace
    var loose: js.UndefOr[Boolean] = js.native
    
    // Do not remove arbitrary quotes
    var quotes: js.UndefOr[Boolean] = js.native
    
    // Do not remove redundant attributes
    var spare: js.UndefOr[Boolean] = js.native
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
      def setCdata(value: Boolean): Self = StObject.set(x, "cdata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCdataUndefined: Self = StObject.set(x, "cdata", js.undefined)
      
      @scala.inline
      def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setConditionals(value: Boolean): Self = StObject.set(x, "conditionals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionalsUndefined: Self = StObject.set(x, "conditionals", js.undefined)
      
      @scala.inline
      def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      @scala.inline
      def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
      
      @scala.inline
      def setQuotes(value: Boolean): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      @scala.inline
      def setSpare(value: Boolean): Self = StObject.set(x, "spare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpareUndefined: Self = StObject.set(x, "spare", js.undefined)
    }
  }
}
