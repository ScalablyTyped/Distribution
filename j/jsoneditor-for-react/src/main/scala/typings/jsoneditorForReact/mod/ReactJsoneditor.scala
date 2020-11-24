package typings.jsoneditorForReact.mod

import typings.jsoneditor.mod.JSONEditorOptions
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactJsoneditor
  extends Component[ReactJsonEditorProps, js.Object, js.Any] {
  
  var editor: js.UndefOr[typings.jsoneditor.mod.default] = js.native
  
  var options: js.UndefOr[JSONEditorOptions] = js.native
}
