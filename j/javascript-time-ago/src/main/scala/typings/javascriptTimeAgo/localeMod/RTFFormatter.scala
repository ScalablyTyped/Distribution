package typings.javascriptTimeAgo.localeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTFFormatter extends js.Object {
  
  var locale: String = js.native
  
  var localeMatcher: String = js.native
  
  var numberFormat: StringDictionary[js.Any] = js.native
  
  var numeric: String = js.native
  
  var style: DefaultFormats = js.native
}
object RTFFormatter {
  
  @scala.inline
  def apply(
    locale: String,
    localeMatcher: String,
    numberFormat: StringDictionary[js.Any],
    numeric: String,
    style: DefaultFormats
  ): RTFFormatter = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], localeMatcher = localeMatcher.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTFFormatter]
  }
  
  @scala.inline
  implicit class RTFFormatterOps[Self <: RTFFormatter] (val x: Self) extends AnyVal {
    
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
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleMatcher(value: String): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormat(value: StringDictionary[js.Any]): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumeric(value: String): Self = this.set("numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: DefaultFormats): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
