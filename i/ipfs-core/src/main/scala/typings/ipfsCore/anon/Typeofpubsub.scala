package typings.ipfsCore.anon

import typings.ipfsCore.srcUtilsMod.AbortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpubsub extends js.Object {
  
  def cancel(hasIpnsOptions: Ipns): js.Function2[/* name */ String, /* options */ js.UndefOr[AbortOptions], js.Promise[Canceled]] = js.native
  
  def state(hasIpnsOptions: IpnsOptions): js.Function1[/* _options */ js.UndefOr[AbortOptions], js.Promise[Enabled]] = js.native
  
  def subs(hasIpnsOptions: IpnsOptions): js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[js.Array[String]]] = js.native
}
object Typeofpubsub {
  
  @scala.inline
  def apply(
    cancel: Ipns => js.Function2[/* name */ String, /* options */ js.UndefOr[AbortOptions], js.Promise[Canceled]],
    state: IpnsOptions => js.Function1[/* _options */ js.UndefOr[AbortOptions], js.Promise[Enabled]],
    subs: IpnsOptions => js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[js.Array[String]]]
  ): Typeofpubsub = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), state = js.Any.fromFunction1(state), subs = js.Any.fromFunction1(subs))
    __obj.asInstanceOf[Typeofpubsub]
  }
  
  @scala.inline
  implicit class TypeofpubsubOps[Self <: Typeofpubsub] (val x: Self) extends AnyVal {
    
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
    def setCancel(
      value: Ipns => js.Function2[/* name */ String, /* options */ js.UndefOr[AbortOptions], js.Promise[Canceled]]
    ): Self = this.set("cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: IpnsOptions => js.Function1[/* _options */ js.UndefOr[AbortOptions], js.Promise[Enabled]]): Self = this.set("state", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubs(
      value: IpnsOptions => js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[js.Array[String]]]
    ): Self = this.set("subs", js.Any.fromFunction1(value))
  }
}
