package typings.jqueryPrettyphoto

import typings.jqueryPrettyphoto.scaronPrettyPhoto.moduleJQueryStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var prettyPhoto: moduleJQueryStatic
}
object JQueryStatic {
  
  inline def apply(prettyPhoto: moduleJQueryStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(prettyPhoto = prettyPhoto.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setPrettyPhoto(value: moduleJQueryStatic): Self = StObject.set(x, "prettyPhoto", value.asInstanceOf[js.Any])
  }
}
