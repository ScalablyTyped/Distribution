package typings.luminoDatagrid.datamodelMod.DataModel

import typings.luminoDatagrid.luminoDatagridStrings.`rows-moved`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An arguments object for the `changed` signal.
  *
  * #### Notes
  * Data models should emit the `changed` signal with this args object
  * type when rows are moved.
  */
@js.native
trait RowsMovedArgs extends ChangedArgs {
  
  /**
    * The ending index of the first modified row.
    */
  val destination: Double = js.native
  
  /**
    * The starting index of the first modified row.
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
  val `type`: `rows-moved` = js.native
}
object RowsMovedArgs {
  
  @scala.inline
  def apply(destination: Double, index: Double, region: RowRegion, span: Double, `type`: `rows-moved`): RowsMovedArgs = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowsMovedArgs]
  }
  
  @scala.inline
  implicit class RowsMovedArgsOps[Self <: RowsMovedArgs] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: Double): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: RowRegion): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpan(value: Double): Self = this.set("span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `rows-moved`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
