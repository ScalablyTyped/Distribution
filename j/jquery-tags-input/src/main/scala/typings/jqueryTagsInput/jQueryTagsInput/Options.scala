package typings.jqueryTagsInput.jQueryTagsInput

import typings.jqueryTagsInput.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Autocomplete options
    */
  var autocomplete: js.UndefOr[js.Object] = js.native
  
  /**
    * Url for autocomplete
    */
  var autocomplete_url: js.UndefOr[String] = js.native
  
  /**
    * Placeholder of field when tags is empty
    */
  var defaultText: js.UndefOr[String] = js.native
  
  /**
    * Delimiters on tags creation
    */
  var delimiter: js.UndefOr[js.Array[String] | String] = js.native
  
  /**
    * Height of tag
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * Interactive tags
    */
  var interactive: js.UndefOr[Boolean] = js.native
  
  /**
    * Max char length for tag
    */
  var maxChars: js.UndefOr[Double] = js.native
  
  /**
    * Minimun char length for tag
    */
  var minChars: js.UndefOr[Double] = js.native
  
  /**
    * Callback function on add tag
    */
  var onAddTag: js.UndefOr[js.Function1[/* addedValue */ String, Unit]] = js.native
  
  /**
    * Callback function on change list of tags
    */
  var onChange: js.UndefOr[js.Function2[/* element */ JQuery, /* changedValue */ String, Unit]] = js.native
  
  /**
    * Callback function on remove tag
    */
  var onRemoveTag: js.UndefOr[js.Function1[/* removedValue */ String, Unit]] = js.native
  
  /**
    * Placeholder color of tags
    */
  var placeholderColor: js.UndefOr[String] = js.native
  
  /**
    * Remove with tag backspace
    */
  var removeWithBackspace: js.UndefOr[Boolean] = js.native
  
  /**
    * Width of tag
    */
  var width: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutocomplete(value: js.Object): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutocomplete: Self = this.set("autocomplete", js.undefined)
    
    @scala.inline
    def setAutocomplete_url(value: String): Self = this.set("autocomplete_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutocomplete_url: Self = this.set("autocomplete_url", js.undefined)
    
    @scala.inline
    def setDefaultText(value: String): Self = this.set("defaultText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultText: Self = this.set("defaultText", js.undefined)
    
    @scala.inline
    def setDelimiterVarargs(value: String*): Self = this.set("delimiter", js.Array(value :_*))
    
    @scala.inline
    def setDelimiter(value: js.Array[String] | String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    
    @scala.inline
    def setMaxChars(value: Double): Self = this.set("maxChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxChars: Self = this.set("maxChars", js.undefined)
    
    @scala.inline
    def setMinChars(value: Double): Self = this.set("minChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinChars: Self = this.set("minChars", js.undefined)
    
    @scala.inline
    def setOnAddTag(value: /* addedValue */ String => Unit): Self = this.set("onAddTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAddTag: Self = this.set("onAddTag", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* element */ JQuery, /* changedValue */ String) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnRemoveTag(value: /* removedValue */ String => Unit): Self = this.set("onRemoveTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRemoveTag: Self = this.set("onRemoveTag", js.undefined)
    
    @scala.inline
    def setPlaceholderColor(value: String): Self = this.set("placeholderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderColor: Self = this.set("placeholderColor", js.undefined)
    
    @scala.inline
    def setRemoveWithBackspace(value: Boolean): Self = this.set("removeWithBackspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveWithBackspace: Self = this.set("removeWithBackspace", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
