package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about vulnerable request parameters.
  */
@js.native
trait SchemaVulnerableParameters extends StObject {
  
  /**
    * The vulnerable parameter names.
    */
  var parameterNames: js.UndefOr[js.Array[String]] = js.native
}
object SchemaVulnerableParameters {
  
  @scala.inline
  def apply(): SchemaVulnerableParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVulnerableParameters]
  }
  
  @scala.inline
  implicit class SchemaVulnerableParametersMutableBuilder[Self <: SchemaVulnerableParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterNames(value: js.Array[String]): Self = StObject.set(x, "parameterNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterNamesUndefined: Self = StObject.set(x, "parameterNames", js.undefined)
    
    @scala.inline
    def setParameterNamesVarargs(value: String*): Self = StObject.set(x, "parameterNames", js.Array(value :_*))
  }
}
