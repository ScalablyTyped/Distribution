package typings
package k6Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object htmlMod {
  type Handler = js.Function2[/* index */ scala.Double, /* element */ Element, scala.Unit]
  type Mapper = js.Function2[/* index */ scala.Double, /* element */ Element, js.Any]
  type Tester = js.Function2[/* index */ scala.Double, /* element */ Element, scala.Boolean]
}
