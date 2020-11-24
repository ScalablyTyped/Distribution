package typings.jsforce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtIdField extends js.Object {
  
  var extIdField: js.UndefOr[String] = js.native
}
object ExtIdField {
  
  @scala.inline
  def apply(): ExtIdField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtIdField]
  }
  
  @scala.inline
  implicit class ExtIdFieldOps[Self <: ExtIdField] (val x: Self) extends AnyVal {
    
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
    def setExtIdField(value: String): Self = this.set("extIdField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtIdField: Self = this.set("extIdField", js.undefined)
  }
}
