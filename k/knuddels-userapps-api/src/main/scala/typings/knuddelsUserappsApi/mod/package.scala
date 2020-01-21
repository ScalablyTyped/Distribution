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
    - typings.knuddelsUserappsApi.mod._Global_.Json
    - typings.knuddelsUserappsApi.mod._Global_.JsonArray
    - `js.undefined`
  */
  type JsonData = js.UndefOr[
    typings.knuddelsUserappsApi.mod._JsonData | java.lang.String | scala.Double | scala.Boolean | typings.std.Date
  ]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.knuddelsUserappsApi.mod._Global_.Json
    - typings.knuddelsUserappsApi.mod._Global_.KnuddelsEventArray
  */
  type KnuddelsEvent = typings.knuddelsUserappsApi.mod._KnuddelsEvent | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.std.Date
    - typings.knuddelsUserappsApi.mod._Global_.KnuddelsJson
    - typings.knuddelsUserappsApi.mod._Global_.KnuddelsJsonArray
    - typings.knuddelsUserappsApi.mod.KnuddelsSerializable
    - `js.undefined`
  */
  type KnuddelsJsonData = js.UndefOr[
    typings.knuddelsUserappsApi.mod._KnuddelsJsonData | java.lang.String | scala.Double | scala.Boolean | typings.std.Date
  ]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.knuddelsUserappsApi.mod._Global_.User
    - typings.knuddelsUserappsApi.mod._Global_.BotUser
    - `js.undefined`
  */
  type KnuddelsSerializable = js.UndefOr[
    typings.knuddelsUserappsApi.mod._KnuddelsSerializable | java.lang.String | scala.Double | scala.Boolean
  ]
}
