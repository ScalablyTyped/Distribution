package typings.inert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inertMod {
  import typings.hapi.hapiMod.Request

  type RequestHandler[T] = js.Function1[/* request */ Request, T]
}
