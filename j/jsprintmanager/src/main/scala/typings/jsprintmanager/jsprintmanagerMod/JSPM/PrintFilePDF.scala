package typings.jsprintmanager.jsprintmanagerMod.JSPM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsprintmanager", "JSPM.PrintFilePDF")
@js.native
class PrintFilePDF protected () extends PrintFile {
  def this(fileContent: js.Any, fileContentType: FileSourceType, fileName: String) = this()
  def this(fileContent: js.Any, fileContentType: FileSourceType, fileName: String, copies: Double) = this()
  var printAnnotations: Boolean = js.native
  var printAsGrayscale: Boolean = js.native
  var printInReverseOrder: Boolean = js.native
  var printRange: String = js.native
  var printRotation: PrintRotation = js.native
  /* private */ def getBLOBContent(): js.Any = js.native
  def isValidRange(range: String): Boolean = js.native
}

