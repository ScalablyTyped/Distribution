package typings
package atJupyterlabRendermimeLib.libMimemodelMod.MimeModelNs

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
  var callback: js.UndefOr[
    js.Function1[
      /* options */ atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IMimeModelNs.ISetDataOptions, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * The initial mime data.
    */
  var data: js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject] = js.undefined
  /**
    * The initial mime metadata.
    */
  var metadata: js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject] = js.undefined
  /**
    * Whether the model is trusted.  Defaults to `false`.
    */
  var trusted: js.UndefOr[scala.Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    callback: /* options */ atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IMimeModelNs.ISetDataOptions => scala.Unit = null,
    data: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject = null,
    metadata: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject = null,
    trusted: js.UndefOr[scala.Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (data != null) __obj.updateDynamic("data")(data)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (!js.isUndefined(trusted)) __obj.updateDynamic("trusted")(trusted)
    __obj.asInstanceOf[IOptions]
  }
}

