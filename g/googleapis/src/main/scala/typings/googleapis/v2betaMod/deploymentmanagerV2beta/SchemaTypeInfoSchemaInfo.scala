package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTypeInfoSchemaInfo extends StObject {
  
  /**
    * The properties that this composite type or base type collection accept as
    * input, represented as a json blob, format is: JSON Schema Draft V4
    */
  var input: js.UndefOr[String] = js.native
  
  /**
    * The properties that this composite type or base type collection exposes
    * as output, these properties can be used for references, represented as
    * json blob, format is: JSON Schema Draft V4
    */
  var output: js.UndefOr[String] = js.native
}
object SchemaTypeInfoSchemaInfo {
  
  @scala.inline
  def apply(): SchemaTypeInfoSchemaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeInfoSchemaInfo]
  }
  
  @scala.inline
  implicit class SchemaTypeInfoSchemaInfoMutableBuilder[Self <: SchemaTypeInfoSchemaInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
