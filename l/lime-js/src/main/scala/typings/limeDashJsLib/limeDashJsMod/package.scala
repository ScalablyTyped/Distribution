package typings
package limeDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object limeDashJsMod {
  type ISessionListener = js.Function1[/* session */ Session, scala.Unit]
  type ITransportEnvelopeListener = js.Function1[/* envelope */ Envelope, scala.Unit]
}
