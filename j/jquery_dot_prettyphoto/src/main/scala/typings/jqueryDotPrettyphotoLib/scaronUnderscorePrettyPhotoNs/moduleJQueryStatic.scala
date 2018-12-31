package typings
package jqueryDotPrettyphotoLib.scaronUnderscorePrettyPhotoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait moduleJQueryStatic extends js.Object {
  /**
    * prettyPhoto version number
    */
  var version: java.lang.String = js.native
  /**
    * Change gallery page in the prettyPhoto modal box
    * @param direction {String} Direction of the paging, previous or next.
    */
  def changeGalleryPage(direction: java.lang.String): scala.Unit = js.native
  /**
    * Change page in the prettyPhoto modal box
    * @param direction {String} Direction of the paging, previous or next.
    */
  def changePage(direction: java.lang.String): scala.Unit = js.native
  /**
    * Closes prettyPhoto.
    */
  def close(): scala.Unit = js.native
  /**
    * Opens the prettyPhoto modal box.
    * Note: Always returns false.
    */
  def open(): scala.Boolean = js.native
  /**
    * Opens the prettyPhoto modal box.
    * Note: Always returns false.
    * @param image {String} Full path to the image to be open, can also be an array containing full images paths.
    * @param title {String} The title to be displayed with the picture, can also be an array containing all the titles.
    * @param description {String} The description to be displayed with the picture, can also be an array containing all the descriptions.
    */
  def open(image: java.lang.String, title: java.lang.String, description: java.lang.String): scala.Boolean = js.native
  /**
    * Opens the prettyPhoto modal box.
    * Note: Always returns false.
    * @param image {Array} Full path to the image to be open, can also be an array containing full images paths.
    * @param title {Array} The title to be displayed with the picture, can also be an array containing all the titles.
    * @param description {Array} The description to be displayed with the picture, can also be an array containing all the descriptions.
    */
  def open(
    images: js.Array[java.lang.String],
    titles: js.Array[java.lang.String],
    descriptions: js.Array[java.lang.String]
  ): scala.Boolean = js.native
  /**
    * Start the slideshow...
    */
  def startSlideshow(): scala.Unit = js.native
  /**
    * Stop the slideshow...
    */
  def stopSlideshow(): scala.Unit = js.native
}

