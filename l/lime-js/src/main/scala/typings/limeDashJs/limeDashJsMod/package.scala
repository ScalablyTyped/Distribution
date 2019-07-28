package typings.limeDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object limeDashJsMod {
  type ISessionListener = js.Function1[/* session */ Session, Unit]
  type ITransportEnvelopeListener = js.Function1[/* envelope */ Envelope, Unit]
}
