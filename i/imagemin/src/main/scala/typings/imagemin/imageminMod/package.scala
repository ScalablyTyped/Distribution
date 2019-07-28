package typings.imagemin

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object imageminMod {
  type Plugin = js.Function1[/* input */ Buffer, js.Promise[Buffer]]
}
