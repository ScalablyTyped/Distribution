package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for Binary Authorization.
  */
trait SchemaBinaryAuthorization extends StObject {
  
  /**
    * Enable Binary Authorization for this cluster. If enabled, all container
    * images will be validated by Google Binauthz.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object SchemaBinaryAuthorization {
  
  inline def apply(): SchemaBinaryAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBinaryAuthorization]
  }
  
  extension [Self <: SchemaBinaryAuthorization](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
