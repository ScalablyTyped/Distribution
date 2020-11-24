package typings.luminoDatagrid.selectionmodelMod.SelectionModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A type alias for a selection in a selection model.
  */
@js.native
trait Selection extends js.Object {
  
  /**
    * The first column of the selection.
    *
    * This may be greater than `c2`.
    */
  val c1: Double = js.native
  
  /**
    * The last column of the selection.
    *
    * This may be less than `c1`.
    */
  val c2: Double = js.native
  
  /**
    * The first row of the selection.
    *
    * This may be greater than `r2`.
    */
  val r1: Double = js.native
  
  /**
    * The last row of the selection.
    *
    * This may be less than `r1`.
    */
  val r2: Double = js.native
}
object Selection {
  
  @scala.inline
  def apply(c1: Double, c2: Double, r1: Double, r2: Double): Selection = {
    val __obj = js.Dynamic.literal(c1 = c1.asInstanceOf[js.Any], c2 = c2.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  
  @scala.inline
  implicit class SelectionOps[Self <: Selection] (val x: Self) extends AnyVal {
    
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
    def setC1(value: Double): Self = this.set("c1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC2(value: Double): Self = this.set("c2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR1(value: Double): Self = this.set("r1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR2(value: Double): Self = this.set("r2", value.asInstanceOf[js.Any])
  }
}
