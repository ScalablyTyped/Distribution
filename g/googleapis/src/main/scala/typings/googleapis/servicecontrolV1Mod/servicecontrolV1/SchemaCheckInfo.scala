package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCheckInfo extends StObject {
  
  /**
    * Consumer info of this check.
    */
  var consumerInfo: js.UndefOr[SchemaConsumerInfo] = js.undefined
  
  /**
    * A list of fields and label keys that are ignored by the server. The client doesn't need to send them for following requests to improve performance and allow better aggregation.
    */
  var unusedArguments: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCheckInfo {
  
  inline def apply(): SchemaCheckInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckInfo]
  }
  
  extension [Self <: SchemaCheckInfo](x: Self) {
    
    inline def setConsumerInfo(value: SchemaConsumerInfo): Self = StObject.set(x, "consumerInfo", value.asInstanceOf[js.Any])
    
    inline def setConsumerInfoUndefined: Self = StObject.set(x, "consumerInfo", js.undefined)
    
    inline def setUnusedArguments(value: js.Array[String]): Self = StObject.set(x, "unusedArguments", value.asInstanceOf[js.Any])
    
    inline def setUnusedArgumentsNull: Self = StObject.set(x, "unusedArguments", null)
    
    inline def setUnusedArgumentsUndefined: Self = StObject.set(x, "unusedArguments", js.undefined)
    
    inline def setUnusedArgumentsVarargs(value: String*): Self = StObject.set(x, "unusedArguments", js.Array(value*))
  }
}
