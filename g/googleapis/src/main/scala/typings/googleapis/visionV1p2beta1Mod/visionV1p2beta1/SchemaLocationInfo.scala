package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detected entity location information.
  */
@js.native
trait SchemaLocationInfo extends StObject {
  
  /**
    * lat/long location coordinates.
    */
  var latLng: js.UndefOr[SchemaLatLng] = js.native
}
object SchemaLocationInfo {
  
  @scala.inline
  def apply(): SchemaLocationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationInfo]
  }
  
  @scala.inline
  implicit class SchemaLocationInfoMutableBuilder[Self <: SchemaLocationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatLng(value: SchemaLatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
  }
}
