package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Job scheduling options.
  */
@js.native
trait SchemaJobScheduling extends StObject {
  
  /**
    * Optional. Maximum number of times per hour a driver may be restarted as a
    * result of driver terminating with non-zero code before job is reported
    * failed.A job may be reported as thrashing if driver exits with non-zero
    * code 4 times within 10 minute window.Maximum value is 10.
    */
  var maxFailuresPerHour: js.UndefOr[Double] = js.native
}
object SchemaJobScheduling {
  
  @scala.inline
  def apply(): SchemaJobScheduling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobScheduling]
  }
  
  @scala.inline
  implicit class SchemaJobSchedulingMutableBuilder[Self <: SchemaJobScheduling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxFailuresPerHour(value: Double): Self = StObject.set(x, "maxFailuresPerHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFailuresPerHourUndefined: Self = StObject.set(x, "maxFailuresPerHour", js.undefined)
  }
}
