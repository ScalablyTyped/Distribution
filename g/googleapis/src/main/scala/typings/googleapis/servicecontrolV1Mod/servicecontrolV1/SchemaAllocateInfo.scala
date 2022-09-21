package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAllocateInfo extends StObject {
  
  /**
    * A list of label keys that were unused by the server in processing the request. Thus, for similar requests repeated in a certain future time window, the caller can choose to ignore these labels in the requests to achieve better client-side cache hits and quota aggregation for rate quota. This field is not populated for allocation quota checks.
    */
  var unusedArguments: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaAllocateInfo {
  
  inline def apply(): SchemaAllocateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocateInfo]
  }
  
  extension [Self <: SchemaAllocateInfo](x: Self) {
    
    inline def setUnusedArguments(value: js.Array[String]): Self = StObject.set(x, "unusedArguments", value.asInstanceOf[js.Any])
    
    inline def setUnusedArgumentsNull: Self = StObject.set(x, "unusedArguments", null)
    
    inline def setUnusedArgumentsUndefined: Self = StObject.set(x, "unusedArguments", js.undefined)
    
    inline def setUnusedArgumentsVarargs(value: String*): Self = StObject.set(x, "unusedArguments", js.Array(value*))
  }
}
