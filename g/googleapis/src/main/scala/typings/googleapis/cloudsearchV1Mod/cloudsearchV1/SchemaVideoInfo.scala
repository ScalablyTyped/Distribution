package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoInfo extends StObject {
  
  /**
    * Duration of the video in milliseconds. This field can be absent for recently uploaded video or inaccurate sometimes.
    */
  var duration: js.UndefOr[Double | Null] = js.undefined
}
object SchemaVideoInfo {
  
  inline def apply(): SchemaVideoInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoInfo]
  }
  
  extension [Self <: SchemaVideoInfo](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
