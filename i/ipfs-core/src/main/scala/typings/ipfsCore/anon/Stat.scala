package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stat extends js.Object {
  
  def stat(): js.Promise[scala.Nothing] = js.native
  
  def unwant(): js.Promise[scala.Nothing] = js.native
  
  def wantlist(): js.Promise[scala.Nothing] = js.native
  
  def wantlistForPeer(): js.Promise[scala.Nothing] = js.native
}
object Stat {
  
  @scala.inline
  def apply(
    stat: () => js.Promise[scala.Nothing],
    unwant: () => js.Promise[scala.Nothing],
    wantlist: () => js.Promise[scala.Nothing],
    wantlistForPeer: () => js.Promise[scala.Nothing]
  ): Stat = {
    val __obj = js.Dynamic.literal(stat = js.Any.fromFunction0(stat), unwant = js.Any.fromFunction0(unwant), wantlist = js.Any.fromFunction0(wantlist), wantlistForPeer = js.Any.fromFunction0(wantlistForPeer))
    __obj.asInstanceOf[Stat]
  }
  
  @scala.inline
  implicit class StatOps[Self <: Stat] (val x: Self) extends AnyVal {
    
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
    def setStat(value: () => js.Promise[scala.Nothing]): Self = this.set("stat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnwant(value: () => js.Promise[scala.Nothing]): Self = this.set("unwant", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWantlist(value: () => js.Promise[scala.Nothing]): Self = this.set("wantlist", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWantlistForPeer(value: () => js.Promise[scala.Nothing]): Self = this.set("wantlistForPeer", js.Any.fromFunction0(value))
  }
}
