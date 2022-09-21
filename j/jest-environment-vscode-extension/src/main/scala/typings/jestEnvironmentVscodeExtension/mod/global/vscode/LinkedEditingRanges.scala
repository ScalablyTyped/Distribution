package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.LinkedEditingRanges")
@js.native
open class LinkedEditingRanges protected ()
  extends typings.vscode.mod.LinkedEditingRanges {
  /**
    * Create a new linked editing ranges object.
    *
    * @param ranges A list of ranges that can be edited together
    * @param wordPattern An optional word pattern that describes valid contents for the given ranges
    */
  def this(ranges: js.Array[typings.vscode.mod.Range]) = this()
  def this(ranges: js.Array[typings.vscode.mod.Range], wordPattern: js.RegExp) = this()
}
