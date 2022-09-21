package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecutionReference extends StObject {
  
  /**
    * Optional. Completion timestamp of the execution.
    */
  var completionTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Creation timestamp of the execution.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Name of the execution.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaExecutionReference {
  
  inline def apply(): SchemaExecutionReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecutionReference]
  }
  
  extension [Self <: SchemaExecutionReference](x: Self) {
    
    inline def setCompletionTimestamp(value: String): Self = StObject.set(x, "completionTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimestampNull: Self = StObject.set(x, "completionTimestamp", null)
    
    inline def setCompletionTimestampUndefined: Self = StObject.set(x, "completionTimestamp", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
