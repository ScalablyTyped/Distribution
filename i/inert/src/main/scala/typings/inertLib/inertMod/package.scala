package typings
package inertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inertMod {
  type RequestHandler[T] = js.Function1[/* request */ hapiLib.hapiMod.Request, T]
}
