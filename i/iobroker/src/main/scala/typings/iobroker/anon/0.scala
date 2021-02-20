package typings.iobroker.anon

import typings.iobroker.iobrokerStrings.Interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends StObject {
  
  var __ioBrokerBrand: Interval = js.native
}
object `0` {
  
  @scala.inline
  def apply(__ioBrokerBrand: Interval): `0` = {
    val __obj = js.Dynamic.literal(__ioBrokerBrand = __ioBrokerBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__ioBrokerBrand(value: Interval): Self = StObject.set(x, "__ioBrokerBrand", value.asInstanceOf[js.Any])
  }
}
