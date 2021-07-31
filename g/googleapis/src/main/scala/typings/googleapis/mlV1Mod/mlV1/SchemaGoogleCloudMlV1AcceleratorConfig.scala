package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a hardware accelerator request config.
  */
trait SchemaGoogleCloudMlV1AcceleratorConfig extends StObject {
  
  /**
    * The number of accelerators to attach to each machine running the job.
    */
  var count: js.UndefOr[String] = js.undefined
  
  /**
    * The type of accelerator to use.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudMlV1AcceleratorConfig {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1AcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1AcceleratorConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1AcceleratorConfigMutableBuilder[Self <: SchemaGoogleCloudMlV1AcceleratorConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
