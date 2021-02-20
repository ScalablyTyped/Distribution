package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ConfigMapEnvSource selects a ConfigMap to populate the environment
  * variables with.  The contents of the target ConfigMap&#39;s Data field will
  * represent the key-value pairs as environment variables.
  */
@js.native
trait SchemaConfigMapEnvSource extends StObject {
  
  /**
    * The ConfigMap to select from.
    */
  var localObjectReference: js.UndefOr[SchemaLocalObjectReference] = js.native
  
  /**
    * Specify whether the ConfigMap must be defined +optional
    */
  var optional: js.UndefOr[Boolean] = js.native
}
object SchemaConfigMapEnvSource {
  
  @scala.inline
  def apply(): SchemaConfigMapEnvSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigMapEnvSource]
  }
  
  @scala.inline
  implicit class SchemaConfigMapEnvSourceMutableBuilder[Self <: SchemaConfigMapEnvSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalObjectReference(value: SchemaLocalObjectReference): Self = StObject.set(x, "localObjectReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalObjectReferenceUndefined: Self = StObject.set(x, "localObjectReference", js.undefined)
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
