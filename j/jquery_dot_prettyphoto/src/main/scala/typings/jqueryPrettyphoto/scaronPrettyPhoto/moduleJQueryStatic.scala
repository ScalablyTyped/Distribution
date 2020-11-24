package typings.jqueryPrettyphoto.scaronPrettyPhoto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait moduleJQueryStatic extends js.Object {
  
  /**
    * Change gallery page in the prettyPhoto modal box
    * @param direction {String} Direction of the paging, previous or next.
    */
  def changeGalleryPage(direction: String): Unit = js.native
  
  /**
    * Change page in the prettyPhoto modal box
    * @param direction {String} Direction of the paging, previous or next.
    */
  def changePage(direction: String): Unit = js.native
  
  /**
    * Closes prettyPhoto.
    */
  def close(): Unit = js.native
  
  /**
    * Opens the prettyPhoto modal box.
    * Note: Always returns false.
    */
  def open(): Boolean = js.native
  /**
    * Opens the prettyPhoto modal box.
    * Note: Always returns false.
    * @param image {String} Full path to the image to be open, can also be an array containing full images paths.
    * @param title {String} The title to be displayed with the picture, can also be an array containing all the titles.
    * @param description {String} The description to be displayed with the picture, can also be an array containing all the descriptions.
    */
  def open(image: String, title: String, description: String): Boolean = js.native
  /**
    * Opens the prettyPhoto modal box.
    * Note: Always returns false.
    * @param image {Array} Full path to the image to be open, can also be an array containing full images paths.
    * @param title {Array} The title to be displayed with the picture, can also be an array containing all the titles.
    * @param description {Array} The description to be displayed with the picture, can also be an array containing all the descriptions.
    */
  def open(images: js.Array[String], titles: js.Array[String], descriptions: js.Array[String]): Boolean = js.native
  
  /**
    * Start the slideshow...
    */
  def startSlideshow(): Unit = js.native
  
  /**
    * Stop the slideshow...
    */
  def stopSlideshow(): Unit = js.native
  
  /**
    * prettyPhoto version number
    */
  var version: String = js.native
}
