package typings.jsonpathPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JSONPathCallback = js.Function3[/* payload */ js.Any, /* payloadType */ js.Any, /* fullPayload */ js.Any, js.Any]
  type JSONPathOtherTypeCallback = js.Function1[/* repeated */ js.Any, scala.Unit]
  type JSONPathType = typings.jsonpathPlus.mod.JSONPathCallable with typings.jsonpathPlus.mod.JSONPathClass
}
