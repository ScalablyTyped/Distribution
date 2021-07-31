package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration options for the Cloud Run feature.
  */
trait SchemaCloudRunConfig extends StObject {
  
  /**
    * Whether Cloud Run addon is enabled for this cluster.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
}
object SchemaCloudRunConfig {
  
  @scala.inline
  def apply(): SchemaCloudRunConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudRunConfig]
  }
  
  @scala.inline
  implicit class SchemaCloudRunConfigMutableBuilder[Self <: SchemaCloudRunConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
