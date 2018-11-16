package typings
package inertLib.inertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inertNs {
  type RequestHandler[T] = js.Function1[/* request */ hapiLib.hapiMod.Request, T]
}
