package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the location to delete.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsDelete {
  
  inline def apply(): ParamsResourceLocationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsDelete]
  }
  
  extension [Self <: ParamsResourceLocationsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
