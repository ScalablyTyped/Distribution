package typings.jqueryCleditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var cleditor: JQueryCLEditorStatic
}

object JQueryStatic {
  @scala.inline
  def apply(cleditor: JQueryCLEditorStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(cleditor = cleditor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

