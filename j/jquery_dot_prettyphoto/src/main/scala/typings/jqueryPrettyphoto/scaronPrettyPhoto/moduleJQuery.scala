package typings.jqueryPrettyphoto.scaronPrettyPhoto

import typings.jqueryPrettyphoto.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait moduleJQuery extends js.Object {
  
  /**
    * Initialises prettyPhoto
    */
  def apply(): JQuery = js.native
  /**
    * Initialises prettyPhoto specificying overrides for the defaults
    * @param pp_settings custom prettyPhoto settings
    */
  def apply(pp_settings: PrettyPhotoSettings): JQuery = js.native
}
