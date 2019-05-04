package typings
package atJupyterlabDocmanagerLib.libManagerMod.DocumentManagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a widget opener.
  */
@js.native
trait IWidgetOpener extends js.Object {
  /**
    * Open the given widget.
    */
  def open(
    widget: atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
      atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
      atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
    ]
  ): scala.Unit = js.native
  def open(
    widget: atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
      atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
      atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
    ],
    options: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IOpenOptions
  ): scala.Unit = js.native
}

