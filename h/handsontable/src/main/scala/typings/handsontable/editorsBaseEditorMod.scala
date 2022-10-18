package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.handsontableStrings.base
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorsBaseEditorMod {
  
  /* note: abstract class */ @JSImport("handsontable/editors/baseEditor", "BaseEditor")
  @js.native
  open class BaseEditor protected ()
    extends typings.handsontable.editorsBaseEditorBaseEditorMod.BaseEditor {
    def this(instance: default) = this()
  }
  
  /* Inlined std.Readonly<{  VIRGIN :string,   EDITING :string,   WAITING :string,   FINISHED :string}> */
  object EDITOR_STATE {
    
    @JSImport("handsontable/editors/baseEditor", "EDITOR_STATE.EDITING")
    @js.native
    val EDITING: String = js.native
    
    @JSImport("handsontable/editors/baseEditor", "EDITOR_STATE.FINISHED")
    @js.native
    val FINISHED: String = js.native
    
    @JSImport("handsontable/editors/baseEditor", "EDITOR_STATE.VIRGIN")
    @js.native
    val VIRGIN: String = js.native
    
    @JSImport("handsontable/editors/baseEditor", "EDITOR_STATE.WAITING")
    @js.native
    val WAITING: String = js.native
  }
  
  @JSImport("handsontable/editors/baseEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: base = js.native
}
