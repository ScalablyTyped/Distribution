package typings.graygelf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graygelf.graygelfNumbers.`0`
import typings.graygelf.graygelfNumbers.`1`
import typings.graygelf.graygelfNumbers.`2`
import typings.graygelf.graygelfNumbers.`3`
import typings.graygelf.graygelfNumbers.`4`
import typings.graygelf.graygelfNumbers.`5`
import typings.graygelf.graygelfNumbers.`6`
import typings.graygelf.graygelfNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GelfMessage
  extends /**
  * any other personal property
  */
/* key */ StringDictionary[js.UndefOr[String | Double]] {
  
  /**
    * log full message
    */
  var full_message: js.UndefOr[String | Double] = js.native
  
  /**
    * app host
    */
  var host: js.UndefOr[String | Double] = js.native
  
  /**
    * GELF level
    *
    *  emerg: 0; panic: 0;
    *  alert: 1;
    *  crit: 2;
    *  error: 3; err: 3;
    *  warn: 4; warning: 4;
    *  notice: 5;
    *  info: 6;
    *  debug: 7.
    */
  var level: js.UndefOr[
    `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | typings.graygelf.graygelfStrings.`0` | typings.graygelf.graygelfStrings.`1` | typings.graygelf.graygelfStrings.`2` | typings.graygelf.graygelfStrings.`3` | typings.graygelf.graygelfStrings.`4` | typings.graygelf.graygelfStrings.`5` | typings.graygelf.graygelfStrings.`6` | typings.graygelf.graygelfStrings.`7`
  ] = js.native
  
  /**
    * log short message
    */
  var short_message: js.UndefOr[String | Double] = js.native
  
  /**
    * log timestamp
    */
  var timestamp: js.UndefOr[String | Double] = js.native
  
  /**
    * app version
    */
  var version: js.UndefOr[String | Double] = js.native
}
object GelfMessage {
  
  @scala.inline
  def apply(): GelfMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GelfMessage]
  }
  
  @scala.inline
  implicit class GelfMessageOps[Self <: GelfMessage] (val x: Self) extends AnyVal {
    
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
    def setFull_message(value: String | Double): Self = this.set("full_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFull_message: Self = this.set("full_message", js.undefined)
    
    @scala.inline
    def setHost(value: String | Double): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setLevel(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | typings.graygelf.graygelfStrings.`0` | typings.graygelf.graygelfStrings.`1` | typings.graygelf.graygelfStrings.`2` | typings.graygelf.graygelfStrings.`3` | typings.graygelf.graygelfStrings.`4` | typings.graygelf.graygelfStrings.`5` | typings.graygelf.graygelfStrings.`6` | typings.graygelf.graygelfStrings.`7`
    ): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setShort_message(value: String | Double): Self = this.set("short_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShort_message: Self = this.set("short_message", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String | Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setVersion(value: String | Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
