package typings.jsprintmanager.mod.JSPM

import typings.jsprintmanager.mod.zip.Reader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsprintmanager", "JSPM.PrintFile")
@js.native
open class PrintFile protected () extends StObject {
  def this(fileContent: Any, fileContentType: FileSourceType, fileName: String) = this()
  def this(fileContent: Any, fileContentType: FileSourceType, fileName: String, copies: Double) = this()
  
  /* private */ var _copies: Any = js.native
  
  /* protected */ def bool2str(value: Any): String = js.native
  /* protected */ def bool2str(value: Any, true_val: String): String = js.native
  /* protected */ def bool2str(value: Any, true_val: String, false_val: String): String = js.native
  /* protected */ def bool2str(value: Any, true_val: Unit, false_val: String): String = js.native
  
  var copies: Double = js.native
  
  /* private */ def escapeInvalidFileNameChars(): Any = js.native
  
  var fileContent: Any = js.native
  
  var fileContentType: FileSourceType = js.native
  
  var fileName: String = js.native
  
  def serialize(): js.Promise[Reader] = js.native
}
