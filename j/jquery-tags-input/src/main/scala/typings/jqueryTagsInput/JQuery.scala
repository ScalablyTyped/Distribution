package typings.jqueryTagsInput

import typings.jqueryTagsInput.jQueryTagsInput.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * Add a new tag to list
    * @param tag value
    */
  def addTag(tag: String): Boolean = js.native
  
  /**
    * Add a new tags
    * @param tags string separated by delimiter
    */
  def importTags(tags: String): Unit = js.native
  
  /**
    * Remove tag with value from list
    * @param tag to be removed
    */
  def removeTag(tag: String): Boolean = js.native
  
  /**
    * Verify if tag exists
    * @param tag value
    */
  def tagExist(tag: String): Boolean = js.native
  
  /**
    * Transform input field to work with tags
    * @param options for creation
    */
  def tagsInput(): JQuery = js.native
  def tagsInput(options: Options): JQuery = js.native
}
