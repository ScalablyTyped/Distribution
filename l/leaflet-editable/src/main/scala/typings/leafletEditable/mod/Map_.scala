package typings.leafletEditable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map_ extends js.Object {
  
  /**
    * Options to pass to L.Editable when instanciating.
    */
  var editOptions: EditOptions = js.native
  
  /**
    * L.Editable plugin instance.
    */
  var editTools: Editable = js.native
  
  /**
    * Whether to create a L.Editable instance at map init or not.
    */
  var editable: Boolean = js.native
}
object Map_ {
  
  @scala.inline
  def apply(editOptions: EditOptions, editTools: Editable, editable: Boolean): Map_ = {
    val __obj = js.Dynamic.literal(editOptions = editOptions.asInstanceOf[js.Any], editTools = editTools.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map_]
  }
  
  @scala.inline
  implicit class Map_Ops[Self <: Map_] (val x: Self) extends AnyVal {
    
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
    def setEditOptions(value: EditOptions): Self = this.set("editOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditTools(value: Editable): Self = this.set("editTools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
  }
}
