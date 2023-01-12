package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CerData extends StObject {
  
  var cerData: String
  
  var feedBackOptions: BatchFeedback
  
  var keyData: String
  
  var production: Boolean
  
  var pushOptions: Gateway
}
object CerData {
  
  inline def apply(
    cerData: String,
    feedBackOptions: BatchFeedback,
    keyData: String,
    production: Boolean,
    pushOptions: Gateway
  ): CerData = {
    val __obj = js.Dynamic.literal(cerData = cerData.asInstanceOf[js.Any], feedBackOptions = feedBackOptions.asInstanceOf[js.Any], keyData = keyData.asInstanceOf[js.Any], production = production.asInstanceOf[js.Any], pushOptions = pushOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CerData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CerData] (val x: Self) extends AnyVal {
    
    inline def setCerData(value: String): Self = StObject.set(x, "cerData", value.asInstanceOf[js.Any])
    
    inline def setFeedBackOptions(value: BatchFeedback): Self = StObject.set(x, "feedBackOptions", value.asInstanceOf[js.Any])
    
    inline def setKeyData(value: String): Self = StObject.set(x, "keyData", value.asInstanceOf[js.Any])
    
    inline def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
    
    inline def setPushOptions(value: Gateway): Self = StObject.set(x, "pushOptions", value.asInstanceOf[js.Any])
  }
}
