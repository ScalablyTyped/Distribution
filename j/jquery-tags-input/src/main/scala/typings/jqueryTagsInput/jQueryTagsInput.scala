package typings.jqueryTagsInput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jQueryTagsInput {
  
  trait Options extends StObject {
    
    /**
      * Autocomplete options
      */
    var autocomplete: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Url for autocomplete
      */
    var autocomplete_url: js.UndefOr[String] = js.undefined
    
    /**
      * Placeholder of field when tags is empty
      */
    var defaultText: js.UndefOr[String] = js.undefined
    
    /**
      * Delimiters on tags creation
      */
    var delimiter: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /**
      * Height of tag
      */
    var height: js.UndefOr[String] = js.undefined
    
    /**
      * Interactive tags
      */
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Max char length for tag
      */
    var maxChars: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimun char length for tag
      */
    var minChars: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback function on add tag
      */
    var onAddTag: js.UndefOr[js.Function1[/* addedValue */ String, Unit]] = js.undefined
    
    /**
      * Callback function on change list of tags
      */
    var onChange: js.UndefOr[js.Function2[/* element */ JQuery, /* changedValue */ String, Unit]] = js.undefined
    
    /**
      * Callback function on remove tag
      */
    var onRemoveTag: js.UndefOr[js.Function1[/* removedValue */ String, Unit]] = js.undefined
    
    /**
      * Placeholder color of tags
      */
    var placeholderColor: js.UndefOr[String] = js.undefined
    
    /**
      * Remove with tag backspace
      */
    var removeWithBackspace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Width of tag
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAutocomplete(value: js.Object): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setAutocomplete_url(value: String): Self = StObject.set(x, "autocomplete_url", value.asInstanceOf[js.Any])
      
      inline def setAutocomplete_urlUndefined: Self = StObject.set(x, "autocomplete_url", js.undefined)
      
      inline def setDefaultText(value: String): Self = StObject.set(x, "defaultText", value.asInstanceOf[js.Any])
      
      inline def setDefaultTextUndefined: Self = StObject.set(x, "defaultText", js.undefined)
      
      inline def setDelimiter(value: js.Array[String] | String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setDelimiterVarargs(value: String*): Self = StObject.set(x, "delimiter", js.Array(value*))
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setMaxChars(value: Double): Self = StObject.set(x, "maxChars", value.asInstanceOf[js.Any])
      
      inline def setMaxCharsUndefined: Self = StObject.set(x, "maxChars", js.undefined)
      
      inline def setMinChars(value: Double): Self = StObject.set(x, "minChars", value.asInstanceOf[js.Any])
      
      inline def setMinCharsUndefined: Self = StObject.set(x, "minChars", js.undefined)
      
      inline def setOnAddTag(value: /* addedValue */ String => Unit): Self = StObject.set(x, "onAddTag", js.Any.fromFunction1(value))
      
      inline def setOnAddTagUndefined: Self = StObject.set(x, "onAddTag", js.undefined)
      
      inline def setOnChange(value: (/* element */ JQuery, /* changedValue */ String) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnRemoveTag(value: /* removedValue */ String => Unit): Self = StObject.set(x, "onRemoveTag", js.Any.fromFunction1(value))
      
      inline def setOnRemoveTagUndefined: Self = StObject.set(x, "onRemoveTag", js.undefined)
      
      inline def setPlaceholderColor(value: String): Self = StObject.set(x, "placeholderColor", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderColorUndefined: Self = StObject.set(x, "placeholderColor", js.undefined)
      
      inline def setRemoveWithBackspace(value: Boolean): Self = StObject.set(x, "removeWithBackspace", value.asInstanceOf[js.Any])
      
      inline def setRemoveWithBackspaceUndefined: Self = StObject.set(x, "removeWithBackspace", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
