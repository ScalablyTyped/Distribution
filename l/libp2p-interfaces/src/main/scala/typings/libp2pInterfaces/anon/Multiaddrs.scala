package typings.libp2pInterfaces.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Multiaddrs extends js.Object {
  
  var id: js.Any = js.native
  
  var multiaddrs: js.Array[_] = js.native
  
  var protocols: js.Array[String] = js.native
}
object Multiaddrs {
  
  @scala.inline
  def apply(id: js.Any, multiaddrs: js.Array[_], protocols: js.Array[String]): Multiaddrs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], multiaddrs = multiaddrs.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
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
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiaddrsVarargs(value: js.Any*): Self = this.set("multiaddrs", js.Array(value :_*))
    
    @scala.inline
    def setMultiaddrs(value: js.Array[_]): Self = this.set("multiaddrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsVarargs(value: String*): Self = this.set("protocols", js.Array(value :_*))
    
    @scala.inline
    def setProtocols(value: js.Array[String]): Self = this.set("protocols", value.asInstanceOf[js.Any])
  }
}
