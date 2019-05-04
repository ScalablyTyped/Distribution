package typings
package atJupyterlabOutputareaLib.libModelMod.IOutputAreaModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a output area model.
  */
trait IOptions extends js.Object {
  /**
    * The output content factory used by the model.
    *
    * If not given, a default factory will be used.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.undefined
  /**
    * An optional IModelDB to store the output area model.
    */
  var modelDB: js.UndefOr[atJupyterlabObservablesLib.libModeldbMod.IModelDB] = js.undefined
  /**
    * Whether the output is trusted.  The default is false.
    */
  var trusted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The initial values for the model.
    */
  var values: js.UndefOr[js.Array[atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IOutput]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    contentFactory: IContentFactory = null,
    modelDB: atJupyterlabObservablesLib.libModeldbMod.IModelDB = null,
    trusted: js.UndefOr[scala.Boolean] = js.undefined,
    values: js.Array[atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IOutput] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory)
    if (modelDB != null) __obj.updateDynamic("modelDB")(modelDB)
    if (!js.isUndefined(trusted)) __obj.updateDynamic("trusted")(trusted)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[IOptions]
  }
}

