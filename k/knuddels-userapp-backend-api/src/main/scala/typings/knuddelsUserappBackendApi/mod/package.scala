package typings.knuddelsUserappBackendApi.mod

import typings.knuddelsUserappBackendApi.mod.global.Json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** 
NOTE: Rewritten from type alias:
{{{
type JsonData = string | number | boolean | std.Date | knuddels-userapp-backend-api.knuddels-userapp-backend-api.<global>.Json | knuddels-userapp-backend-api.knuddels-userapp-backend-api.<global>.JsonArray | undefined
}}}
to avoid circular code involving: 
- knuddels-userapp-backend-api.knuddels-userapp-backend-api.<global>.JsonArray
- knuddels-userapp-backend-api.knuddels-userapp-backend-api.JsonData
*/
type JsonData = js.UndefOr[String | Double | Boolean | js.Date | Json | Any]

/** 
NOTE: Rewritten from type alias:
{{{
type KnuddelsEvent = string | knuddels-userapp-backend-api.knuddels-userapp-backend-api.<global>.Json | knuddels-userapp-backend-api.knuddels-userapp-backend-api.<global>.KnuddelsEventArray
}}}
to avoid circular code involving: 
- knuddels-userapp-backend-api.knuddels-userapp-backend-api.<global>.KnuddelsEventArray
- knuddels-userapp-backend-api.knuddels-userapp-backend-api.KnuddelsEvent
*/
type KnuddelsEvent = String | Json | Any

/** 
NOTE: Rewritten from type alias:
{{{
type KnuddelsJsonData = string | number | boolean | std.Date | knuddels-userapp-backend-api.knuddels-userapp-backend-api.<global>.KnuddelsJson | knuddels-userapp-backend-api.knuddels-userapp-backend-api.<global>.KnuddelsJsonArray | knuddels-userapp-backend-api.knuddels-userapp-backend-api.KnuddelsSerializable | undefined
}}}
to avoid circular code involving: 
- knuddels-userapp-backend-api.knuddels-userapp-backend-api.<global>.KnuddelsJsonArray
- knuddels-userapp-backend-api.knuddels-userapp-backend-api.KnuddelsJsonData
*/
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - js.Date
  - typings.knuddelsUserappBackendApi.mod.global.KnuddelsJson
  - scala.Any
  - typings.knuddelsUserappBackendApi.mod.KnuddelsSerializable
  - scala.Unit
*/
type KnuddelsJsonData = js.UndefOr[_KnuddelsJsonData | String | Double | Boolean | js.Date | Any]

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - typings.knuddelsUserappBackendApi.mod.global.User
  - typings.knuddelsUserappBackendApi.mod.global.BotUser
  - scala.Unit
*/
type KnuddelsSerializable = js.UndefOr[_KnuddelsSerializable | String | Double | Boolean]
