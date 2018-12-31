package typings
package jqueryDashTagsDashInputLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Add a new tag to list
    * @param tag value
    */
  def addTag(tag: java.lang.String): scala.Boolean = js.native
  /**
    * Add a new tags
    * @param tags string separated by delimiter
    */
  def importTags(tags: java.lang.String): scala.Unit = js.native
  /**
    * Remove tag with value from list
    * @param tag to be removed
    */
  def removeTag(tag: java.lang.String): scala.Boolean = js.native
  /**
    * Verify if tag exists
    * @param tag value
    */
  def tagExist(tag: java.lang.String): scala.Boolean = js.native
  /**
    * Transform input field to work with tags
    * @param options for creation
    */
  def tagsInput(): JQuery = js.native
  def tagsInput(options: jqueryDashTagsDashInputLib.jQueryTagsInputNs.Options): JQuery = js.native
}

