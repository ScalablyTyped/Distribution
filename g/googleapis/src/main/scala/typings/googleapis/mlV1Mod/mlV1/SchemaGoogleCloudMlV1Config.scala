package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGoogleCloudMlV1Config extends StObject {
  
  /**
    * The service account Cloud ML uses to run on TPU node.
    */
  var tpuServiceAccount: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudMlV1Config {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Config]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1ConfigMutableBuilder[Self <: SchemaGoogleCloudMlV1Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTpuServiceAccount(value: String): Self = StObject.set(x, "tpuServiceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpuServiceAccountUndefined: Self = StObject.set(x, "tpuServiceAccount", js.undefined)
  }
}
