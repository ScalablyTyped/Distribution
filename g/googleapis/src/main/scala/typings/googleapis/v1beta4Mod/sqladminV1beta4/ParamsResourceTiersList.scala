package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTiersList
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID of the project for which to list tiers.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceTiersList {
  
  inline def apply(): ParamsResourceTiersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTiersList]
  }
  
  extension [Self <: ParamsResourceTiersList](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
