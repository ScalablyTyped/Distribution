package typings.jupyterlabRendermime.mimemodelMod.MimeModel

import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a mime model.
  */
trait IOptions extends js.Object {
  /**
    * A callback function for when the data changes.
    */
  var callback: js.UndefOr[js.Function1[/* options */ ISetDataOptions, Unit]] = js.undefined
  /**
    * The initial mime data.
    */
  var data: js.UndefOr[ReadonlyPartialJSONObject] = js.undefined
  /**
    * The initial mime metadata.
    */
  var metadata: js.UndefOr[ReadonlyPartialJSONObject] = js.undefined
  /**
    * Whether the model is trusted.  Defaults to `false`.
    */
  var trusted: js.UndefOr[Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    callback: /* options */ ISetDataOptions => Unit = null,
    data: ReadonlyPartialJSONObject = null,
    metadata: ReadonlyPartialJSONObject = null,
    trusted: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(trusted)) __obj.updateDynamic("trusted")(trusted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

