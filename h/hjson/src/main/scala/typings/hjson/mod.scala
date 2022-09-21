package typings.hjson

import typings.hjson.hjsonStrings.`no-tabs`
import typings.hjson.hjsonStrings.all
import typings.hjson.hjsonStrings.keys
import typings.hjson.hjsonStrings.min
import typings.hjson.hjsonStrings.off
import typings.hjson.hjsonStrings.std
import typings.hjson.hjsonStrings.strings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hjson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(text: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parse(text: String, options: DeserializeOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(value: Any, options: SerializeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait DeserializeOptions extends StObject {
    
    /**
      * keep white space and comments. This is useful if
      * you want to edit an hjson file and save it while preserving comments (default false)
      */
    var keepWsc: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Turn off legacy support for omitting root braces (defaults true)
      */
    var legacyRoot: js.UndefOr[Boolean] = js.undefined
  }
  object DeserializeOptions {
    
    inline def apply(): DeserializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeserializeOptions]
    }
    
    extension [Self <: DeserializeOptions](x: Self) {
      
      inline def setKeepWsc(value: Boolean): Self = StObject.set(x, "keepWsc", value.asInstanceOf[js.Any])
      
      inline def setKeepWscUndefined: Self = StObject.set(x, "keepWsc", js.undefined)
      
      inline def setLegacyRoot(value: Boolean): Self = StObject.set(x, "legacyRoot", value.asInstanceOf[js.Any])
      
      inline def setLegacyRootUndefined: Self = StObject.set(x, "legacyRoot", js.undefined)
    }
  }
  
  trait SerializeOptions extends StObject {
    
    /**
      * makes braces appear on the same line as the key name. Default false.
      */
    var bracesSameLine: js.UndefOr[Boolean] = js.undefined
    
    /**
      * output ascii color codes
      */
    var colors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * show braces for the root object. Default true.
      */
    var emitRootBraces: js.UndefOr[Boolean] = js.undefined
    
    /**
      * specifies the EOL sequence (default is set by Hjson.setEndOfLine())
      */
    var eol: js.UndefOr[String] = js.undefined
    
    /**
      * keep white space. See parse.
      */
    var keepWsc: js.UndefOr[Boolean] = js.undefined
    
    /**
      * controls how multiline strings are displayed. (setting quotes implies "off")
      * "std": strings containing \n are shown in multiline format (default)
      * "no-tabs": like std but disallow tabs
      * "off": show in JSON format
      */
    var multiline: js.UndefOr[std | `no-tabs` | off] = js.undefined
    
    /**
      * controls how strings are displayed. (setting separator implies "strings")
      * "min": no quotes whenever possible (default)
      * "keys": use quotes around keys
      * "strings": use quotes around string values
      * "all": use quotes around keys and string values
      */
    var quotes: js.UndefOr[min | keys | strings | all] = js.undefined
    
    /**
      * output a comma separator between elements. Default false
      */
    var separator: js.UndefOr[Boolean] = js.undefined
    
    /**
      * specifies the indentation of nested structures.
      * If it is a number, it will specify the number of spaces to indent at each level.
      * If it is a string (such as '\t' or ' '), it contains the characters used to indent at each level.
      */
    var space: js.UndefOr[Double | String] = js.undefined
  }
  object SerializeOptions {
    
    inline def apply(): SerializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializeOptions]
    }
    
    extension [Self <: SerializeOptions](x: Self) {
      
      inline def setBracesSameLine(value: Boolean): Self = StObject.set(x, "bracesSameLine", value.asInstanceOf[js.Any])
      
      inline def setBracesSameLineUndefined: Self = StObject.set(x, "bracesSameLine", js.undefined)
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setEmitRootBraces(value: Boolean): Self = StObject.set(x, "emitRootBraces", value.asInstanceOf[js.Any])
      
      inline def setEmitRootBracesUndefined: Self = StObject.set(x, "emitRootBraces", js.undefined)
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setKeepWsc(value: Boolean): Self = StObject.set(x, "keepWsc", value.asInstanceOf[js.Any])
      
      inline def setKeepWscUndefined: Self = StObject.set(x, "keepWsc", js.undefined)
      
      inline def setMultiline(value: std | `no-tabs` | off): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      inline def setQuotes(value: min | keys | strings | all): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      inline def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      inline def setSeparator(value: Boolean): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSpace(value: Double | String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
}
