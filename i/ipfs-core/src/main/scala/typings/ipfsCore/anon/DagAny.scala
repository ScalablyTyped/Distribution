package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DagAny extends js.Object {
  
  var dag: js.Any = js.native
}
object DagAny {
  
  @scala.inline
  def apply(dag: js.Any): DagAny = {
    val __obj = js.Dynamic.literal(dag = dag.asInstanceOf[js.Any])
    __obj.asInstanceOf[DagAny]
  }
  
  @scala.inline
  implicit class DagAnyOps[Self <: DagAny] (val x: Self) extends AnyVal {
    
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
  }
}
