package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.handsontableStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectEditorMod {
  
  @JSImport("handsontable/editors/selectEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: select = js.native
  
  @JSImport("handsontable/editors/selectEditor", "SelectEditor")
  @js.native
  open class SelectEditor protected ()
    extends typings.handsontable.selectEditorSelectEditorMod.SelectEditor {
    def this(instance: default) = this()
  }
}
