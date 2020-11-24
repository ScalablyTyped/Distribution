package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nsecs extends js.Object {
  
  var nsecs: js.Any = js.native
  
  var secs: js.Any = js.native
}
object Nsecs {
  
  @scala.inline
  def apply(nsecs: js.Any, secs: js.Any): Nsecs = {
    val __obj = js.Dynamic.literal(nsecs = nsecs.asInstanceOf[js.Any], secs = secs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nsecs]
  }
  
  @scala.inline
  implicit class NsecsOps[Self <: Nsecs] (val x: Self) extends AnyVal {
    
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
    def setNsecs(value: js.Any): Self = this.set("nsecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecs(value: js.Any): Self = this.set("secs", value.asInstanceOf[js.Any])
  }
}
