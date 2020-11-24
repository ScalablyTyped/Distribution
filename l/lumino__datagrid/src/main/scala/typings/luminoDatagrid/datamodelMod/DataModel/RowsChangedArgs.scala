package typings.luminoDatagrid.datamodelMod.DataModel

import typings.luminoDatagrid.luminoDatagridStrings.`rows-inserted`
import typings.luminoDatagrid.luminoDatagridStrings.`rows-removed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An arguments object for the `changed` signal.
  *
  * #### Notes
  * Data models should emit the `changed` signal with this args object
  * type when rows are inserted or removed.
  */
@js.native
trait RowsChangedArgs extends ChangedArgs {
  
  /**
    * The index of the first modified row.
    */
  val index: Double = js.native
  
  /**
    * The region which contains the modified rows.
    */
  val region: RowRegion = js.native
  
  /**
    * The number of modified rows.
    */
  val span: Double = js.native
  
  /**
    * The discriminated type of the args object.
    */
  val `type`: `rows-inserted` | `rows-removed` = js.native
}
object RowsChangedArgs {
  
  @scala.inline
  def apply(index: Double, region: RowRegion, span: Double, `type`: `rows-inserted` | `rows-removed`): RowsChangedArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowsChangedArgs]
  }
  
  @scala.inline
  implicit class RowsChangedArgsOps[Self <: RowsChangedArgs] (val x: Self) extends AnyVal {
    
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
    def setRegion(value: RowRegion): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpan(value: Double): Self = this.set("span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `rows-inserted` | `rows-removed`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
