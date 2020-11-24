package typings.libp2pGossipsub.interfacesMod

import typings.peerId.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionManager extends js.Object {
  
  def getAll(peerId: ^): js.Array[Connection] = js.native
}
object ConnectionManager {
  
  @scala.inline
  def apply(getAll: ^ => js.Array[Connection]): ConnectionManager = {
    val __obj = js.Dynamic.literal(getAll = js.Any.fromFunction1(getAll))
    __obj.asInstanceOf[ConnectionManager]
  }
  
  @scala.inline
  implicit class ConnectionManagerOps[Self <: ConnectionManager] (val x: Self) extends AnyVal {
    
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
    def setGetAll(value: ^ => js.Array[Connection]): Self = this.set("getAll", js.Any.fromFunction1(value))
  }
}
