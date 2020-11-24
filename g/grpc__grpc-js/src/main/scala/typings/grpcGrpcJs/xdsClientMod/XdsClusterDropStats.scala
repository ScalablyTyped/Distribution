package typings.grpcGrpcJs.xdsClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XdsClusterDropStats extends js.Object {
  
  def addCallDropped(category: String): Unit = js.native
}
object XdsClusterDropStats {
  
  @scala.inline
  def apply(addCallDropped: String => Unit): XdsClusterDropStats = {
    val __obj = js.Dynamic.literal(addCallDropped = js.Any.fromFunction1(addCallDropped))
    __obj.asInstanceOf[XdsClusterDropStats]
  }
  
  @scala.inline
  implicit class XdsClusterDropStatsOps[Self <: XdsClusterDropStats] (val x: Self) extends AnyVal {
    
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
    def setAddCallDropped(value: String => Unit): Self = this.set("addCallDropped", js.Any.fromFunction1(value))
  }
}
