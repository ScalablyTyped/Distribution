package typings.libxmljs.anon

import typings.libxmljs.libxmljsStrings.html
import typings.libxmljs.libxmljsStrings.xhtml
import typings.libxmljs.libxmljsStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Declaration extends js.Object {
  
  var declaration: Boolean = js.native
  
  var selfCloseEmpty: Boolean = js.native
  
  var `type`: xml | html | xhtml = js.native
  
  var whitespace: Boolean = js.native
}
object Declaration {
  
  @scala.inline
  def apply(declaration: Boolean, selfCloseEmpty: Boolean, `type`: xml | html | xhtml, whitespace: Boolean): Declaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], selfCloseEmpty = selfCloseEmpty.asInstanceOf[js.Any], whitespace = whitespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  
  @scala.inline
  implicit class DeclarationOps[Self <: Declaration] (val x: Self) extends AnyVal {
    
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
    def setDeclaration(value: Boolean): Self = this.set("declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfCloseEmpty(value: Boolean): Self = this.set("selfCloseEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: xml | html | xhtml): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitespace(value: Boolean): Self = this.set("whitespace", value.asInstanceOf[js.Any])
  }
}
