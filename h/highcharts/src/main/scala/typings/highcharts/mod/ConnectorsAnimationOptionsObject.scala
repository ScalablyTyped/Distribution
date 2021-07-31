package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorsAnimationOptionsObject extends StObject {
  
  var reversed: js.UndefOr[Boolean] = js.undefined
}
object ConnectorsAnimationOptionsObject {
  
  @scala.inline
  def apply(): ConnectorsAnimationOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorsAnimationOptionsObject]
  }
  
  @scala.inline
  implicit class ConnectorsAnimationOptionsObjectMutableBuilder[Self <: ConnectorsAnimationOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
