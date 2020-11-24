package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structured data associated with this message.
  */
@js.native
trait SchemaParameter extends js.Object {
  
  /**
    * Key or name for this parameter.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Value for this parameter.
    */
  var value: js.UndefOr[js.Any] = js.native
}
object SchemaParameter {
  
  @scala.inline
  def apply(): SchemaParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParameter]
  }
  
  @scala.inline
  implicit class SchemaParameterOps[Self <: SchemaParameter] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
