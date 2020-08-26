package typings.jsprintmanager.mod.JSPM

import typings.jsprintmanager.mod.zip.Reader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsprintmanager", "JSPM.PrintFile")
@js.native
class PrintFile protected () extends js.Object {
  def this(fileContent: js.Any, fileContentType: FileSourceType, fileName: String) = this()
  def this(fileContent: js.Any, fileContentType: FileSourceType, fileName: String, copies: Double) = this()
  var _copies: js.Any = js.native
  var copies: Double = js.native
  var fileContent: js.Any = js.native
  var fileContentType: FileSourceType = js.native
  var fileName: String = js.native
  /* protected */ def bool2str(value: js.Any): String = js.native
  /* protected */ def bool2str(value: js.Any, true_val: js.UndefOr[scala.Nothing], false_val: String): String = js.native
  /* protected */ def bool2str(value: js.Any, true_val: String): String = js.native
  /* protected */ def bool2str(value: js.Any, true_val: String, false_val: String): String = js.native
  /* private */ def escapeInvalidFileNameChars(): js.Any = js.native
  def serialize(): js.Promise[Reader] = js.native
}

