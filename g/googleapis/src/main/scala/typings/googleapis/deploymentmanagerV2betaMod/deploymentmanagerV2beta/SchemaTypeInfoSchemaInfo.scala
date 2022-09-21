package typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTypeInfoSchemaInfo extends StObject {
  
  /**
    * The properties that this composite type or base type collection accept as input, represented as a json blob, format is: JSON Schema Draft V4
    */
  var input: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The properties that this composite type or base type collection exposes as output, these properties can be used for references, represented as json blob, format is: JSON Schema Draft V4
    */
  var output: js.UndefOr[String | Null] = js.undefined
}
object SchemaTypeInfoSchemaInfo {
  
  inline def apply(): SchemaTypeInfoSchemaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeInfoSchemaInfo]
  }
  
  extension [Self <: SchemaTypeInfoSchemaInfo](x: Self) {
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputNull: Self = StObject.set(x, "input", null)
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputNull: Self = StObject.set(x, "output", null)
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
