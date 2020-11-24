package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Frequency Cap.
  */
@js.native
trait SchemaFrequencyCap extends js.Object {
  
  /**
    * Duration of time, in seconds, for this frequency cap. The maximum
    * duration is 90 days. Acceptable values are 1 to 7776000, inclusive.
    */
  var duration: js.UndefOr[String] = js.native
  
  /**
    * Number of times an individual user can be served the ad within the
    * specified duration. Acceptable values are 1 to 15, inclusive.
    */
  var impressions: js.UndefOr[String] = js.native
}
object SchemaFrequencyCap {
  
  @scala.inline
  def apply(): SchemaFrequencyCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFrequencyCap]
  }
  
  @scala.inline
  implicit class SchemaFrequencyCapOps[Self <: SchemaFrequencyCap] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setImpressions(value: String): Self = this.set("impressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpressions: Self = this.set("impressions", js.undefined)
  }
}
