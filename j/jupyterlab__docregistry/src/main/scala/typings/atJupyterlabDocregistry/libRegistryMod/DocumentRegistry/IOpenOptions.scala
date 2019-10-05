package typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry

import typings.atPhosphorWidgets.libDocklayoutMod.DockLayout.InsertMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to open a widget.
  */
trait IOpenOptions extends js.Object {
  /**
    * Whether to activate the widget.  Defaults to `true`.
    */
  var activate: js.UndefOr[Boolean] = js.undefined
  /**
    * The supported insertion modes.
    *
    * An insert mode is used to specify how a widget should be added
    * to the main area relative to a reference widget.
    */
  var mode: js.UndefOr[InsertMode] = js.undefined
  /**
    * The rank order of the widget among its siblings.
    *
    * #### Notes
    * This field may be used or ignored depending on shell implementation.
    */
  var rank: js.UndefOr[Double] = js.undefined
  /**
    * The reference widget id for the insert location.
    *
    * The default is `null`.
    */
  var ref: js.UndefOr[String | Null] = js.undefined
}

object IOpenOptions {
  @scala.inline
  def apply(
    activate: js.UndefOr[Boolean] = js.undefined,
    mode: InsertMode = null,
    rank: Int | Double = null,
    ref: String = null
  ): IOpenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activate)) __obj.updateDynamic("activate")(activate)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[IOpenOptions]
  }
}

