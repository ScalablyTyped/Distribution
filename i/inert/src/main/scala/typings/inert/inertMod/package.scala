package typings.inert

import typings.hapi.hapiMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inertMod {
  type RequestHandler[T] = js.Function1[/* request */ Request, T]
}
