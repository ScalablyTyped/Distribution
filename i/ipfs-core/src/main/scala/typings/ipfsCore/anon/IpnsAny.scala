package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpnsAny extends js.Object {
  
  var dag: js.Any = js.native
  
  var ipns: js.Any = js.native
}
object IpnsAny {
  
  @scala.inline
  def apply(dag: js.Any, ipns: js.Any): IpnsAny = {
    val __obj = js.Dynamic.literal(dag = dag.asInstanceOf[js.Any], ipns = ipns.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpnsAny]
  }
  
  @scala.inline
  implicit class IpnsAnyOps[Self <: IpnsAny] (val x: Self) extends AnyVal {
    
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
    def setDag(value: js.Any): Self = this.set("dag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpns(value: js.Any): Self = this.set("ipns", value.asInstanceOf[js.Any])
  }
}
