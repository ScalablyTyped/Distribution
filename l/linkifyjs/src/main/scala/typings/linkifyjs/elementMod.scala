package typings.linkifyjs

import typings.linkifyjs.anon.PartialGlobalEventHandler
import typings.linkifyjs.mod.LinkEntityType
import typings.std.HTMLDocument
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementMod {
  
  @JSImport("linkifyjs/element", JSImport.Default)
  @js.native
  def default(element: HTMLElement): HTMLElement = js.native
  @JSImport("linkifyjs/element", JSImport.Default)
  @js.native
  def default(element: HTMLElement, options: js.UndefOr[scala.Nothing], doc: HTMLDocument): HTMLElement = js.native
  @JSImport("linkifyjs/element", JSImport.Default)
  @js.native
  def default(element: HTMLElement, options: Options): HTMLElement = js.native
  @JSImport("linkifyjs/element", JSImport.Default)
  @js.native
  def default(element: HTMLElement, options: Options, doc: HTMLDocument): HTMLElement = js.native
  
  @js.native
  trait Options
    extends typings.linkifyjs.mod.Options {
    
    /**
      * Add event listeners to newly created link elements.
      * Takes a hash where each key is an standard event name and the value is an event handler.
      *
      * Also accepts a function that takes the unformatted href and the link type (e.g., 'url', 'email', etc.) and returns the hash.
      *
      * @default null
      */
    var events: js.UndefOr[
        PartialGlobalEventHandler | (js.Function2[/* href */ String, /* type */ LinkEntityType, PartialGlobalEventHandler])
      ] = js.native
    
    /**
      *  Prevent linkify from trying to parse links in the specified tags.
      *
      *  This is useful when running linkify on arbitrary HTML.
      *
      *  @default []
      */
    var ignoreTags: js.UndefOr[js.Array[String]] = js.native
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
      def setEvents(
        value: PartialGlobalEventHandler | (js.Function2[/* href */ String, /* type */ LinkEntityType, PartialGlobalEventHandler])
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsFunction2(value: (/* href */ String, /* type */ LinkEntityType) => PartialGlobalEventHandler): Self = StObject.set(x, "events", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setIgnoreTags(value: js.Array[String]): Self = StObject.set(x, "ignoreTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreTagsUndefined: Self = StObject.set(x, "ignoreTags", js.undefined)
      
      @scala.inline
      def setIgnoreTagsVarargs(value: String*): Self = StObject.set(x, "ignoreTags", js.Array(value :_*))
    }
  }
}
