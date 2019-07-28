package typings.atJupyterlabApplication

import typings.atJupyterlabServices.atJupyterlabServicesMod.ServerConnectionNs.NetworkError
import typings.atJupyterlabServices.libManagerMod.ServiceManagerNs.IManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTokensMod {
  type IConnectionLost = js.Function2[/* manager */ IManager, /* err */ NetworkError, js.Promise[Unit]]
}
