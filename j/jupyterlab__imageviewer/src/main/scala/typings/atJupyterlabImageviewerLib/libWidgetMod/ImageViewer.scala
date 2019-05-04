package typings
package atJupyterlabImageviewerLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/imageviewer/lib/widget", "ImageViewer")
@js.native
class ImageViewer protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Construct a new image widget.
    */
  def this(context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.Context) = this()
  var _colorinversion: js.Any = js.native
  var _format: js.Any = js.native
  var _img: js.Any = js.native
  var _matrix: js.Any = js.native
  var _mimeType: js.Any = js.native
  /**
    * Handle a change to the title.
    */
  var _onTitleChanged: js.Any = js.native
  var _ready: js.Any = js.native
  /**
    * Render the widget content.
    */
  var _render: js.Any = js.native
  var _scale: js.Any = js.native
  /**
    * Update the image CSS style, including the transform and filter.
    */
  var _updateStyle: js.Any = js.native
  /**
    * The color inversion of the image.
    */
  var colorinversion: scala.Double = js.native
  /**
    * The image widget's context.
    */
  val context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.Context = js.native
  /**
    * A promise that resolves when the image viewer is ready.
    */
  val ready: js.Promise[scala.Unit] = js.native
  /**
    * The scale factor for the image.
    */
  var scale: scala.Double = js.native
  /**
    * Flip the image horizontally.
    */
  def flipHorizontal(): scala.Unit = js.native
  /**
    * Flip the image vertically.
    */
  def flipVertical(): scala.Unit = js.native
  /**
    * Reset rotation and flip transformations.
    */
  def resetRotationFlip(): scala.Unit = js.native
  /**
    * Rotate the image clockwise (right).
    */
  def rotateClockwise(): scala.Unit = js.native
  /**
    * Rotate the image counter-clockwise (left).
    */
  def rotateCounterclockwise(): scala.Unit = js.native
}

