package typings.grpcGrpcJs.xdsClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XdsClusterLocalityStats extends js.Object {
  
  def addCallFinished(fail: Boolean): Unit = js.native
  
  def addCallStarted(): Unit = js.native
}
object XdsClusterLocalityStats {
  
  @scala.inline
  def apply(addCallFinished: Boolean => Unit, addCallStarted: () => Unit): XdsClusterLocalityStats = {
    val __obj = js.Dynamic.literal(addCallFinished = js.Any.fromFunction1(addCallFinished), addCallStarted = js.Any.fromFunction0(addCallStarted))
    __obj.asInstanceOf[XdsClusterLocalityStats]
  }
  
  @scala.inline
  implicit class XdsClusterLocalityStatsOps[Self <: XdsClusterLocalityStats] (val x: Self) extends AnyVal {
    
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
    def setAddCallFinished(value: Boolean => Unit): Self = this.set("addCallFinished", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddCallStarted(value: () => Unit): Self = this.set("addCallStarted", js.Any.fromFunction0(value))
  }
}
