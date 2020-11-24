package typings.kuromoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViterbiLattice extends js.Object {
  
  def append(node: ViterbiNode): Unit = js.native
  
  def appendEos(): Unit = js.native
}
object ViterbiLattice {
  
  @scala.inline
  def apply(append: ViterbiNode => Unit, appendEos: () => Unit): ViterbiLattice = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), appendEos = js.Any.fromFunction0(appendEos))
    __obj.asInstanceOf[ViterbiLattice]
  }
  
  @scala.inline
  implicit class ViterbiLatticeOps[Self <: ViterbiLattice] (val x: Self) extends AnyVal {
    
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
    def setAppend(value: ViterbiNode => Unit): Self = this.set("append", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppendEos(value: () => Unit): Self = this.set("appendEos", js.Any.fromFunction0(value))
  }
}
