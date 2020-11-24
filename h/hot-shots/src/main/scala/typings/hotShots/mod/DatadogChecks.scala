package typings.hotShots.mod

import typings.hotShots.hotShotsNumbers.`0`
import typings.hotShots.hotShotsNumbers.`1`
import typings.hotShots.hotShotsNumbers.`2`
import typings.hotShots.hotShotsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatadogChecks extends js.Object {
  
  var CRITICAL: `2` = js.native
  
  var OK: `0` = js.native
  
  var UNKNOWN: `3` = js.native
  
  var WARNING: `1` = js.native
}
object DatadogChecks {
  
  @scala.inline
  def apply(CRITICAL: `2`, OK: `0`, UNKNOWN: `3`, WARNING: `1`): DatadogChecks = {
    val __obj = js.Dynamic.literal(CRITICAL = CRITICAL.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any], WARNING = WARNING.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatadogChecks]
  }
  
  @scala.inline
  implicit class DatadogChecksOps[Self <: DatadogChecks] (val x: Self) extends AnyVal {
    
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
    def setCRITICAL(value: `2`): Self = this.set("CRITICAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOK(value: `0`): Self = this.set("OK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKNOWN(value: `3`): Self = this.set("UNKNOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWARNING(value: `1`): Self = this.set("WARNING", value.asInstanceOf[js.Any])
  }
}
