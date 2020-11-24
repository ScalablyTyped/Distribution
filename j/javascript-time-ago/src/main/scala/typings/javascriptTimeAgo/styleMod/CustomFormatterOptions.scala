package typings.javascriptTimeAgo.styleMod

import typings.javascriptTimeAgo.localeMod.Locale
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomFormatterOptions extends js.Object {
  
  var date: js.UndefOr[Date] = js.native
  
  var elapsed: Double = js.native
  
  var locale: Locale = js.native
  
  var now: Double = js.native
  
  var time: Double = js.native
}
object CustomFormatterOptions {
  
  @scala.inline
  def apply(elapsed: Double, locale: Locale, now: Double, time: Double): CustomFormatterOptions = {
    val __obj = js.Dynamic.literal(elapsed = elapsed.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFormatterOptions]
  }
  
  @scala.inline
  implicit class CustomFormatterOptionsOps[Self <: CustomFormatterOptions] (val x: Self) extends AnyVal {
    
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
    def setElapsed(value: Double): Self = this.set("elapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNow(value: Double): Self = this.set("now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
  }
}
