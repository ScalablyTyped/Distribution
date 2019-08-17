package typings.atJupyterlabImageviewer.libWidgetMod

import typings.atJupyterlabApputils.libPrintingMod.PrintingNs.IPrintable
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.Context
import typings.atPhosphorMessaging.atPhosphorMessagingMod.Message
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/imageviewer/lib/widget", "ImageViewer")
@js.native
class ImageViewer protected ()
  extends Widget
     with IPrintable {
  /**
    * Construct a new image widget.
    */
  def this(context: Context) = this()
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
  var colorinversion: Double = js.native
  /**
    * The image widget's context.
    */
  val context: Context = js.native
  /**
    * A promise that resolves when the image viewer is ready.
    */
  val ready: js.Promise[Unit] = js.native
  /**
    * The scale factor for the image.
    */
  var scale: Double = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  /**
    * Flip the image horizontally.
    */
  def flipHorizontal(): Unit = js.native
  /**
    * Flip the image vertically.
    */
  def flipVertical(): Unit = js.native
  /**
    * Process a message sent to the handler.
    *
    * @param msg - The message to be processed.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def processMessage(msg: Message): Unit = js.native
  /**
    * Reset rotation and flip transformations.
    */
  def resetRotationFlip(): Unit = js.native
  /**
    * Rotate the image clockwise (right).
    */
  def rotateClockwise(): Unit = js.native
  /**
    * Rotate the image counter-clockwise (left).
    */
  def rotateCounterclockwise(): Unit = js.native
}

