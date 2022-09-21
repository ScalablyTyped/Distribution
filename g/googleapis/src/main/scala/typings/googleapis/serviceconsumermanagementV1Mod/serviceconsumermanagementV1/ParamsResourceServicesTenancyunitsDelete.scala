package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesTenancyunitsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the tenancy unit to be deleted.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesTenancyunitsDelete {
  
  inline def apply(): ParamsResourceServicesTenancyunitsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesTenancyunitsDelete]
  }
  
  extension [Self <: ParamsResourceServicesTenancyunitsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
