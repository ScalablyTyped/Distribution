package typings.atJupyterlabMarkdownviewer.libWidgetMod

import typings.atJupyterlabMarkdownviewer.atJupyterlabMarkdownviewerStrings.fontFamily
import typings.atJupyterlabMarkdownviewer.atJupyterlabMarkdownviewerStrings.fontSize
import typings.atJupyterlabMarkdownviewer.atJupyterlabMarkdownviewerStrings.hideFrontMatter
import typings.atJupyterlabMarkdownviewer.atJupyterlabMarkdownviewerStrings.lineHeight
import typings.atJupyterlabMarkdownviewer.atJupyterlabMarkdownviewerStrings.lineWidth
import typings.atJupyterlabMarkdownviewer.atJupyterlabMarkdownviewerStrings.renderTimeout
import typings.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewer.IOptions
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IRenderer
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/markdownviewer/lib/widget", "MarkdownViewer")
@js.native
class MarkdownViewer_ protected () extends Widget {
  /**
    * Construct a new markdown viewer widget.
    */
  def this(options: IOptions) = this()
  var _config: js.Any = js.native
  var _fragment: js.Any = js.native
  var _isRendering: js.Any = js.native
  var _monitor: js.Any = js.native
  var _ready: js.Any = js.native
  /**
    * Render the mime content.
    */
  var _render: js.Any = js.native
  var _renderRequested: js.Any = js.native
  val context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.Context */ js.Any = js.native
  /**
    * A promise that resolves when the markdown viewer is ready.
    */
  val ready: js.Promise[Unit] = js.native
  val renderer: IRenderer = js.native
  /**
    * Set URI fragment identifier.
    */
  def setFragment(fragment: String): Unit = js.native
  @JSName("setOption")
  def setOption_fontFamily(option: fontFamily): Unit = js.native
  /**
    * Set a config option for the markdown viewer.
    */
  @JSName("setOption")
  def setOption_fontFamily(option: fontFamily, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_fontSize(option: fontSize): Unit = js.native
  @JSName("setOption")
  def setOption_fontSize(option: fontSize, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_hideFrontMatter(option: hideFrontMatter, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_lineHeight(option: lineHeight): Unit = js.native
  @JSName("setOption")
  def setOption_lineHeight(option: lineHeight, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_lineWidth(option: lineWidth): Unit = js.native
  @JSName("setOption")
  def setOption_lineWidth(option: lineWidth, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_renderTimeout(option: renderTimeout, value: Double): Unit = js.native
}

