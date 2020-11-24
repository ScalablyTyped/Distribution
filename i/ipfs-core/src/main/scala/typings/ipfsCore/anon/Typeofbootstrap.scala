package typings.ipfsCore.anon

import typings.ipfsCore.bootstrapUtilsMod.Peers
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.multiaddr.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofbootstrap extends js.Object {
  
  def add(hasRepo: js.Any): js.Function2[/* multiaddr */ ^, /* options */ js.UndefOr[AbortOptions], js.Promise[Peers]] = js.native
  
  def clear(hasRepo: RepoAny): js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Peers]] = js.native
  
  def list(hasRepo: js.Any): js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Peers]] = js.native
  
  def reset(hasRepo: js.Any): js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Peers]] = js.native
  
  def rm_1(hasRepo: js.Any): js.Function2[/* multiaddr */ ^, /* options */ js.UndefOr[AbortOptions], js.Promise[Peers]] = js.native
}
object Typeofbootstrap {
  
  @scala.inline
  def apply(
    add: js.Any => js.Function2[/* multiaddr */ ^, /* options */ js.UndefOr[AbortOptions], js.Promise[Peers]],
    clear: RepoAny => js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Peers]],
    list: js.Any => js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Peers]],
    reset: js.Any => js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Peers]],
    rm_1: js.Any => js.Function2[/* multiaddr */ ^, /* options */ js.UndefOr[AbortOptions], js.Promise[Peers]]
  ): Typeofbootstrap = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction1(clear), list = js.Any.fromFunction1(list), reset = js.Any.fromFunction1(reset), rm_1 = js.Any.fromFunction1(rm_1))
    __obj.asInstanceOf[Typeofbootstrap]
  }
  
  @scala.inline
  implicit class TypeofbootstrapOps[Self <: Typeofbootstrap] (val x: Self) extends AnyVal {
    
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
    def setAdd(
      value: js.Any => js.Function2[/* multiaddr */ ^, /* options */ js.UndefOr[AbortOptions], js.Promise[Peers]]
    ): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: RepoAny => js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Peers]]): Self = this.set("clear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: js.Any => js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Peers]]): Self = this.set("list", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: js.Any => js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Peers]]): Self = this.set("reset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRm_1(
      value: js.Any => js.Function2[/* multiaddr */ ^, /* options */ js.UndefOr[AbortOptions], js.Promise[Peers]]
    ): Self = this.set("rm_1", js.Any.fromFunction1(value))
  }
}
