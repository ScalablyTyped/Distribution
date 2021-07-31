package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EnvVar represents an environment variable present in a Container.
  */
trait SchemaEnvVar extends StObject {
  
  /**
    * Name of the environment variable. Must be a C_IDENTIFIER.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Variable references $(VAR_NAME) are expanded using the previous defined
    * environment variables in the container and any route environment
    * variables. If a variable cannot be resolved, the reference in the input
    * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
    * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
    * regardless of whether the variable exists or not. Defaults to
    * &quot;&quot;. +optional
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaEnvVar {
  
  @scala.inline
  def apply(): SchemaEnvVar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvVar]
  }
  
  @scala.inline
  implicit class SchemaEnvVarMutableBuilder[Self <: SchemaEnvVar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
