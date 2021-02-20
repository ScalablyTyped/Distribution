package typings.jqueryCleditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains global properties and methods used to create
  * custom plugins and override built in functionality.
  */
@js.native
trait JQueryCLEditorStatic extends StObject {
  
  var buttons: js.Array[JQueryCLEditorButtonDefinition] = js.native
  
  var defaultOptions: JQueryCLEditorOptions = js.native
  
  def imagesPath(): String = js.native
}
object JQueryCLEditorStatic {
  
  @scala.inline
  def apply(
    buttons: js.Array[JQueryCLEditorButtonDefinition],
    defaultOptions: JQueryCLEditorOptions,
    imagesPath: () => String
  ): JQueryCLEditorStatic = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], defaultOptions = defaultOptions.asInstanceOf[js.Any], imagesPath = js.Any.fromFunction0(imagesPath))
    __obj.asInstanceOf[JQueryCLEditorStatic]
  }
  
  @scala.inline
  implicit class JQueryCLEditorStaticMutableBuilder[Self <: JQueryCLEditorStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[JQueryCLEditorButtonDefinition]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: JQueryCLEditorButtonDefinition*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setDefaultOptions(value: JQueryCLEditorOptions): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesPath(value: () => String): Self = StObject.set(x, "imagesPath", js.Any.fromFunction0(value))
  }
}
