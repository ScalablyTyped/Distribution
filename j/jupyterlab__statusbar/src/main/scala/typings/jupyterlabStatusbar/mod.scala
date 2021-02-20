package typings.jupyterlabStatusbar

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabStatusbar.groupMod.GroupItem.IProps
import typings.jupyterlabStatusbar.kernelStatusMod.KernelStatus.IOptions
import typings.jupyterlabStatusbar.statusbarMod.StatusBar
import typings.luminoCoreutils.mod.Token
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object GroupItem {
    
    @JSImport("@jupyterlab/statusbar", "GroupItem")
    @js.native
    def apply(props: IProps with HTMLAttributes[HTMLDivElement]): ReactElement = js.native
  }
  
  object IStatusBar extends Shortcut {
    
    @JSImport("@jupyterlab/statusbar", "IStatusBar")
    @js.native
    val ^ : Token[typings.jupyterlabStatusbar.tokensMod.IStatusBar] = js.native
    
    type _To = Token[typings.jupyterlabStatusbar.tokensMod.IStatusBar]
    
    /* This means you don't have to write `^`, but can instead just say `IStatusBar.foo` */
    override def _to: Token[typings.jupyterlabStatusbar.tokensMod.IStatusBar] = ^
  }
  
  @JSImport("@jupyterlab/statusbar", "KernelStatus")
  @js.native
  class KernelStatus protected ()
    extends typings.jupyterlabStatusbar.defaultsMod.KernelStatus {
    /**
      * Construct the kernel status widget.
      */
    def this(opts: IOptions) = this()
  }
  object KernelStatus {
    
    /**
      * A VDomModel for the kernel status indicator.
      */
    @JSImport("@jupyterlab/statusbar", "KernelStatus.Model")
    @js.native
    class Model ()
      extends typings.jupyterlabStatusbar.defaultsMod.KernelStatus.Model
  }
  
  @JSImport("@jupyterlab/statusbar", "LineCol")
  @js.native
  /**
    * Construct a new LineCol status item.
    */
  class LineCol ()
    extends typings.jupyterlabStatusbar.defaultsMod.LineCol
  object LineCol {
    
    /**
      * A VDom model for a status item tracking the line/column of an editor.
      */
    @JSImport("@jupyterlab/statusbar", "LineCol.Model")
    @js.native
    class Model ()
      extends typings.jupyterlabStatusbar.defaultsMod.LineCol.Model
  }
  
  @JSImport("@jupyterlab/statusbar", "MemoryUsage")
  @js.native
  /**
    * Construct a new memory usage status item.
    */
  class MemoryUsage ()
    extends typings.jupyterlabStatusbar.defaultsMod.MemoryUsage
  object MemoryUsage {
    
    /**
      * A VDomModel for the memory usage status item.
      */
    @JSImport("@jupyterlab/statusbar", "MemoryUsage.Model")
    @js.native
    class Model protected ()
      extends typings.jupyterlabStatusbar.defaultsMod.MemoryUsage.Model {
      /**
        * Construct a new memory usage model.
        *
        * @param options: the options for creating the model.
        */
      def this(options: typings.jupyterlabStatusbar.memoryUsageMod.MemoryUsage.Model.IOptions) = this()
    }
    /**
      * A namespace for Model statics.
      */
    object Model
  }
  
  @JSImport("@jupyterlab/statusbar", "Popup")
  @js.native
  class Popup protected ()
    extends typings.jupyterlabStatusbar.componentsMod.Popup {
    /**
      * Construct a new Popup.
      */
    def this(options: typings.jupyterlabStatusbar.hoverMod.Popup.IOptions) = this()
  }
  
  object ProgressBar {
    
    @JSImport("@jupyterlab/statusbar", "ProgressBar")
    @js.native
    def apply(props: typings.jupyterlabStatusbar.progressBarMod.ProgressBar.IProps): Element = js.native
  }
  
  @JSImport("@jupyterlab/statusbar", "RunningSessions")
  @js.native
  class RunningSessions protected ()
    extends typings.jupyterlabStatusbar.defaultsMod.RunningSessions {
    /**
      * Create a new RunningSessions widget.
      */
    def this(opts: typings.jupyterlabStatusbar.runningSessionsMod.RunningSessions.IOptions) = this()
  }
  object RunningSessions {
    
    /**
      * A VDomModel for the RunninSessions status item.
      */
    @JSImport("@jupyterlab/statusbar", "RunningSessions.Model")
    @js.native
    class Model ()
      extends typings.jupyterlabStatusbar.defaultsMod.RunningSessions.Model
  }
  
  @JSImport("@jupyterlab/statusbar", "StatusBar")
  @js.native
  class StatusBar_ () extends StatusBar
  
  object TextItem {
    
    @JSImport("@jupyterlab/statusbar", "TextItem")
    @js.native
    def apply(props: typings.jupyterlabStatusbar.textMod.TextItem.IProps with HTMLAttributes[HTMLSpanElement]): ReactElement = js.native
  }
  
  @JSImport("@jupyterlab/statusbar", "clickedItem")
  @js.native
  val clickedItem: String = js.native
  
  @JSImport("@jupyterlab/statusbar", "interactiveItem")
  @js.native
  val interactiveItem: String = js.native
  
  @JSImport("@jupyterlab/statusbar", "item")
  @js.native
  val item: String = js.native
  
  @JSImport("@jupyterlab/statusbar", "leftSide")
  @js.native
  val leftSide: String = js.native
  
  @JSImport("@jupyterlab/statusbar", "rightSide")
  @js.native
  val rightSide: String = js.native
  
  @JSImport("@jupyterlab/statusbar", "showPopup")
  @js.native
  def showPopup(options: typings.jupyterlabStatusbar.hoverMod.Popup.IOptions): typings.jupyterlabStatusbar.hoverMod.Popup = js.native
  
  @JSImport("@jupyterlab/statusbar", "side")
  @js.native
  val side: String = js.native
  
  @JSImport("@jupyterlab/statusbar", "statusBar")
  @js.native
  val statusBar: String = js.native
  
  /**
    * A namespace for LineColComponent.
    */
  object LineColComponent
}
