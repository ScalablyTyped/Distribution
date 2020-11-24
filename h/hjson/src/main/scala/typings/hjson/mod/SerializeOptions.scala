package typings.hjson.mod

import typings.hjson.hjsonStrings.`no-tabs`
import typings.hjson.hjsonStrings.all
import typings.hjson.hjsonStrings.keys
import typings.hjson.hjsonStrings.min
import typings.hjson.hjsonStrings.off
import typings.hjson.hjsonStrings.std
import typings.hjson.hjsonStrings.strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializeOptions extends js.Object {
  
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
  implicit class SerializeOptionsOps[Self <: SerializeOptions] (val x: Self) extends AnyVal {
    
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
    def setBracesSameLine(value: Boolean): Self = this.set("bracesSameLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBracesSameLine: Self = this.set("bracesSameLine", js.undefined)
    
    @scala.inline
    def setColors(value: Boolean): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setEmitRootBraces(value: Boolean): Self = this.set("emitRootBraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitRootBraces: Self = this.set("emitRootBraces", js.undefined)
    
    @scala.inline
    def setEol(value: String): Self = this.set("eol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEol: Self = this.set("eol", js.undefined)
    
    @scala.inline
    def setKeepWsc(value: Boolean): Self = this.set("keepWsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepWsc: Self = this.set("keepWsc", js.undefined)
    
    @scala.inline
    def setMultiline(value: std | `no-tabs` | off): Self = this.set("multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    
    @scala.inline
    def setQuotes(value: min | keys | strings | all): Self = this.set("quotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotes: Self = this.set("quotes", js.undefined)
    
    @scala.inline
    def setSeparator(value: Boolean): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setSpace(value: Double | String): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
  }
}
