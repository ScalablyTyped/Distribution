package typings.inputDashMoment

import typings.moment.momentMod.Moment
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inputDashMomentMod {
  type InputMoment = Component[InputMomentProps, js.Object, js.Any]
  type OnChangeListener = js.Function1[/* m */ Moment, Unit]
  type OnSaveListener = js.Function0[Unit]
}
