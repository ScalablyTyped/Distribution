package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOperationMetadata extends StObject {
  
  /**
    * Percentage of completion of this operation, ranging from 0 to 100.
    */
  var progressPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The full name of the resources that this operation is directly associated with.
    */
  var resourceNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The start time of the operation.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Detailed status information for each step. The order is undetermined.
    */
  var steps: js.UndefOr[js.Array[SchemaStep]] = js.undefined
}
object SchemaOperationMetadata {
  
  inline def apply(): SchemaOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadata]
  }
  
  extension [Self <: SchemaOperationMetadata](x: Self) {
    
    inline def setProgressPercentage(value: Double): Self = StObject.set(x, "progressPercentage", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentageNull: Self = StObject.set(x, "progressPercentage", null)
    
    inline def setProgressPercentageUndefined: Self = StObject.set(x, "progressPercentage", js.undefined)
    
    inline def setResourceNames(value: js.Array[String]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
    
    inline def setResourceNamesNull: Self = StObject.set(x, "resourceNames", null)
    
    inline def setResourceNamesUndefined: Self = StObject.set(x, "resourceNames", js.undefined)
    
    inline def setResourceNamesVarargs(value: String*): Self = StObject.set(x, "resourceNames", js.Array(value*))
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setSteps(value: js.Array[SchemaStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: SchemaStep*): Self = StObject.set(x, "steps", js.Array(value*))
  }
}
