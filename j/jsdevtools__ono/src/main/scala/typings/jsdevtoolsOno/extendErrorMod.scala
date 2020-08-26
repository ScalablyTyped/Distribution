package typings.jsdevtoolsOno

import typings.jsdevtoolsOno.typesMod.ErrorLike
import typings.jsdevtoolsOno.typesMod.ErrorPOJO
import typings.jsdevtoolsOno.typesMod.OnoError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jsdevtools/ono/esm/extend-error", JSImport.Namespace)
@js.native
object extendErrorMod extends js.Object {
  def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO): ErrorPOJO with E with P with (OnoError[ErrorPOJO with E with P]) = js.native
  def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: E): ErrorPOJO with E with P with (OnoError[ErrorPOJO with E with P]) = js.native
  def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: E, props: P): ErrorPOJO with E with P with (OnoError[ErrorPOJO with E with P]) = js.native
  def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: js.UndefOr[scala.Nothing], props: P): ErrorPOJO with E with P with (OnoError[ErrorPOJO with E with P]) = js.native
  def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: Error): Error with E with P with (OnoError[Error with E with P]) = js.native
  def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: Error, originalError: E): Error with E with P with (OnoError[Error with E with P]) = js.native
  def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: Error, originalError: E, props: P): Error with E with P with (OnoError[Error with E with P]) = js.native
  def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: Error, originalError: js.UndefOr[scala.Nothing], props: P): Error with E with P with (OnoError[Error with E with P]) = js.native
}

