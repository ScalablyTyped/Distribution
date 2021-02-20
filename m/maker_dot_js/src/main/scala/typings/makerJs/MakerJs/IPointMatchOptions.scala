package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options when matching points
  */
@js.native
trait IPointMatchOptions extends StObject {
  
  /**
    * Max distance to consider two points as the same.
    */
  var pointMatchingDistance: js.UndefOr[Double] = js.native
}
object IPointMatchOptions {
  
  @scala.inline
  def apply(): IPointMatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPointMatchOptions]
  }
  
  @scala.inline
  implicit class IPointMatchOptionsMutableBuilder[Self <: IPointMatchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPointMatchingDistance(value: Double): Self = StObject.set(x, "pointMatchingDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointMatchingDistanceUndefined: Self = StObject.set(x, "pointMatchingDistance", js.undefined)
  }
}
