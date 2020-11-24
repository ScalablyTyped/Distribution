package typings.jsprintmanager.mod.JSPM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsprintmanager", "JSPM.InstalledPrinter")
@js.native
class InstalledPrinter protected () extends IClientPrinter {
  def this(printerName: String) = this()
  def this(printerName: String, printToDefaultIfNotFound: Boolean) = this()
  def this(printerName: String, printToDefaultIfNotFound: js.UndefOr[scala.Nothing], trayName: String) = this()
  def this(printerName: String, printToDefaultIfNotFound: Boolean, trayName: String) = this()
  def this(
    printerName: String,
    printToDefaultIfNotFound: js.UndefOr[scala.Nothing],
    trayName: js.UndefOr[scala.Nothing],
    paperName: String
  ) = this()
  def this(
    printerName: String,
    printToDefaultIfNotFound: js.UndefOr[scala.Nothing],
    trayName: String,
    paperName: String
  ) = this()
  def this(
    printerName: String,
    printToDefaultIfNotFound: Boolean,
    trayName: js.UndefOr[scala.Nothing],
    paperName: String
  ) = this()
  def this(printerName: String, printToDefaultIfNotFound: Boolean, trayName: String, paperName: String) = this()
  
  @JSName("Id")
  var Id_InstalledPrinter: String = js.native
  
  var _name: js.Any = js.native
  
  var _paper: js.Any = js.native
  
  var _printDefault: js.Any = js.native
  
  var _tray: js.Any = js.native
  
  /* private */ def bool2str(value: js.Any, true_val: js.Any, false_val: js.Any): js.Any = js.native
  
  var paperName: String = js.native
  
  var printToDefaultIfNotFound: Boolean = js.native
  
  var printerName: String = js.native
  
  var trayName: String = js.native
}
