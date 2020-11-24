package typings.libp2pGossipsub.anon

import typings.peerId.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugName extends js.Object {
  
  var debugName: String = js.native
  
  var multicodecs: js.Array[String] = js.native
  
  var options: EmitSelf = js.native
  
  var peerId: ^ = js.native
  
  var registrar: Handle = js.native
}
object DebugName {
  
  @scala.inline
  def apply(debugName: String, multicodecs: js.Array[String], options: EmitSelf, peerId: ^, registrar: Handle): DebugName = {
    val __obj = js.Dynamic.literal(debugName = debugName.asInstanceOf[js.Any], multicodecs = multicodecs.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], registrar = registrar.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugName]
  }
  
  @scala.inline
  implicit class DebugNameOps[Self <: DebugName] (val x: Self) extends AnyVal {
    
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
    def setDebugName(value: String): Self = this.set("debugName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulticodecsVarargs(value: String*): Self = this.set("multicodecs", js.Array(value :_*))
    
    @scala.inline
    def setMulticodecs(value: js.Array[String]): Self = this.set("multicodecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: EmitSelf): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerId(value: ^): Self = this.set("peerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrar(value: Handle): Self = this.set("registrar", value.asInstanceOf[js.Any])
  }
}
