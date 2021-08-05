package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceSpecRunLatest contains the options for always having a route to the
  * latest configuration. See ServiceSpec for more details.
  */
trait SchemaServiceSpecRunLatest extends StObject {
  
  /**
    * The configuration for this service.
    */
  var configuration: js.UndefOr[SchemaConfigurationSpec] = js.undefined
}
object SchemaServiceSpecRunLatest {
  
  inline def apply(): SchemaServiceSpecRunLatest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceSpecRunLatest]
  }
  
  extension [Self <: SchemaServiceSpecRunLatest](x: Self) {
    
    inline def setConfiguration(value: SchemaConfigurationSpec): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
  }
}
