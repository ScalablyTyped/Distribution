package typings.atJupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTokensMod {
  import typings.atJupyterlabServices.atJupyterlabServicesMod.ServerConnectionNs.NetworkError
  import typings.atJupyterlabServices.libManagerMod.ServiceManagerNs.IManager

  type IConnectionLost = js.Function2[/* manager */ IManager, /* err */ NetworkError, js.Promise[Unit]]
}
