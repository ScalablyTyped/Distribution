package typings.jqueryTagsmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def tagsManager(): JQuery = js.native
  def tagsManager(command: String): JQuery = js.native
  def tagsManager(command: String, tagToManipulate: String): JQuery = js.native
  def tagsManager(options: ITagsManagerOptions): JQuery = js.native
}

