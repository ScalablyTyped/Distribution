package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `StructType` defines the fields of a STRUCT type.
  */
@js.native
trait SchemaStructType extends js.Object {
  
  /**
    * The list of fields that make up this struct. Order is significant,
    * because values of this struct type are represented as lists, where the
    * order of field values matches the order of fields in the StructType. In
    * turn, the order of fields matches the order of columns in a read request,
    * or the order of fields in the `SELECT` clause of a query.
    */
  var fields: js.UndefOr[js.Array[SchemaField]] = js.native
}
object SchemaStructType {
  
  @scala.inline
  def apply(): SchemaStructType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStructType]
  }
  
  @scala.inline
  implicit class SchemaStructTypeOps[Self <: SchemaStructType] (val x: Self) extends AnyVal {
    
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
    def setFieldsVarargs(value: SchemaField*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[SchemaField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
}
