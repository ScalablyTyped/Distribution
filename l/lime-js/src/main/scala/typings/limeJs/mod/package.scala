package typings.limeJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ISessionListener = js.Function1[/* session */ typings.limeJs.mod.Session, scala.Unit]
  type ITransportEnvelopeListener = js.Function1[/* envelope */ typings.limeJs.mod.Envelope, scala.Unit]
}
