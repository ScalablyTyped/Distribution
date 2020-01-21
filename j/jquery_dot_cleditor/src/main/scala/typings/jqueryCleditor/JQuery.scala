package typings.jqueryCleditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * If the cleditor object does not exist for a matched textarea element,
    * it will be created using the default options combined with the supplied options.
    * This is the core method for creating and selecting cleditor objects. 
    */
  def cleditor(): CLEditor = js.native
  def cleditor(options: JQueryCLEditorOptions): CLEditor = js.native
}

