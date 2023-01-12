package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateURLOptions extends StObject {
  
  var PAYLINEV2: String
  
  var Payline: String
}
object TemplateURLOptions {
  
  inline def apply(PAYLINEV2: String, Payline: String): TemplateURLOptions = {
    val __obj = js.Dynamic.literal(PAYLINEV2 = PAYLINEV2.asInstanceOf[js.Any], Payline = Payline.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateURLOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateURLOptions] (val x: Self) extends AnyVal {
    
    inline def setPAYLINEV2(value: String): Self = StObject.set(x, "PAYLINEV2", value.asInstanceOf[js.Any])
    
    inline def setPayline(value: String): Self = StObject.set(x, "Payline", value.asInstanceOf[js.Any])
  }
}
