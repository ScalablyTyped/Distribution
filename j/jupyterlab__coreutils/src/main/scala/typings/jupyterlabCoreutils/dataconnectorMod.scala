package typings.jupyterlabCoreutils

import typings.jupyterlabCoreutils.interfacesMod.IDataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/dataconnector", JSImport.Namespace)
@js.native
object dataconnectorMod extends js.Object {
  @js.native
  abstract class DataConnector[T, U, V] () extends IDataConnector[T, U, V]
  
}

