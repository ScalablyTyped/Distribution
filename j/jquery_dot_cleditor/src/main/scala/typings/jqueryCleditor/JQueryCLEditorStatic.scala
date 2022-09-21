package typings.jqueryCleditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains global properties and methods used to create
  * custom plugins and override built in functionality.
  */
trait JQueryCLEditorStatic extends StObject {
  
  var buttons: js.Array[JQueryCLEditorButtonDefinition]
  
  var defaultOptions: JQueryCLEditorOptions
  
  def imagesPath(): String
}
object JQueryCLEditorStatic {
  
  inline def apply(
    buttons: js.Array[JQueryCLEditorButtonDefinition],
    defaultOptions: JQueryCLEditorOptions,
    imagesPath: () => String
  ): JQueryCLEditorStatic = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], defaultOptions = defaultOptions.asInstanceOf[js.Any], imagesPath = js.Any.fromFunction0(imagesPath))
    __obj.asInstanceOf[JQueryCLEditorStatic]
  }
  
  extension [Self <: JQueryCLEditorStatic](x: Self) {
    
    inline def setButtons(value: js.Array[JQueryCLEditorButtonDefinition]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsVarargs(value: JQueryCLEditorButtonDefinition*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setDefaultOptions(value: JQueryCLEditorOptions): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    
    inline def setImagesPath(value: () => String): Self = StObject.set(x, "imagesPath", js.Any.fromFunction0(value))
  }
}
