package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsprintmanager", "JSPM.InstalledPrinter")
@js.native
open class InstalledPrinter protected ()
  extends StObject
     with IClientPrinter {
  def this(printerName: String) = this()
  def this(printerName: String, printToDefaultIfNotFound: Boolean) = this()
  def this(printerName: String, printToDefaultIfNotFound: Boolean, trayName: String) = this()
  def this(printerName: String, printToDefaultIfNotFound: Unit, trayName: String) = this()
  def this(printerName: String, printToDefaultIfNotFound: Boolean, trayName: String, paperName: String) = this()
  def this(printerName: String, printToDefaultIfNotFound: Boolean, trayName: Unit, paperName: String) = this()
  def this(printerName: String, printToDefaultIfNotFound: Unit, trayName: String, paperName: String) = this()
  def this(printerName: String, printToDefaultIfNotFound: Unit, trayName: Unit, paperName: String) = this()
  
  /* CompleteClass */
  var Id: Any = js.native
  @JSName("Id")
  var Id_InstalledPrinter: String = js.native
  
  /* private */ var _name: Any = js.native
  
  /* private */ var _paper: Any = js.native
  
  /* private */ var _printDefault: Any = js.native
  
  /* private */ var _tray: Any = js.native
  
  /* private */ def bool2str(value: Any, true_val: Any, false_val: Any): Any = js.native
  
  var paperName: String = js.native
  
  var printToDefaultIfNotFound: Boolean = js.native
  
  var printerName: String = js.native
  
  /* CompleteClass */
  override def serialize(): Any = js.native
  
  var trayName: String = js.native
}
