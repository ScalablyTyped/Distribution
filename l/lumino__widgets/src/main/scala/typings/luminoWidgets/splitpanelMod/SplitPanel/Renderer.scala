package typings.luminoWidgets.splitpanelMod.SplitPanel

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of `IRenderer`.
  */
@JSImport("@lumino/widgets/lib/splitpanel", "SplitPanel.Renderer")
@js.native
class Renderer ()
  extends typings.luminoWidgets.splitlayoutMod.SplitLayout.IRenderer {
  /**
    * Create a new handle for use with a split layout.
    *
    * @returns A new handle element.
    */
  /* CompleteClass */
  override def createHandle(): HTMLDivElement = js.native
}

