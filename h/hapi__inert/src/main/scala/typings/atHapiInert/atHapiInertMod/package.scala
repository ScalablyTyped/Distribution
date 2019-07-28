package typings.atHapiInert

import typings.atHapiHapi.atHapiHapiMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiInertMod {
  type RequestHandler[T] = js.Function1[/* request */ Request, T]
}
