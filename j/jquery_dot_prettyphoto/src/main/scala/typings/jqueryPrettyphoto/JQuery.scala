package typings.jqueryPrettyphoto

import typings.jqueryPrettyphoto.scaronPrettyPhoto.PrettyPhotoSettings
import typings.jqueryPrettyphoto.scaronPrettyPhoto.moduleJQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /**
    * Initialises prettyPhoto
    */
  def prettyPhoto(): JQuery
  /**
    * Initialises prettyPhoto specificying overrides for the defaults
    * @param pp_settings custom prettyPhoto settings
    */
  def prettyPhoto(pp_settings: PrettyPhotoSettings): JQuery
  @JSName("prettyPhoto")
  var prettyPhoto_Original: moduleJQuery
}
object JQuery {
  
  inline def apply(prettyPhoto: moduleJQuery): JQuery = {
    val __obj = js.Dynamic.literal(prettyPhoto = prettyPhoto.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    inline def setPrettyPhoto(value: moduleJQuery): Self = StObject.set(x, "prettyPhoto", value.asInstanceOf[js.Any])
  }
}
