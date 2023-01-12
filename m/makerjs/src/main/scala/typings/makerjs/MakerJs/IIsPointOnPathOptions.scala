package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to measure.isPointOnPath.
  */
trait IIsPointOnPathOptions extends StObject {
  
  /**
    * The slope of the line, if applicable. This will be added to the options object if it did not exist.
    */
  var cachedLineSlope: js.UndefOr[ISlope] = js.undefined
}
object IIsPointOnPathOptions {
  
  inline def apply(): IIsPointOnPathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIsPointOnPathOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IIsPointOnPathOptions] (val x: Self) extends AnyVal {
    
    inline def setCachedLineSlope(value: ISlope): Self = StObject.set(x, "cachedLineSlope", value.asInstanceOf[js.Any])
    
    inline def setCachedLineSlopeUndefined: Self = StObject.set(x, "cachedLineSlope", js.undefined)
  }
}
