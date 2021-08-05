package typings.linkifyjs

import typings.linkifyjs.anon.PartialGlobalEventHandler
import typings.linkifyjs.mod.LinkEntityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlMod {
  
  @JSImport("linkifyjs/html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options
    extends StObject
       with typings.linkifyjs.mod.Options {
    
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
      ] = js.undefined
    
    /**
      *  Prevent linkify from trying to parse links in the specified tags.
      *
      *  This is useful when running linkify on arbitrary HTML.
      *
      *  @default []
      */
    var ignoreTags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEvents(
        value: PartialGlobalEventHandler | (js.Function2[/* href */ String, /* type */ LinkEntityType, PartialGlobalEventHandler])
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsFunction2(value: (/* href */ String, /* type */ LinkEntityType) => PartialGlobalEventHandler): Self = StObject.set(x, "events", js.Any.fromFunction2(value))
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setIgnoreTags(value: js.Array[String]): Self = StObject.set(x, "ignoreTags", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTagsUndefined: Self = StObject.set(x, "ignoreTags", js.undefined)
      
      inline def setIgnoreTagsVarargs(value: String*): Self = StObject.set(x, "ignoreTags", js.Array(value :_*))
    }
  }
}
