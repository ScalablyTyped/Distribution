package typings.js2xmlparser.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFormatOptions extends js.Object {
  
  /**
    * Whether double quotes or single quotes should be used in XML attributes.
    * By default, single quotes are used.
    */
  var doubleQuotes: js.UndefOr[Boolean] = js.native
  
  /**
    * The indent string used for pretty-printing. The default indent string is
    * four spaces.
    */
  var indent: js.UndefOr[String] = js.native
  
  /**
    * The newline string used for pretty-printing. The default newline string
    * is "\n".
    */
  var newline: js.UndefOr[String] = js.native
  
  /**
    * Whether pretty-printing is enabled. By default, pretty-printing is
    * enabled.
    */
  var pretty: js.UndefOr[Boolean] = js.native
}
object IFormatOptions {
  
  @scala.inline
  def apply(): IFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormatOptions]
  }
  
  @scala.inline
  implicit class IFormatOptionsOps[Self <: IFormatOptions] (val x: Self) extends AnyVal {
    
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
    def setDoubleQuotes(value: Boolean): Self = this.set("doubleQuotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleQuotes: Self = this.set("doubleQuotes", js.undefined)
    
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setNewline(value: String): Self = this.set("newline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewline: Self = this.set("newline", js.undefined)
    
    @scala.inline
    def setPretty(value: Boolean): Self = this.set("pretty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePretty: Self = this.set("pretty", js.undefined)
  }
}
