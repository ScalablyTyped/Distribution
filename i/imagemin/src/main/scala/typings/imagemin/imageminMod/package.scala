package typings.imagemin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object imageminMod {
  import typings.node.Buffer

  type Plugin = js.Function1[/* input */ Buffer, js.Promise[Buffer]]
}
