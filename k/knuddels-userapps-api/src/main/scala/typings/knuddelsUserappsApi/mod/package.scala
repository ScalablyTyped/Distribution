package typings.knuddelsUserappsApi.mod

import typings.knuddelsUserappsApi.mod.global.Json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** 
NOTE: Rewritten from type alias:
{{{
type JsonData = string | number | boolean | std.Date | knuddels-userapps-api.knuddels-userapps-api.<global>.Json | knuddels-userapps-api.knuddels-userapps-api.<global>.JsonArray | undefined
}}}
to avoid circular code involving: 
- knuddels-userapps-api.knuddels-userapps-api.<global>.JsonArray
- knuddels-userapps-api.knuddels-userapps-api.JsonData
*/
type JsonData = js.UndefOr[String | Double | Boolean | js.Date | Json | Any]

/** 
NOTE: Rewritten from type alias:
{{{
type KnuddelsEvent = string | knuddels-userapps-api.knuddels-userapps-api.<global>.Json | knuddels-userapps-api.knuddels-userapps-api.<global>.KnuddelsEventArray
}}}
to avoid circular code involving: 
- knuddels-userapps-api.knuddels-userapps-api.<global>.KnuddelsEventArray
- knuddels-userapps-api.knuddels-userapps-api.KnuddelsEvent
*/
type KnuddelsEvent = String | Json | Any

/** 
NOTE: Rewritten from type alias:
{{{
type KnuddelsJsonData = string | number | boolean | std.Date | knuddels-userapps-api.knuddels-userapps-api.<global>.KnuddelsJson | knuddels-userapps-api.knuddels-userapps-api.<global>.KnuddelsJsonArray | knuddels-userapps-api.knuddels-userapps-api.KnuddelsSerializable | undefined
}}}
to avoid circular code involving: 
- knuddels-userapps-api.knuddels-userapps-api.<global>.KnuddelsJsonArray
- knuddels-userapps-api.knuddels-userapps-api.KnuddelsJsonData
*/
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - js.Date
  - typings.knuddelsUserappsApi.mod.global.KnuddelsJson
  - scala.Any
  - typings.knuddelsUserappsApi.mod.KnuddelsSerializable
  - scala.Unit
*/
type KnuddelsJsonData = js.UndefOr[_KnuddelsJsonData | String | Double | Boolean | js.Date | Any]

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - typings.knuddelsUserappsApi.mod.global.User
  - typings.knuddelsUserappsApi.mod.global.BotUser
  - scala.Unit
*/
type KnuddelsSerializable = js.UndefOr[_KnuddelsSerializable | String | Double | Boolean]
