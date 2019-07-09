package typings
package atJupyterlabCoreutilsLib.libStatedbMod

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
    var id: java.lang.String | scala.Null
    /**
      * The type of change.
      */
    var `type`: atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.clear | atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.remove | atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.save
  }
  
  /**
    * An in-memory string key/value data connector.
    */
  @js.native
  class Connector ()
    extends atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[java.lang.String, java.lang.String, java.lang.String] {
    var _storage: js.Any = js.native
    def list(query: java.lang.String): js.Promise[atJupyterlabCoreutilsLib.Anon_IdsValuesArray] = js.native
  }
  
  /**
    * A data transformation that can be applied to a state database.
    */
  trait DataTransform extends js.Object {
    /**
      * The contents of the change operation.
      */
    var contents: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject | scala.Null
    var `type`: atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.cancel | atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.clear | atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.merge | atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.overwrite
  }
  
  /**
    * The instantiation options for a state database.
    */
  trait IOptions extends js.Object {
    /**
      * Optional string key/value connector. Defaults to in-memory connector.
      */
    var connector: js.UndefOr[
        atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[java.lang.String, java.lang.String, java.lang.String]
      ] = js.undefined
    /**
      * An optional promise that resolves with a data transformation that is
      * applied to the database contents before the database begins resolving
      * client requests.
      */
    var transform: js.UndefOr[js.Promise[DataTransform]] = js.undefined
  }
  
}

