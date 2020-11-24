package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SecretEnvSource selects a Secret to populate the environment variables
  * with.  The contents of the target Secret&#39;s Data field will represent
  * the key-value pairs as environment variables.
  */
@js.native
trait SchemaSecretEnvSource extends js.Object {
  
  /**
    * The Secret to select from.
    */
  var localObjectReference: js.UndefOr[SchemaLocalObjectReference] = js.native
  
  /**
    * Specify whether the Secret must be defined +optional
    */
  var optional: js.UndefOr[Boolean] = js.native
}
object SchemaSecretEnvSource {
  
  @scala.inline
  def apply(): SchemaSecretEnvSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecretEnvSource]
  }
  
  @scala.inline
  implicit class SchemaSecretEnvSourceOps[Self <: SchemaSecretEnvSource] (val x: Self) extends AnyVal {
    
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
    def setLocalObjectReference(value: SchemaLocalObjectReference): Self = this.set("localObjectReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalObjectReference: Self = this.set("localObjectReference", js.undefined)
    
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
  }
}
