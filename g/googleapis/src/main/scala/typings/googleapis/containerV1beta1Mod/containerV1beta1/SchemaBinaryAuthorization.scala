package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for Binary Authorization.
  */
@js.native
trait SchemaBinaryAuthorization extends StObject {
  
  /**
    * Enable Binary Authorization for this cluster. If enabled, all container
    * images will be validated by Google Binauthz.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}
object SchemaBinaryAuthorization {
  
  @scala.inline
  def apply(): SchemaBinaryAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBinaryAuthorization]
  }
  
  @scala.inline
  implicit class SchemaBinaryAuthorizationMutableBuilder[Self <: SchemaBinaryAuthorization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
