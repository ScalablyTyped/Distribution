package typings.ink.inkMod

import typings.propDashTypes.propDashTypesMod.ValidationMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatelessComponent[P /* <: Record[String, _] */, C /* <: Record[String, _] */] extends js.Object {
  var defaultProps: js.UndefOr[Record[String, _]] = js.native
  var propTypes: js.UndefOr[ValidationMap[Record[String, _]]] = js.native
  def apply(props: P, context: C): InkElement = js.native
}

