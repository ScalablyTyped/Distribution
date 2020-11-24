package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodePopulatedEventUIParam extends js.Object {
  
  /**
    * Gets a reference to the bindings object for the level at which the populated node is located.
    */
  var binding: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the node data.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the jQuery element of the node whose children are populated.
    */
  var element: js.UndefOr[String] = js.native
  
  /**
    * Gets the data-path atrribute of the populated node.
    */
  var path: js.UndefOr[String] = js.native
}
object NodePopulatedEventUIParam {
  
  @scala.inline
  def apply(): NodePopulatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodePopulatedEventUIParam]
  }
  
  @scala.inline
  implicit class NodePopulatedEventUIParamOps[Self <: NodePopulatedEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setBinding(value: js.Any): Self = this.set("binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinding: Self = this.set("binding", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
