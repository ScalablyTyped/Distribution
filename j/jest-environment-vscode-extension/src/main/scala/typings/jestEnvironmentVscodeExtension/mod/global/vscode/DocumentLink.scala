package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.DocumentLink")
@js.native
open class DocumentLink protected ()
  extends typings.vscode.mod.DocumentLink {
  /**
    * Creates a new document link.
    *
    * @param range The range the document link applies to. Must not be empty.
    * @param target The uri the document link points to.
    */
  def this(range: typings.vscode.mod.Range) = this()
  def this(range: typings.vscode.mod.Range, target: typings.vscode.mod.Uri) = this()
}
