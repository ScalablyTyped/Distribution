package typings.jqueryPrettyphoto

import typings.jqueryPrettyphoto.scaronPrettyPhoto.PrettyPhotoSettings
import typings.jqueryPrettyphoto.scaronPrettyPhoto.moduleJQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  /**
    * Initialises prettyPhoto
    */
  def prettyPhoto(): JQuery = js.native
  /**
    * Initialises prettyPhoto specificying overrides for the defaults
    * @param pp_settings custom prettyPhoto settings
    */
  def prettyPhoto(pp_settings: PrettyPhotoSettings): JQuery = js.native
  @JSName("prettyPhoto")
  var prettyPhoto_Original: moduleJQuery = js.native
}
