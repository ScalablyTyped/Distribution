package typings.ipfsCore.anon

import typings.ipfsCore.componentsMod.DAG_
import typings.ipfsCore.pinManagerMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DagPinManager extends js.Object {
  
  var dag: DAG_ = js.native
  
  var pinManager: ^ = js.native
}
object DagPinManager {
  
  @scala.inline
  def apply(dag: DAG_, pinManager: ^): DagPinManager = {
    val __obj = js.Dynamic.literal(dag = dag.asInstanceOf[js.Any], pinManager = pinManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[DagPinManager]
  }
  
  @scala.inline
  implicit class DagPinManagerOps[Self <: DagPinManager] (val x: Self) extends AnyVal {
    
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
    def setPinManager(value: ^): Self = this.set("pinManager", value.asInstanceOf[js.Any])
  }
}
