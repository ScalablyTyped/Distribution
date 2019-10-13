package typings.knuddelsDashUserappsDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object knuddelsDashUserappsDashApiMod {
  import typings.std.Date

  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.std.Date
    - typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.Json
    - typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.JsonArray
    - `js.undefined`
    - scala.Nothing
  */
  type JsonData = js.UndefOr[_JsonData | String | Double | Boolean | Date]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.Json
    - typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.KnuddelsEventArray
  */
  type KnuddelsEvent = _KnuddelsEvent | String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.std.Date
    - typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.KnuddelsJson
    - typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.KnuddelsJsonArray
    - typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod.KnuddelsSerializable
    - `js.undefined`
    - scala.Nothing
  */
  type KnuddelsJsonData = js.UndefOr[_KnuddelsJsonData | String | Double | Boolean | Date]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.User
    - typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.BotUser
    - `js.undefined`
    - scala.Nothing
  */
  type KnuddelsSerializable = js.UndefOr[_KnuddelsSerializable | String | Double | Boolean]
}
