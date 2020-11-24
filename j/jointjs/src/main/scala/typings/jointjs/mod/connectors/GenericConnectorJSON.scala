package typings.jointjs.mod.connectors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericConnectorJSON[K /* <: ConnectorType */] extends js.Object {
  
  var args: js.UndefOr[GenericConnectorArguments[K]] = js.native
  
  var name: K = js.native
}
object GenericConnectorJSON {
  
  @scala.inline
  def apply[K /* <: ConnectorType */](name: K): GenericConnectorJSON[K] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericConnectorJSON[K]]
  }
  
  @scala.inline
  implicit class GenericConnectorJSONOps[Self <: GenericConnectorJSON[_], K /* <: ConnectorType */] (val x: Self with GenericConnectorJSON[K]) extends AnyVal {
    
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
    def setName(value: K): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: GenericConnectorArguments[K]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
  }
}
