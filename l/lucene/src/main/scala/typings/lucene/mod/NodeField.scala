package typings.lucene.mod

import typings.lucene.anon.End
import typings.lucene.luceneStrings.LessthansignimplicitGreaterthansign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeField extends js.Object {
  
  var field: String | LessthansignimplicitGreaterthansign = js.native
  
  var fieldLocation: Null | End = js.native
}
object NodeField {
  
  @scala.inline
  def apply(field: String | LessthansignimplicitGreaterthansign): NodeField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeField]
  }
  
  @scala.inline
  implicit class NodeFieldOps[Self <: NodeField] (val x: Self) extends AnyVal {
    
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
    def setField(value: String | LessthansignimplicitGreaterthansign): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldLocation(value: End): Self = this.set("fieldLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldLocationNull: Self = this.set("fieldLocation", null)
  }
}
