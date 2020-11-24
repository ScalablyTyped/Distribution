package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EnvVar represents an environment variable present in a Container.
  */
@js.native
trait SchemaEnvVar extends js.Object {
  
  /**
    * Name of the environment variable. Must be a C_IDENTIFIER.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Variable references $(VAR_NAME) are expanded using the previous defined
    * environment variables in the container and any route environment
    * variables. If a variable cannot be resolved, the reference in the input
    * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
    * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
    * regardless of whether the variable exists or not. Defaults to
    * &quot;&quot;. +optional
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaEnvVar {
  
  @scala.inline
  def apply(): SchemaEnvVar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvVar]
  }
  
  @scala.inline
  implicit class SchemaEnvVarOps[Self <: SchemaEnvVar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
