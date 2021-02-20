package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Location returns the location name, and if the location is recommended for
  * GKE cluster scheduling.
  */
@js.native
trait SchemaLocation extends StObject {
  
  /**
    * Contains the name of the resource requested. Specified in the format
    * &#39;projects/x/locations/ *&#39;.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Whether the location is recomended for GKE cluster scheduling.
    */
  var recommended: js.UndefOr[Boolean] = js.native
  
  /**
    * Contains the type of location this Location is for. Regional or Zonal.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaLocation {
  
  @scala.inline
  def apply(): SchemaLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocation]
  }
  
  @scala.inline
  implicit class SchemaLocationMutableBuilder[Self <: SchemaLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRecommended(value: Boolean): Self = StObject.set(x, "recommended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendedUndefined: Self = StObject.set(x, "recommended", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
