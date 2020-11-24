package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorSerialization extends js.Object {
  
  var custom: js.UndefOr[js.Function] = js.native
  
  var entities: js.UndefOr[Boolean] = js.native
  
  var scripts: js.UndefOr[Boolean] = js.native
  
  var semantic: js.UndefOr[Boolean] = js.native
}
object EditorSerialization {
  
  @scala.inline
  def apply(): EditorSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorSerialization]
  }
  
  @scala.inline
  implicit class EditorSerializationOps[Self <: EditorSerialization] (val x: Self) extends AnyVal {
    
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
    def setCustom(value: js.Function): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setEntities(value: Boolean): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    
    @scala.inline
    def setScripts(value: Boolean): Self = this.set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
    
    @scala.inline
    def setSemantic(value: Boolean): Self = this.set("semantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSemantic: Self = this.set("semantic", js.undefined)
  }
}
