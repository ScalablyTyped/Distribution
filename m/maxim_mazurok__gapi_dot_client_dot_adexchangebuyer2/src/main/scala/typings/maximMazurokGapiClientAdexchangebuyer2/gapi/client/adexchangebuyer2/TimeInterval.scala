package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeInterval extends StObject {
  
  /** The timestamp marking the end of the range (exclusive) for which data is included. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The timestamp marking the start of the range (inclusive) for which data is included. */
  var startTime: js.UndefOr[String] = js.undefined
}
object TimeInterval {
  
  @scala.inline
  def apply(): TimeInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeInterval]
  }
  
  @scala.inline
  implicit class TimeIntervalMutableBuilder[Self <: TimeInterval] (val x: Self) extends AnyVal {
    
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
