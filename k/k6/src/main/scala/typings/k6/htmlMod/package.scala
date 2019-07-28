package typings.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object htmlMod {
  type Handler = js.Function2[/* index */ Double, /* element */ Element, Unit]
  type Mapper = js.Function2[/* index */ Double, /* element */ Element, js.Any]
  type Tester = js.Function2[/* index */ Double, /* element */ Element, Boolean]
}
