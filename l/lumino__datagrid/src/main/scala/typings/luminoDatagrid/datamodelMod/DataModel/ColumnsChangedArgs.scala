package typings.luminoDatagrid.datamodelMod.DataModel

import typings.luminoDatagrid.luminoDatagridStrings.`columns-inserted`
import typings.luminoDatagrid.luminoDatagridStrings.`columns-removed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An arguments object for the `changed` signal.
  *
  * #### Notes
  * Data models should emit the `changed` signal with this args object
  * type when columns are inserted or removed.
  */
@js.native
trait ColumnsChangedArgs extends ChangedArgs {
  
  /**
    * The index of the first modified column.
    */
  val index: Double = js.native
  
  /**
    * The region which contains the modified columns.
    */
  val region: ColumnRegion = js.native
  
  /**
    * The number of modified columns.
    */
  val span: Double = js.native
  
  /**
    * The discriminated type of the args object.
    */
  val `type`: `columns-inserted` | `columns-removed` = js.native
}
object ColumnsChangedArgs {
  
  @scala.inline
  def apply(index: Double, region: ColumnRegion, span: Double, `type`: `columns-inserted` | `columns-removed`): ColumnsChangedArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsChangedArgs]
  }
  
  @scala.inline
  implicit class ColumnsChangedArgsOps[Self <: ColumnsChangedArgs] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: ColumnRegion): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpan(value: Double): Self = this.set("span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `columns-inserted` | `columns-removed`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
