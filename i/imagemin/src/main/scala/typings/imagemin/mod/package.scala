package typings.imagemin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Plugin = js.Function1[/* input */ typings.node.Buffer, js.Promise[typings.node.Buffer]]
}
