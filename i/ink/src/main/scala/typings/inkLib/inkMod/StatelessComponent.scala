package typings
package inkLib.inkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatelessComponent[P /* <: stdLib.Record[java.lang.String, _] */, C /* <: stdLib.Record[java.lang.String, _] */] extends js.Object {
  var defaultProps: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.native
  var propTypes: js.UndefOr[
    propDashTypesLib.propDashTypesMod.ValidationMap[stdLib.Record[java.lang.String, _]]
  ] = js.native
  def apply(props: P, context: C): InkElement = js.native
}

