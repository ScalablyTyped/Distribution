package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timestamp extends StObject {
  
  /** Non-negative fractions of a second at nanosecond resolution. Must be from 0 to 999,999,999 inclusive. */
  var nanos: js.UndefOr[Double] = js.undefined
  
  /** Represents seconds of UTC time since Unix epoch. */
  var seconds: js.UndefOr[String] = js.undefined
}
object Timestamp {
  
  inline def apply(): Timestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timestamp]
  }
  
  extension [Self <: Timestamp](x: Self) {
    
    inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    inline def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
