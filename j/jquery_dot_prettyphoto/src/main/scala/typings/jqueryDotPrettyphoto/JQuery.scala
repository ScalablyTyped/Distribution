package typings.jqueryDotPrettyphoto

import typings.jqueryDotPrettyphoto.scaron_prettyPhoto.PrettyPhotoSettings
import typings.jqueryDotPrettyphoto.scaron_prettyPhoto.moduleJQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("prettyPhoto")
  var prettyPhoto_Original: moduleJQuery = js.native
  /**
    * Initialises prettyPhoto
    */
  def prettyPhoto(): JQuery = js.native
  /**
    * Initialises prettyPhoto specificying overrides for the defaults
    * @param pp_settings custom prettyPhoto settings
    */
  def prettyPhoto(pp_settings: PrettyPhotoSettings): JQuery = js.native
}

