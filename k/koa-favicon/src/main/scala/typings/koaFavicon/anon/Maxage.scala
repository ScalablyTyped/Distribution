package typings.koaFavicon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Maxage extends js.Object {
  
  /**
    * cache-control max-age directive in ms, defaulting to 1 day.
    */
  var maxage: js.UndefOr[Double] = js.native
}
object Maxage {
  
  @scala.inline
  def apply(): Maxage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Maxage]
  }
  
  @scala.inline
  implicit class MaxageOps[Self <: Maxage] (val x: Self) extends AnyVal {
    
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
    def setMaxage(value: Double): Self = this.set("maxage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxage: Self = this.set("maxage", js.undefined)
  }
}
