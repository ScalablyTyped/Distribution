package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorsAnimationOptionsObject extends StObject {
  
  var reversed: js.UndefOr[Boolean] = js.undefined
}
object ConnectorsAnimationOptionsObject {
  
  inline def apply(): ConnectorsAnimationOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorsAnimationOptionsObject]
  }
  
  extension [Self <: ConnectorsAnimationOptionsObject](x: Self) {
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
