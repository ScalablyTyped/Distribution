package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.Location")
@js.native
open class Location protected ()
  extends typings.vscode.mod.Location {
  def this(uri: typings.vscode.mod.Uri, rangeOrPosition: typings.vscode.mod.Position) = this()
  /**
    * Creates a new location object.
    *
    * @param uri The resource identifier.
    * @param rangeOrPosition The range or position. Positions will be converted to an empty range.
    */
  def this(uri: typings.vscode.mod.Uri, rangeOrPosition: typings.vscode.mod.Range) = this()
}
