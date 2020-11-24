package typings.ipfsCore.anon

import typings.ipfsCore.componentsMod.DAG_
import typings.ipfsCore.ipnsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dag extends js.Object {
  
  var dag: DAG_ = js.native
  
  var ipns: ^ = js.native
  
  def isOnline(): Boolean = js.native
  
  var keychain: js.Any = js.native
  
  var peerId: typings.peerId.mod.^ = js.native
}
object Dag {
  
  @scala.inline
  def apply(dag: DAG_, ipns: ^, isOnline: () => Boolean, keychain: js.Any, peerId: typings.peerId.mod.^): Dag = {
    val __obj = js.Dynamic.literal(dag = dag.asInstanceOf[js.Any], ipns = ipns.asInstanceOf[js.Any], isOnline = js.Any.fromFunction0(isOnline), keychain = keychain.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dag]
  }
  
  @scala.inline
  implicit class DagOps[Self <: Dag] (val x: Self) extends AnyVal {
    
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
    def setDag(value: DAG_): Self = this.set("dag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpns(value: ^): Self = this.set("ipns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOnline(value: () => Boolean): Self = this.set("isOnline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeychain(value: js.Any): Self = this.set("keychain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerId(value: typings.peerId.mod.^): Self = this.set("peerId", value.asInstanceOf[js.Any])
  }
}
