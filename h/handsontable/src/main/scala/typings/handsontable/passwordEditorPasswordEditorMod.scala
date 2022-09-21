package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.handsontableStrings.password
import typings.handsontable.textEditorMod.TextEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object passwordEditorPasswordEditorMod {
  
  @JSImport("handsontable/editors/passwordEditor/passwordEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: password = js.native
  
  @JSImport("handsontable/editors/passwordEditor/passwordEditor", "PasswordEditor")
  @js.native
  open class PasswordEditor protected () extends TextEditor {
    def this(instance: default) = this()
  }
}
