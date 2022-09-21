package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsChangelogsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the changelog to get. Format: `projects//locations//agents//changelogs/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsChangelogsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsChangelogsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsChangelogsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsChangelogsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
