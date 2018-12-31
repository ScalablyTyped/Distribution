package typings
package graphqlLib.languageVisitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterLeave[T] extends js.Object {
  val enter: js.UndefOr[T] = js.undefined
  val leave: js.UndefOr[T] = js.undefined
}

