package typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a document registry.
  */
trait IOptions extends js.Object {
  /**
    * The initial file types for the registry.
    * The [[DocumentRegistry.defaultFileTypes]] will be used if not given.
    */
  var initialFileTypes: js.UndefOr[js.Array[IFileType]] = js.undefined
  /**
    * The text model factory for the registry.  A default instance will
    * be used if not given.
    */
  var textModelFactory: js.UndefOr[ModelFactory] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(initialFileTypes: js.Array[IFileType] = null, textModelFactory: ModelFactory = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (initialFileTypes != null) __obj.updateDynamic("initialFileTypes")(initialFileTypes)
    if (textModelFactory != null) __obj.updateDynamic("textModelFactory")(textModelFactory)
    __obj.asInstanceOf[IOptions]
  }
}

