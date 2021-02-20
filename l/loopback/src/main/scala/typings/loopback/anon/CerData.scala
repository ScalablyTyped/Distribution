package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CerData extends StObject {
  
  var cerData: String = js.native
  
  var feedBackOptions: BatchFeedback = js.native
  
  var keyData: String = js.native
  
  var production: Boolean = js.native
  
  var pushOptions: Gateway = js.native
}
object CerData {
  
  @scala.inline
  def apply(
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
  implicit class CerDataMutableBuilder[Self <: CerData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCerData(value: String): Self = StObject.set(x, "cerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedBackOptions(value: BatchFeedback): Self = StObject.set(x, "feedBackOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyData(value: String): Self = StObject.set(x, "keyData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushOptions(value: Gateway): Self = StObject.set(x, "pushOptions", value.asInstanceOf[js.Any])
  }
}
