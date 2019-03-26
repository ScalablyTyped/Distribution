package typings
package knuddelsDashUserappsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object knuddelsDashUserappsDashApiMod {
  type JsonData = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | stdLib.Date | knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.Json | knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.JsonArray
  ]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.Json
    - knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.KnuddelsEventArray
  */
  type KnuddelsEvent = _KnuddelsEvent | java.lang.String
  type KnuddelsJsonData = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | stdLib.Date | knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.KnuddelsJson | knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.KnuddelsJsonArray | KnuddelsSerializable
  ]
  type KnuddelsSerializable = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.User | knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.BotUser
  ]
}
