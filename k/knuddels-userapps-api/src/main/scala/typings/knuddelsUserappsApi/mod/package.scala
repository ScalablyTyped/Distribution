package typings.knuddelsUserappsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.std.Date
    - typings.knuddelsUserappsApi.mod.global.Json
    - typings.knuddelsUserappsApi.mod.global.JsonArray
    - js.UndefOr[scala.Nothing]
  */
  type JsonData = js.UndefOr[
    typings.knuddelsUserappsApi.mod._JsonData | java.lang.String | scala.Double | scala.Boolean | typings.std.Date
  ]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.knuddelsUserappsApi.mod.global.Json
    - typings.knuddelsUserappsApi.mod.global.KnuddelsEventArray
  */
  type KnuddelsEvent = typings.knuddelsUserappsApi.mod._KnuddelsEvent | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.std.Date
    - typings.knuddelsUserappsApi.mod.global.KnuddelsJson
    - typings.knuddelsUserappsApi.mod.global.KnuddelsJsonArray
    - typings.knuddelsUserappsApi.mod.KnuddelsSerializable
    - js.UndefOr[scala.Nothing]
  */
  type KnuddelsJsonData = js.UndefOr[
    typings.knuddelsUserappsApi.mod._KnuddelsJsonData | java.lang.String | scala.Double | scala.Boolean | typings.std.Date
  ]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.knuddelsUserappsApi.mod.global.User
    - typings.knuddelsUserappsApi.mod.global.BotUser
    - js.UndefOr[scala.Nothing]
  */
  type KnuddelsSerializable = js.UndefOr[
    typings.knuddelsUserappsApi.mod._KnuddelsSerializable | java.lang.String | scala.Double | scala.Boolean
  ]
}
