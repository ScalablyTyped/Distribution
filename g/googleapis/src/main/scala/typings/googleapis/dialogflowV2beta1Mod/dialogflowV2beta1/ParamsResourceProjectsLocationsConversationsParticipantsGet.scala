package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConversationsParticipantsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the participant. Format: `projects//locations//conversations//participants/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConversationsParticipantsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsConversationsParticipantsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConversationsParticipantsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConversationsParticipantsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
