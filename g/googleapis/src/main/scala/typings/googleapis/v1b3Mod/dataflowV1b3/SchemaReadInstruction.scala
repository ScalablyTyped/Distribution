package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instruction that reads records. Takes no inputs, produces one output.
  */
@js.native
trait SchemaReadInstruction extends js.Object {
  
  /**
    * The source to read from.
    */
  var source: js.UndefOr[SchemaSource] = js.native
}
object SchemaReadInstruction {
  
  @scala.inline
  def apply(): SchemaReadInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadInstruction]
  }
  
  @scala.inline
  implicit class SchemaReadInstructionOps[Self <: SchemaReadInstruction] (val x: Self) extends AnyVal {
    
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
    def setSource(value: SchemaSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
