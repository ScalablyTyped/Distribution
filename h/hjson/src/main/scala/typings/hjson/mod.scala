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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hjson", "parse")
  @js.native
  def parse(text: String): js.Any = js.native
  @JSImport("hjson", "parse")
  @js.native
  def parse(text: String, options: DeserializeOptions): js.Any = js.native
  
  @JSImport("hjson", "stringify")
  @js.native
  def stringify(value: js.Any): String = js.native
  @JSImport("hjson", "stringify")
  @js.native
  def stringify(value: js.Any, options: SerializeOptions): String = js.native
  
  @js.native
  trait DeserializeOptions extends StObject {
    
    /**
      * keep white space and comments. This is useful if
      * you want to edit an hjson file and save it while preserving comments (default false)
      */
    var keepWsc: js.UndefOr[Boolean] = js.native
    
    /**
      * Turn off legacy support for omitting root braces (defaults true)
      */
    var legacyRoot: js.UndefOr[Boolean] = js.native
  }
  object DeserializeOptions {
    
    @scala.inline
    def apply(): DeserializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeserializeOptions]
    }
    
    @scala.inline
    implicit class DeserializeOptionsMutableBuilder[Self <: DeserializeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeepWsc(value: Boolean): Self = StObject.set(x, "keepWsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepWscUndefined: Self = StObject.set(x, "keepWsc", js.undefined)
      
      @scala.inline
      def setLegacyRoot(value: Boolean): Self = StObject.set(x, "legacyRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegacyRootUndefined: Self = StObject.set(x, "legacyRoot", js.undefined)
    }
  }
  
  @js.native
  trait SerializeOptions extends StObject {
    
    /**
      * makes braces appear on the same line as the key name. Default false.
      */
    var bracesSameLine: js.UndefOr[Boolean] = js.native
    
    /**
      * output ascii color codes
      */
    var colors: js.UndefOr[Boolean] = js.native
    
    /**
      * show braces for the root object. Default true.
      */
    var emitRootBraces: js.UndefOr[Boolean] = js.native
    
    /**
      * specifies the EOL sequence (default is set by Hjson.setEndOfLine())
      */
    var eol: js.UndefOr[String] = js.native
    
    /**
      * keep white space. See parse.
      */
    var keepWsc: js.UndefOr[Boolean] = js.native
    
    /**
      * controls how multiline strings are displayed. (setting quotes implies "off")
      * "std": strings containing \n are shown in multiline format (default)
      * "no-tabs": like std but disallow tabs
      * "off": show in JSON format
      */
    var multiline: js.UndefOr[std | `no-tabs` | off] = js.native
    
    /**
      * controls how strings are displayed. (setting separator implies "strings")
      * "min": no quotes whenever possible (default)
      * "keys": use quotes around keys
      * "strings": use quotes around string values
      * "all": use quotes around keys and string values
      */
    var quotes: js.UndefOr[min | keys | strings | all] = js.native
    
    /**
      * output a comma separator between elements. Default false
      */
    var separator: js.UndefOr[Boolean] = js.native
    
    /**
      * specifies the indentation of nested structures.
      * If it is a number, it will specify the number of spaces to indent at each level.
      * If it is a string (such as '\t' or ' '), it contains the characters used to indent at each level.
      */
    var space: js.UndefOr[Double | String] = js.native
  }
  object SerializeOptions {
    
    @scala.inline
    def apply(): SerializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializeOptions]
    }
    
    @scala.inline
    implicit class SerializeOptionsMutableBuilder[Self <: SerializeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBracesSameLine(value: Boolean): Self = StObject.set(x, "bracesSameLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBracesSameLineUndefined: Self = StObject.set(x, "bracesSameLine", js.undefined)
      
      @scala.inline
      def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setEmitRootBraces(value: Boolean): Self = StObject.set(x, "emitRootBraces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitRootBracesUndefined: Self = StObject.set(x, "emitRootBraces", js.undefined)
      
      @scala.inline
      def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      @scala.inline
      def setKeepWsc(value: Boolean): Self = StObject.set(x, "keepWsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepWscUndefined: Self = StObject.set(x, "keepWsc", js.undefined)
      
      @scala.inline
      def setMultiline(value: std | `no-tabs` | off): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      @scala.inline
      def setQuotes(value: min | keys | strings | all): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      @scala.inline
      def setSeparator(value: Boolean): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setSpace(value: Double | String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
}
