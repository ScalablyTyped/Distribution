package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video Offset
  */
trait SchemaVideoOffset extends StObject {
  
  /**
    * Duration, as a percentage of video duration. Do not set when
    * offsetSeconds is set. Acceptable values are 0 to 100, inclusive.
    */
  var offsetPercentage: js.UndefOr[Double] = js.undefined
  
  /**
    * Duration, in seconds. Do not set when offsetPercentage is set. Acceptable
    * values are 0 to 86399, inclusive.
    */
  var offsetSeconds: js.UndefOr[Double] = js.undefined
}
object SchemaVideoOffset {
  
  @scala.inline
  def apply(): SchemaVideoOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoOffset]
  }
  
  @scala.inline
  implicit class SchemaVideoOffsetMutableBuilder[Self <: SchemaVideoOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffsetPercentage(value: Double): Self = StObject.set(x, "offsetPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetPercentageUndefined: Self = StObject.set(x, "offsetPercentage", js.undefined)
    
    @scala.inline
    def setOffsetSeconds(value: Double): Self = StObject.set(x, "offsetSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetSecondsUndefined: Self = StObject.set(x, "offsetSeconds", js.undefined)
  }
}
