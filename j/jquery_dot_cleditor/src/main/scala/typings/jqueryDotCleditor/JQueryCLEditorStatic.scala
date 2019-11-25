package typings.jqueryDotCleditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains global properties and methods used to create
  * custom plugins and override built in functionality.
  */
trait JQueryCLEditorStatic extends js.Object {
  var buttons: js.Array[JQueryCLEditorButtonDefinition]
  var defaultOptions: JQueryCLEditorOptions
  def imagesPath(): String
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
}

