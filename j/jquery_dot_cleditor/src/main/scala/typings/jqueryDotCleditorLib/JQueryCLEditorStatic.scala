package typings
package jqueryDotCleditorLib

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
  def imagesPath(): java.lang.String
}

object JQueryCLEditorStatic {
  @scala.inline
  def apply(
    buttons: js.Array[JQueryCLEditorButtonDefinition],
    defaultOptions: JQueryCLEditorOptions,
    imagesPath: js.Function0[java.lang.String]
  ): JQueryCLEditorStatic = {
    val __obj = js.Dynamic.literal(buttons = buttons, defaultOptions = defaultOptions, imagesPath = imagesPath)
  
    __obj.asInstanceOf[JQueryCLEditorStatic]
  }
}

