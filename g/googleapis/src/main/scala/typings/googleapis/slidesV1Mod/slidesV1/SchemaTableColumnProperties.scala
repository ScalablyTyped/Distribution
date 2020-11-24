package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties of each column in a table.
  */
@js.native
trait SchemaTableColumnProperties extends js.Object {
  
  /**
    * Width of a column.
    */
  var columnWidth: js.UndefOr[SchemaDimension] = js.native
}
object SchemaTableColumnProperties {
  
  @scala.inline
  def apply(): SchemaTableColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableColumnProperties]
  }
  
  @scala.inline
  implicit class SchemaTableColumnPropertiesOps[Self <: SchemaTableColumnProperties] (val x: Self) extends AnyVal {
    
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
    def setColumnWidth(value: SchemaDimension): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
  }
}
