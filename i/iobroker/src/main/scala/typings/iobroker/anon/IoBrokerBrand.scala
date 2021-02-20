package typings.iobroker.anon

import typings.iobroker.iobrokerStrings.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IoBrokerBrand extends StObject {
  
  var __ioBrokerBrand: Timeout = js.native
}
object IoBrokerBrand {
  
  @scala.inline
  def apply(__ioBrokerBrand: Timeout): IoBrokerBrand = {
    val __obj = js.Dynamic.literal(__ioBrokerBrand = __ioBrokerBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[IoBrokerBrand]
  }
  
  @scala.inline
  implicit class IoBrokerBrandMutableBuilder[Self <: IoBrokerBrand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__ioBrokerBrand(value: Timeout): Self = StObject.set(x, "__ioBrokerBrand", value.asInstanceOf[js.Any])
  }
}
