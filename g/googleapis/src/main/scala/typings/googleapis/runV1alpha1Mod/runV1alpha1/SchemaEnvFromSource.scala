package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EnvFromSource represents the source of a set of ConfigMaps
  */
@js.native
trait SchemaEnvFromSource extends StObject {
  
  /**
    * The ConfigMap to select from +optional
    */
  var configMapRef: js.UndefOr[SchemaConfigMapEnvSource] = js.native
  
  /**
    * An optional identifier to prepend to each key in the ConfigMap. Must be a
    * C_IDENTIFIER. +optional
    */
  var prefix: js.UndefOr[String] = js.native
  
  /**
    * The Secret to select from +optional
    */
  var secretRef: js.UndefOr[SchemaSecretEnvSource] = js.native
}
object SchemaEnvFromSource {
  
  @scala.inline
  def apply(): SchemaEnvFromSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvFromSource]
  }
  
  @scala.inline
  implicit class SchemaEnvFromSourceMutableBuilder[Self <: SchemaEnvFromSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigMapRef(value: SchemaConfigMapEnvSource): Self = StObject.set(x, "configMapRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigMapRefUndefined: Self = StObject.set(x, "configMapRef", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setSecretRef(value: SchemaSecretEnvSource): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretRefUndefined: Self = StObject.set(x, "secretRef", js.undefined)
  }
}
