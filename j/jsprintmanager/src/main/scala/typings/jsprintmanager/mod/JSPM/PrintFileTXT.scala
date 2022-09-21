package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsprintmanager", "JSPM.PrintFileTXT")
@js.native
open class PrintFileTXT protected () extends PrintFile {
  def this(fileContent: String, fileName: String) = this()
  def this(fileContent: String, fileName: String, copies: Double) = this()
  
  var fontBold: Boolean = js.native
  
  var fontColor: String = js.native
  
  var fontItalic: Boolean = js.native
  
  var fontName: String = js.native
  
  var fontSize: Double = js.native
  
  var fontStrikethrough: Boolean = js.native
  
  var fontUnderline: Boolean = js.native
  
  var marginBottom: Double = js.native
  
  var marginLeft: Double = js.native
  
  var marginRight: Double = js.native
  
  var marginTop: Double = js.native
  
  var printOrientation: PrintOrientation = js.native
  
  var textAligment: TextAlignment = js.native
  
  var textContent: String = js.native
}
