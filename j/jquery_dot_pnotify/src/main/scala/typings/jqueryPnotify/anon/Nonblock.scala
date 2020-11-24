package typings.jqueryPnotify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nonblock extends js.Object {
  
  /**
    * Create a non-blocking notice. It lets the user click elements underneath it.
    */
  var nonblock: js.UndefOr[Boolean] = js.native
  
  /**
    * The opacity of the notice (if it's non-blocking) when the mouse is over it.
    */
  var nonblock_opacity: js.UndefOr[Double] = js.native
}
object Nonblock {
  
  @scala.inline
  def apply(): Nonblock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nonblock]
  }
  
  @scala.inline
  implicit class NonblockOps[Self <: Nonblock] (val x: Self) extends AnyVal {
    
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
    def setNonblock(value: Boolean): Self = this.set("nonblock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonblock: Self = this.set("nonblock", js.undefined)
    
    @scala.inline
    def setNonblock_opacity(value: Double): Self = this.set("nonblock_opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonblock_opacity: Self = this.set("nonblock_opacity", js.undefined)
  }
}
