package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Int64RangeMatch extends StObject {
  
  /** The end of the range (exclusive) in signed long integer format. */
  var rangeEnd: js.UndefOr[String] = js.undefined
  
  /** The start of the range (inclusive) in signed long integer format. */
  var rangeStart: js.UndefOr[String] = js.undefined
}
object Int64RangeMatch {
  
  @scala.inline
  def apply(): Int64RangeMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Int64RangeMatch]
  }
  
  @scala.inline
  implicit class Int64RangeMatchMutableBuilder[Self <: Int64RangeMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRangeEnd(value: String): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeEndUndefined: Self = StObject.set(x, "rangeEnd", js.undefined)
    
    @scala.inline
    def setRangeStart(value: String): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeStartUndefined: Self = StObject.set(x, "rangeStart", js.undefined)
  }
}
