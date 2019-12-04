package typings.atJupyterlabSettingeditor

import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor/lib/splitpanel", JSImport.Namespace)
@js.native
object libSplitpanelMod extends js.Object {
  @js.native
  class SplitPanel ()
    extends typings.atPhosphorWidgets.atPhosphorWidgetsMod.SplitPanel {
    /**
      * Emits when the split handle has moved.
      */
    val handleMoved: ISignal[_, Unit] = js.native
  }
  
}

