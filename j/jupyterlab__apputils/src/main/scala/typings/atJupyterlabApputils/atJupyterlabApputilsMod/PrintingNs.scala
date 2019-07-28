package typings.atJupyterlabApputils.atJupyterlabApputilsMod

import typings.atJupyterlabApputils.libPrintingMod.PrintingNs.OptionalAsyncThunk
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "Printing")
@js.native
object PrintingNs extends js.Object {
  /**
    * Symbol to use for a method that returns a function to print an object.
    */
  val symbol: js.Symbol = js.native
  /**
    * Returns the print function for an object, or null if it does not provide a handler.
    */
  def getPrintFunction(`val`: js.Any): OptionalAsyncThunk = js.native
  /**
    * Returns whether an object implements a print method.
    */
  def isPrintable(a: js.Any): /* is @jupyterlab/apputils.@jupyterlab/apputils/lib/printing.Printing.IPrintable */ Boolean = js.native
  /**
    * Prints a URL by loading it into an iframe.
    *
    * @param url URL to load into an iframe.
    */
  def printURL(url: String): js.Promise[Unit] = js.native
  /**
    * Prints a widget by copying it's DOM node
    * to a hidden iframe and printing that iframe.
    */
  def printWidget(widget: Widget): js.Promise[Unit] = js.native
}

