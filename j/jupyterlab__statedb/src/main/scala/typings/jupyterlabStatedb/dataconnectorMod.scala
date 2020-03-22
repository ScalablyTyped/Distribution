package typings.jupyterlabStatedb

import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statedb/lib/dataconnector", JSImport.Namespace)
@js.native
object dataconnectorMod extends js.Object {
  @js.native
  abstract class DataConnector[T, U, V, W] () extends IDataConnector[T, U, V, W]
  
}

