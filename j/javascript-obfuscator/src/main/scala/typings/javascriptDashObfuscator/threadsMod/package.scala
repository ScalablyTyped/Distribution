package typings.javascriptDashObfuscator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object threadsMod {
  type PostMessage[U] = js.Function1[/* data */ U, Unit]
  type ResponseCallback[U] = js.Function1[/* response */ U, Unit]
  type SpawnCallback[T, U] = js.Function2[/* data */ T, /* postMessage */ PostMessage[U], Unit]
}
