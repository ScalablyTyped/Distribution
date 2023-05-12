package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.ParameterInformation")
@js.native
open class ParameterInformation protected ()
  extends typings.vscode.mod.ParameterInformation {
  /**
  		 * Creates a new parameter information object.
  		 *
  		 * @param label A label string or inclusive start and exclusive end offsets within its containing signature label.
  		 * @param documentation A doc string.
  		 */
  def this(label: String) = this()
  def this(label: js.Tuple2[Double, Double]) = this()
  def this(label: String, documentation: String) = this()
  def this(label: String, documentation: typings.vscode.mod.MarkdownString) = this()
  def this(label: js.Tuple2[Double, Double], documentation: String) = this()
  def this(label: js.Tuple2[Double, Double], documentation: typings.vscode.mod.MarkdownString) = this()
}
