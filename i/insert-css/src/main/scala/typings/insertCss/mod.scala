package typings.insertCss

import typings.std.CSSStyleSheet
import typings.std.HTMLElement
import typings.std.HTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("insert-css", "insertCss")
  @js.native
  def insertCss(css: String): InsertCssStyleElement = js.native
  @JSImport("insert-css", "insertCss")
  @js.native
  def insertCss(css: String, options: InsertCssOptions): InsertCssStyleElement = js.native
  
  @js.native
  trait InsertCssOptions extends StObject {
    
    var container: js.UndefOr[HTMLElement] = js.native
    
    var prepend: js.UndefOr[Boolean] = js.native
  }
  object InsertCssOptions {
    
    @scala.inline
    def apply(): InsertCssOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InsertCssOptions]
    }
    
    @scala.inline
    implicit class InsertCssOptionsMutableBuilder[Self <: InsertCssOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
    }
  }
  
  @js.native
  trait InsertCssStyleElement extends HTMLStyleElement {
    
    var styleSheet: js.UndefOr[CSSStyleSheet] = js.native
  }
}
