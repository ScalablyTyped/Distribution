package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1Location extends StObject {
  
  /**
    * Capabilities available in the location.
    */
  var capabilities: js.UndefOr[js.Array[SchemaGoogleCloudMlV1Capability]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudMlV1Location {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Location]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1LocationMutableBuilder[Self <: SchemaGoogleCloudMlV1Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: js.Array[SchemaGoogleCloudMlV1Capability]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    @scala.inline
    def setCapabilitiesVarargs(value: SchemaGoogleCloudMlV1Capability*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
