package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Key-value pair of detailed information about the client which invoked the
  * test. Examples: {&#39;Version&#39;, &#39;1.0&#39;}, {&#39;Release
  * Track&#39;, &#39;BETA&#39;}.
  */
trait SchemaClientInfoDetail extends StObject {
  
  /**
    * Required. The key of detailed client information.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The value of detailed client information.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaClientInfoDetail {
  
  inline def apply(): SchemaClientInfoDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientInfoDetail]
  }
  
  extension [Self <: SchemaClientInfoDetail](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
