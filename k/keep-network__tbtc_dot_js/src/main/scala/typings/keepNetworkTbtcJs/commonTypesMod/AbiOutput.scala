package typings.keepNetworkTbtcJs.commonTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbiOutput extends js.Object {
  
  var components: js.UndefOr[js.Array[AbiOutput]] = js.native
  
  var internalType: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var `type`: String = js.native
}
object AbiOutput {
  
  @scala.inline
  def apply(name: String, `type`: String): AbiOutput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbiOutput]
  }
  
  @scala.inline
  implicit class AbiOutputOps[Self <: AbiOutput] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsVarargs(value: AbiOutput*): Self = this.set("components", js.Array(value :_*))
    
    @scala.inline
    def setComponents(value: js.Array[AbiOutput]): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setInternalType(value: String): Self = this.set("internalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalType: Self = this.set("internalType", js.undefined)
  }
}
