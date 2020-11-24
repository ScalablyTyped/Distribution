package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Multiaddrs extends js.Object {
  
  var multiaddrs: js.Any = js.native
}
object Multiaddrs {
  
  @scala.inline
  def apply(multiaddrs: js.Any): Multiaddrs = {
    val __obj = js.Dynamic.literal(multiaddrs = multiaddrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multiaddrs]
  }
  
  @scala.inline
  implicit class MultiaddrsOps[Self <: Multiaddrs] (val x: Self) extends AnyVal {
    
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
    def setMultiaddrs(value: js.Any): Self = this.set("multiaddrs", value.asInstanceOf[js.Any])
  }
}
