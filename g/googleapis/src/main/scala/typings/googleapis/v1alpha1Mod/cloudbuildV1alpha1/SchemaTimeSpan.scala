package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Start and end times for a build execution phase.
  */
@js.native
trait SchemaTimeSpan extends StObject {
  
  /**
    * End of time span.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Start of time span.
    */
  var startTime: js.UndefOr[String] = js.native
}
object SchemaTimeSpan {
  
  @scala.inline
  def apply(): SchemaTimeSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeSpan]
  }
  
  @scala.inline
  implicit class SchemaTimeSpanMutableBuilder[Self <: SchemaTimeSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
