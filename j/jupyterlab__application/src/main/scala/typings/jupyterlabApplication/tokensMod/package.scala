package typings.jupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tokensMod {
  type IConnectionLost = js.Function2[
    /* manager */ typings.jupyterlabServices.libManagerMod.ServiceManager.IManager, 
    /* err */ typings.jupyterlabServices.mod.ServerConnection.NetworkError, 
    js.Promise[scala.Unit]
  ]
  type IRouter = typings.jupyterlabApplication.tokensMod.IRouter_
}
