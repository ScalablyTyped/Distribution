package typings.knuddelsUserappBackendApi.mod.global

import org.scalablytyped.runtime.StringDictionary
import typings.knuddelsUserappBackendApi.mod.JsonData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type Json = {[x: string] : knuddels-userapp-backend-api.knuddels-userapp-backend-api.JsonData | undefined}
}}}
to avoid circular code involving: 
- knuddels-userapp-backend-api.knuddels-userapp-backend-api.<global>.Json
- knuddels-userapp-backend-api.knuddels-userapp-backend-api.<global>.JsonArray
- knuddels-userapp-backend-api.knuddels-userapp-backend-api.<global>.KnuddelsEventArray
- knuddels-userapp-backend-api.knuddels-userapp-backend-api.JsonData
- knuddels-userapp-backend-api.knuddels-userapp-backend-api.KnuddelsEvent
*/
trait Json
  extends StObject
     with /* x */ StringDictionary[js.UndefOr[JsonData]]
object Json {
  
  inline def apply(): Json = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Json]
  }
}
