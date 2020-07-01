package typings.jupyterlabStatedb.statedbMod.StateDB

import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a state database.
  */
trait IOptions[T /* <: ReadonlyPartialJSONValue */] extends js.Object {
  /**
    * Optional string key/value connector. Defaults to in-memory connector.
    */
  var connector: js.UndefOr[IDataConnector[String, String, String, String]] = js.undefined
  /**
    * An optional promise that resolves with a data transformation that is
    * applied to the database contents before the database begins resolving
    * client requests.
    */
  var transform: js.UndefOr[js.Promise[DataTransform[T]]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply[/* <: typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue */ T](
    connector: IDataConnector[String, String, String, String] = null,
    transform: js.Promise[DataTransform[T]] = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (connector != null) __obj.updateDynamic("connector")(connector.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

