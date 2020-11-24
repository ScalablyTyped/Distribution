package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Level information containing level number and its corresponding name.
  */
@js.native
trait SchemaLevel extends js.Object {
  
  /**
    * Required. A name assigned to this Level, restricted to 3 characters.
    * Consider how the elevator buttons would be labeled for this level if
    * there was an elevator.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Floor number, used for ordering. 0 indicates the ground level, 1
    * indicates the first level above ground level, -1 indicates the first
    * level under ground level. Non-integer values are OK.
    */
  var number: js.UndefOr[Double] = js.native
}
object SchemaLevel {
  
  @scala.inline
  def apply(): SchemaLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLevel]
  }
  
  @scala.inline
  implicit class SchemaLevelOps[Self <: SchemaLevel] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
  }
}
