package typings.jupyterlabStatedb.statedbMod.StateDB

import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An in-memory string key/value data connector.
  */
@JSImport("@jupyterlab/statedb/lib/statedb", "StateDB.Connector")
@js.native
class Connector () extends IDataConnector[String, String, String, String] {
  var _storage: js.Any = js.native
}

