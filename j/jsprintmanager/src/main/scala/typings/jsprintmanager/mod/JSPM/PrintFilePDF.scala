package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsprintmanager", "JSPM.PrintFilePDF")
@js.native
class PrintFilePDF protected () extends PrintFile {
  def this(fileContent: js.Any, fileContentType: FileSourceType, fileName: String) = this()
  def this(fileContent: js.Any, fileContentType: FileSourceType, fileName: String, copies: Double) = this()
  
  /* private */ def getBLOBContent(): js.Any = js.native
  
  def isValidRange(range: String): Boolean = js.native
  
  var printAnnotations: Boolean = js.native
  
  var printAsGrayscale: Boolean = js.native
  
  var printInReverseOrder: Boolean = js.native
  
  var printRange: String = js.native
  
  var printRotation: PrintRotation = js.native
}
