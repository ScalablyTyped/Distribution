package typings.koaRatelimit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderNameOptions extends js.Object {
  
  /**
    * The amount of requests remaining in the current limiting period.
    */
  var remaining: String = js.native
  
  /**
    * The time, expressed as a UNIX epoch timestamp, at which your rate-limit expires.
    */
  var reset: String = js.native
  
  /**
    * The total amount of requests a client may make during a limiting period.
    */
  var total: String = js.native
}
object HeaderNameOptions {
  
  @scala.inline
  def apply(remaining: String, reset: String, total: String): HeaderNameOptions = {
    val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderNameOptions]
  }
  
  @scala.inline
  implicit class HeaderNameOptionsOps[Self <: HeaderNameOptions] (val x: Self) extends AnyVal {
    
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
    def setRemaining(value: String): Self = this.set("remaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: String): Self = this.set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: String): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
