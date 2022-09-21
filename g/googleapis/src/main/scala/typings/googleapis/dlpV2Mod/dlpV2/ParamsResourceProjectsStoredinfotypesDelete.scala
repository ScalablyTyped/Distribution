package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsStoredinfotypesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the organization and storedInfoType to be deleted, for example `organizations/433245324/storedInfoTypes/432452342` or projects/project-id/storedInfoTypes/432452342.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsStoredinfotypesDelete {
  
  inline def apply(): ParamsResourceProjectsStoredinfotypesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsStoredinfotypesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsStoredinfotypesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
