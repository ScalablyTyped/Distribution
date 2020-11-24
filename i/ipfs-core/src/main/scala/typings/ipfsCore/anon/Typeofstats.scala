package typings.ipfsCore.anon

import typings.std.AsyncGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofstats extends js.Object {
  
  def bw(hasLibp2p: Libp2pAny): js.Function1[/* options */ js.UndefOr[js.Any], AsyncGenerator[RateIn, Unit, _]] = js.native
}
object Typeofstats {
  
  @scala.inline
  def apply(bw: Libp2pAny => js.Function1[/* options */ js.UndefOr[js.Any], AsyncGenerator[RateIn, Unit, _]]): Typeofstats = {
    val __obj = js.Dynamic.literal(bw = js.Any.fromFunction1(bw))
    __obj.asInstanceOf[Typeofstats]
  }
  
  @scala.inline
  implicit class TypeofstatsOps[Self <: Typeofstats] (val x: Self) extends AnyVal {
    
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
    def setBw(
      value: Libp2pAny => js.Function1[/* options */ js.UndefOr[js.Any], AsyncGenerator[RateIn, Unit, _]]
    ): Self = this.set("bw", js.Any.fromFunction1(value))
  }
}
