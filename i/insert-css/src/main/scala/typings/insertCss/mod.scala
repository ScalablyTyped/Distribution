package typings.insertCss

import typings.std.AddEventListenerOptions
import typings.std.CSSStyleSheet
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import typings.std.HTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("insert-css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def insertCss(css: String): InsertCssStyleElement = ^.asInstanceOf[js.Dynamic].applyDynamic("insertCss")(css.asInstanceOf[js.Any]).asInstanceOf[InsertCssStyleElement]
  @scala.inline
  def insertCss(css: String, options: InsertCssOptions): InsertCssStyleElement = (^.asInstanceOf[js.Dynamic].applyDynamic("insertCss")(css.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[InsertCssStyleElement]
  
  trait InsertCssOptions extends StObject {
    
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    var prepend: js.UndefOr[Boolean] = js.undefined
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
  trait InsertCssStyleElement
    extends StObject
       with HTMLStyleElement {
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    var styleSheet: js.UndefOr[CSSStyleSheet] = js.native
  }
}
