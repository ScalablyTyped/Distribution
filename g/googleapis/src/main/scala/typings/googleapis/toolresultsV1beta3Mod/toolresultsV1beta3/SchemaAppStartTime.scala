package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAppStartTime extends StObject {
  
  /**
    * Optional. The time from app start to reaching the developer-reported
    * &quot;fully drawn&quot; time. This is only stored if the app includes a
    * call to Activity.reportFullyDrawn(). See
    * https://developer.android.com/topic/performance/launch-time.html#time-full
    */
  var fullyDrawnTime: js.UndefOr[SchemaDuration] = js.native
  
  /**
    * The time from app start to the first displayed activity being drawn, as
    * reported in Logcat. See
    * https://developer.android.com/topic/performance/launch-time.html#time-initial
    */
  var initialDisplayTime: js.UndefOr[SchemaDuration] = js.native
}
object SchemaAppStartTime {
  
  @scala.inline
  def apply(): SchemaAppStartTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppStartTime]
  }
  
  @scala.inline
  implicit class SchemaAppStartTimeMutableBuilder[Self <: SchemaAppStartTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullyDrawnTime(value: SchemaDuration): Self = StObject.set(x, "fullyDrawnTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullyDrawnTimeUndefined: Self = StObject.set(x, "fullyDrawnTime", js.undefined)
    
    @scala.inline
    def setInitialDisplayTime(value: SchemaDuration): Self = StObject.set(x, "initialDisplayTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDisplayTimeUndefined: Self = StObject.set(x, "initialDisplayTime", js.undefined)
  }
}
