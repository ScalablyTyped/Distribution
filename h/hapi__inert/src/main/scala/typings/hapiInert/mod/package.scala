package typings.hapiInert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RequestHandler[T] = js.Function1[/* request */ typings.hapiHapi.mod.Request, T]
}
