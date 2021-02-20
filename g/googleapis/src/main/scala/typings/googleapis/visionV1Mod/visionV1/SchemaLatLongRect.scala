package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rectangle determined by min and max `LatLng` pairs.
  */
@js.native
trait SchemaLatLongRect extends StObject {
  
  /**
    * Max lat/long pair.
    */
  var maxLatLng: js.UndefOr[SchemaLatLng] = js.native
  
  /**
    * Min lat/long pair.
    */
  var minLatLng: js.UndefOr[SchemaLatLng] = js.native
}
object SchemaLatLongRect {
  
  @scala.inline
  def apply(): SchemaLatLongRect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLatLongRect]
  }
  
  @scala.inline
  implicit class SchemaLatLongRectMutableBuilder[Self <: SchemaLatLongRect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxLatLng(value: SchemaLatLng): Self = StObject.set(x, "maxLatLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLatLngUndefined: Self = StObject.set(x, "maxLatLng", js.undefined)
    
    @scala.inline
    def setMinLatLng(value: SchemaLatLng): Self = StObject.set(x, "minLatLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLatLngUndefined: Self = StObject.set(x, "minLatLng", js.undefined)
  }
}
