package typings.atJupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTokensMod {
  import typings.atJupyterlabServices.atJupyterlabServicesMod.ServerConnection.NetworkError
  import typings.atJupyterlabServices.libManagerMod.ServiceManager.IManager

  type IConnectionLost = js.Function2[/* manager */ IManager, /* err */ NetworkError, js.Promise[Unit]]
  type IRouter = IRouter_
}
