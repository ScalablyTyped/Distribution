package typings.atJupyterlabCoreutils.libStatedbMod

import typings.atJupyterlabCoreutils.Anon_IdsValuesArray
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.cancel
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.clear
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.merge
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.overwrite
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.remove
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.save
import typings.atJupyterlabCoreutils.libInterfacesMod.IDataConnector
import typings.atJupyterlabCoreutils.libStatedbMod.StateDBNs.DataTransform
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/statedb", "StateDB")
@js.native
object StateDBNs extends js.Object {
  /**
    * A state database change.
    */
  trait Change extends js.Object {
    /**
      * The key of the database item that was changed.
      *
      * #### Notes
      * This field is set to `null` for global changes (i.e. `clear`).
      */
    var id: String | Null
    /**
      * The type of change.
      */
    var `type`: clear | remove | save
  }
  
  /**
    * An in-memory string key/value data connector.
    */
  @js.native
  class Connector () extends IDataConnector[String, String, String] {
    var _storage: js.Any = js.native
    def list(query: String): js.Promise[Anon_IdsValuesArray] = js.native
  }
  
  /**
    * A data transformation that can be applied to a state database.
    */
  trait DataTransform extends js.Object {
    /**
      * The contents of the change operation.
      */
    var contents: ReadonlyJSONObject | Null
    var `type`: cancel | clear | merge | overwrite
  }
  
  /**
    * The instantiation options for a state database.
    */
  trait IOptions extends js.Object {
    /**
      * Optional string key/value connector. Defaults to in-memory connector.
      */
    var connector: js.UndefOr[IDataConnector[String, String, String]] = js.undefined
    /**
      * An optional promise that resolves with a data transformation that is
      * applied to the database contents before the database begins resolving
      * client requests.
      */
    var transform: js.UndefOr[js.Promise[DataTransform]] = js.undefined
  }
  
}

