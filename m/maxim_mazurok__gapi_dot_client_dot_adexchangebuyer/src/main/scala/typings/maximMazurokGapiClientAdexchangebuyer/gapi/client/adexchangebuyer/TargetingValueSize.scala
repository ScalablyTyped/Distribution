package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetingValueSize extends StObject {
  
  /** The height of the creative. */
  var height: js.UndefOr[Double] = js.undefined
  
  /** The width of the creative. */
  var width: js.UndefOr[Double] = js.undefined
}
object TargetingValueSize {
  
  @scala.inline
  def apply(): TargetingValueSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValueSize]
  }
  
  @scala.inline
  implicit class TargetingValueSizeMutableBuilder[Self <: TargetingValueSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
