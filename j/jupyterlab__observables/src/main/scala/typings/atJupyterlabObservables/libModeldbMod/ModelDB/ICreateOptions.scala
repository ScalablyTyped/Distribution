package typings.atJupyterlabObservables.libModeldbMod.ModelDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a `ModelDB` object.
  */
trait ICreateOptions extends js.Object {
  /**
    * A ModelDB to use as the store for this
    * ModelDB. If none is given, it uses its own store.
    */
  var baseDB: js.UndefOr[typings.atJupyterlabObservables.libModeldbMod.ModelDB] = js.undefined
  /**
    * The base path to prepend to all the path arguments.
    */
  var basePath: js.UndefOr[String] = js.undefined
}

object ICreateOptions {
  @scala.inline
  def apply(baseDB: typings.atJupyterlabObservables.libModeldbMod.ModelDB = null, basePath: String = null): ICreateOptions = {
    val __obj = js.Dynamic.literal()
    if (baseDB != null) __obj.updateDynamic("baseDB")(baseDB.asInstanceOf[js.Any])
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateOptions]
  }
}

