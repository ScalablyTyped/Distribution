package typings.jsonpathDashPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonpathDashPlusMod {
  type JSONPathCallback = js.Function3[/* payload */ js.Any, /* payloadType */ js.Any, /* fullPayload */ js.Any, js.Any]
  type JSONPathOtherTypeCallback = js.Function1[/* repeated */ js.Any, Unit]
  type JSONPathType = JSONPathCallable with JSONPathClass
}
