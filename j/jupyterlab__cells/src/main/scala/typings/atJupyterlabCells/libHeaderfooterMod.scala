package typings.atJupyterlabCells

import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/headerfooter", JSImport.Namespace)
@js.native
object libHeaderfooterMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable because Already inherited
  - typings.atPhosphorMessaging.atPhosphorMessagingMod.IMessageHandler because Already inherited
  - typings.atPhosphorDisposable.atPhosphorDisposableMod.IObservableDisposable because Already inherited
  - typings.atPhosphorWidgets.libWidgetMod.Widget because Already inherited
  - typings.atJupyterlabCells.libHeaderfooterMod.ICellFooter because Already inherited */ @js.native
  /**
    * Construct a new cell footer.
    */
  class CellFooter () extends Widget
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable because Already inherited
  - typings.atPhosphorMessaging.atPhosphorMessagingMod.IMessageHandler because Already inherited
  - typings.atPhosphorDisposable.atPhosphorDisposableMod.IObservableDisposable because Already inherited
  - typings.atPhosphorWidgets.libWidgetMod.Widget because Already inherited
  - typings.atJupyterlabCells.libHeaderfooterMod.ICellHeader because Already inherited */ @js.native
  /**
    * Construct a new cell header.
    */
  class CellHeader () extends Widget
  
  type ICellFooter = Widget
  type ICellHeader = Widget
}

