package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interval of time, with an absolute start and end.
  */
trait SchemaTimeInterval extends StObject {
  
  /**
    * The timestamp marking the end of the range (exclusive) for which data is
    * included.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp marking the start of the range (inclusive) for which data
    * is included.
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object SchemaTimeInterval {
  
  @scala.inline
  def apply(): SchemaTimeInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeInterval]
  }
  
  @scala.inline
  implicit class SchemaTimeIntervalMutableBuilder[Self <: SchemaTimeInterval] (val x: Self) extends AnyVal {
    
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
