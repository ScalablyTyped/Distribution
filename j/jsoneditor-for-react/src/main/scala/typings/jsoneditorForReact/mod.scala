package typings.jsoneditorForReact

import typings.jsoneditor.mod.JSONEditorOptions
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsoneditor-for-react", JSImport.Default)
  @js.native
  class default () extends ReactJsoneditor
  
  trait ReactJsonEditorProps extends StObject
  
  @js.native
  trait ReactJsoneditor
    extends Component[ReactJsonEditorProps, js.Object, js.Any] {
    
    var editor: js.UndefOr[typings.jsoneditor.mod.default] = js.native
    
    var options: js.UndefOr[JSONEditorOptions] = js.native
  }
}
