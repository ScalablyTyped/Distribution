package typings.knockout.mod

import typings.knockout.knockoutBooleans.`true`
import typings.knockout.knockoutStrings.always
import typings.knockout.mod.utils.CompareArraysOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendersOptions[T] extends js.Object {
  
  var deferred: `true` = js.native
  
  @JSName("notify")
  var notify_FExtendersOptions: always | js.Any = js.native
  
  var rateLimit: Double | RateLimitOptions = js.native
  
  var throttle: Double = js.native
  
  var trackArrayChanges: `true` | CompareArraysOptions = js.native
}
object ExtendersOptions {
  
  @scala.inline
  def apply[T](
    deferred: `true`,
    notify: always | js.Any,
    rateLimit: Double | RateLimitOptions,
    throttle: Double,
    trackArrayChanges: `true` | CompareArraysOptions
  ): ExtendersOptions[T] = {
    val __obj = js.Dynamic.literal(deferred = deferred.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any], trackArrayChanges = trackArrayChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendersOptions[T]]
  }
  
  @scala.inline
  implicit class ExtendersOptionsOps[Self <: ExtendersOptions[_], T] (val x: Self with ExtendersOptions[T]) extends AnyVal {
    
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
    def setDeferred(value: `true`): Self = this.set("deferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotify(value: always | js.Any): Self = this.set("notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateLimit(value: Double | RateLimitOptions): Self = this.set("rateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackArrayChanges(value: `true` | CompareArraysOptions): Self = this.set("trackArrayChanges", value.asInstanceOf[js.Any])
  }
}
