package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDataType extends js.Object {
  
  /**
    * A field represents one dimension of a data type.
    */
  var field: js.UndefOr[js.Array[SchemaDataTypeField]] = js.native
  
  /**
    * Each data type has a unique, namespaced, name. All data types in the
    * com.google namespace are shared as part of the platform.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaDataType {
  
  @scala.inline
  def apply(): SchemaDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataType]
  }
  
  @scala.inline
  implicit class SchemaDataTypeOps[Self <: SchemaDataType] (val x: Self) extends AnyVal {
    
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
    def setFieldVarargs(value: SchemaDataTypeField*): Self = this.set("field", js.Array(value :_*))
    
    @scala.inline
    def setField(value: js.Array[SchemaDataTypeField]): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
