package typings.jupyterlabStatusbar

import typings.jupyterlabStatusbar.libComponentsGroupMod.GroupItem.IProps
import typings.jupyterlabStatusbar.libDefaultsKernelStatusMod.KernelStatus.IOptions
import typings.jupyterlabStatusbar.libStatusbarMod.StatusBar
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoCoreutils.mod.Token
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/statusbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def GroupItem(props: IProps & HTMLAttributes[HTMLDivElement]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("GroupItem")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@jupyterlab/statusbar", "IStatusBar")
  @js.native
  val IStatusBar: Token[typings.jupyterlabStatusbar.libTokensMod.IStatusBar] = js.native
  
  @JSImport("@jupyterlab/statusbar", "KernelStatus")
  @js.native
  open class KernelStatus protected ()
    extends typings.jupyterlabStatusbar.libDefaultsMod.KernelStatus {
    /**
      * Construct the kernel status widget.
      */
    def this(opts: IOptions) = this()
    def this(opts: IOptions, translator: ITranslator) = this()
  }
  object KernelStatus {
    
    /**
      * A VDomModel for the kernel status indicator.
      */
    @JSImport("@jupyterlab/statusbar", "KernelStatus.Model")
    @js.native
    open class Model ()
      extends typings.jupyterlabStatusbar.libDefaultsMod.KernelStatus.Model {
      def this(translator: ITranslator) = this()
    }
  }
  
  @JSImport("@jupyterlab/statusbar", "LineCol")
  @js.native
  /**
    * Construct a new LineCol status item.
    */
  open class LineCol ()
    extends typings.jupyterlabStatusbar.libDefaultsMod.LineCol {
    def this(translator: ITranslator) = this()
  }
  object LineCol {
    
    /**
      * A VDom model for a status item tracking the line/column of an editor.
      */
    @JSImport("@jupyterlab/statusbar", "LineCol.Model")
    @js.native
    open class Model ()
      extends typings.jupyterlabStatusbar.libDefaultsMod.LineCol.Model
  }
  
  @JSImport("@jupyterlab/statusbar", "Popup")
  @js.native
  open class Popup protected ()
    extends typings.jupyterlabStatusbar.libComponentsMod.Popup {
    /**
      * Construct a new Popup.
      */
    def this(options: typings.jupyterlabStatusbar.libComponentsHoverMod.Popup.IOptions) = this()
  }
  
  inline def ProgressBar(props: typings.jupyterlabStatusbar.libComponentsProgressBarMod.ProgressBar.IProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ProgressBar")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ProgressCircle(props: typings.jupyterlabStatusbar.libComponentsProgressCircleMod.ProgressCircle.IProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ProgressCircle")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@jupyterlab/statusbar", "RunningSessions")
  @js.native
  open class RunningSessions protected ()
    extends typings.jupyterlabStatusbar.libDefaultsMod.RunningSessions {
    /**
      * Create a new RunningSessions widget.
      */
    def this(opts: typings.jupyterlabStatusbar.libDefaultsRunningSessionsMod.RunningSessions.IOptions) = this()
  }
  object RunningSessions {
    
    /**
      * A VDomModel for the RunningSessions status item.
      */
    @JSImport("@jupyterlab/statusbar", "RunningSessions.Model")
    @js.native
    open class Model ()
      extends typings.jupyterlabStatusbar.libDefaultsMod.RunningSessions.Model
  }
  
  @JSImport("@jupyterlab/statusbar", "StatusBar")
  @js.native
  open class StatusBar_ () extends StatusBar
  
  inline def TextItem(
    props: typings.jupyterlabStatusbar.libComponentsTextMod.TextItem.IProps & HTMLAttributes[HTMLSpanElement]
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("TextItem")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
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
  
  inline def showPopup(options: typings.jupyterlabStatusbar.libComponentsHoverMod.Popup.IOptions): typings.jupyterlabStatusbar.libComponentsHoverMod.Popup = ^.asInstanceOf[js.Dynamic].applyDynamic("showPopup")(options.asInstanceOf[js.Any]).asInstanceOf[typings.jupyterlabStatusbar.libComponentsHoverMod.Popup]
  
  @JSImport("@jupyterlab/statusbar", "side")
  @js.native
  val side: String = js.native
  
  @JSImport("@jupyterlab/statusbar", "statusBar")
  @js.native
  val statusBar: String = js.native
}
