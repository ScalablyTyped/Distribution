package typings.jupyterlabApputils.mod

import typings.jupyterlabApputils.PartialIButton
import typings.jupyterlabApputils.ReadonlyIButton
import typings.jupyterlabApputils.dialogMod.Dialog.IOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "Dialog")
@js.native
/**
  * Create a dialog panel instance.
  *
  * @param options - The dialog setup options.
  */
class Dialog[T] ()
  extends typings.jupyterlabApputils.dialogMod.Dialog[T] {
  def this(options: Partial[IOptions[T]]) = this()
}

@JSImport("@jupyterlab/apputils", "Dialog")
@js.native
object Dialog extends js.Object {
  /**
    * The default implementation of a dialog renderer.
    */
  @js.native
  class Renderer ()
    extends typings.jupyterlabApputils.dialogMod.Dialog.Renderer
  
  /**
    * The default renderer instance.
    */
  val defaultRenderer: typings.jupyterlabApputils.dialogMod.Dialog.Renderer = js.native
  /**
    * The dialog widget tracker.
    */
  val tracker: typings.jupyterlabApputils.widgettrackerMod.WidgetTracker[typings.jupyterlabApputils.dialogMod.Dialog[js.Any]] = js.native
  /**
    * Create a reject button.
    */
  def cancelButton(): ReadonlyIButton = js.native
  def cancelButton(options: PartialIButton): ReadonlyIButton = js.native
  /**
    * Create a button item.
    */
  def createButton(value: PartialIButton): ReadonlyIButton = js.native
  /**
    * Disposes all dialog instances.
    *
    * #### Notes
    * This function should only be used in tests or cases where application state
    * may be discarded.
    */
  def flush(): Unit = js.native
  /**
    * Create an accept button.
    */
  def okButton(): ReadonlyIButton = js.native
  def okButton(options: PartialIButton): ReadonlyIButton = js.native
  /**
    * Create a warn button.
    */
  def warnButton(): ReadonlyIButton = js.native
  def warnButton(options: PartialIButton): ReadonlyIButton = js.native
}

