package typings.ipfsCore.componentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GCLock extends js.Object {
  
  def readLock(): js.Promise[Lock] = js.native
  
  def writeLock(): js.Promise[Lock] = js.native
}
object GCLock {
  
  @scala.inline
  def apply(readLock: () => js.Promise[Lock], writeLock: () => js.Promise[Lock]): GCLock = {
    val __obj = js.Dynamic.literal(readLock = js.Any.fromFunction0(readLock), writeLock = js.Any.fromFunction0(writeLock))
    __obj.asInstanceOf[GCLock]
  }
  
  @scala.inline
  implicit class GCLockOps[Self <: GCLock] (val x: Self) extends AnyVal {
    
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
    def setReadLock(value: () => js.Promise[Lock]): Self = this.set("readLock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWriteLock(value: () => js.Promise[Lock]): Self = this.set("writeLock", js.Any.fromFunction0(value))
  }
}
