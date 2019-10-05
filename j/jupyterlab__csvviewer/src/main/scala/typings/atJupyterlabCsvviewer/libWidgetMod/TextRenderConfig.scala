package typings.atJupyterlabCsvviewer.libWidgetMod

import typings.atPhosphorDatagrid.libTextrendererMod.TextRenderer.HorizontalAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer/lib/widget", "TextRenderConfig")
@js.native
class TextRenderConfig () extends js.Object {
  /**
    * background color for the current search match.
    */
  var currentMatchBackgroundColor: String = js.native
  /**
    * horizontalAlignment of the text
    */
  var horizontalAlignment: HorizontalAlignment = js.native
  /**
    * background color for a search match
    */
  var matchBackgroundColor: String = js.native
  /**
    * default text color
    */
  var textColor: String = js.native
}

