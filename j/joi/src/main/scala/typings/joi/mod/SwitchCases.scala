package typings.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchCases extends js.Object {
  
  /**
    * the required condition joi type.
    */
  var is: SchemaLike = js.native
  
  /**
    * the alternative schema type if the condition is true.
    */
  var `then`: SchemaLike = js.native
}
object SwitchCases {
  
  @scala.inline
  def apply(): SwitchCases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchCases]
  }
  
  @scala.inline
  implicit class SwitchCasesOps[Self <: SwitchCases] (val x: Self) extends AnyVal {
    
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
    def setIs(value: SchemaLike): Self = this.set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNull: Self = this.set("is", null)
    
    @scala.inline
    def setThen(value: SchemaLike): Self = this.set("then", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThenNull: Self = this.set("then", null)
  }
}
