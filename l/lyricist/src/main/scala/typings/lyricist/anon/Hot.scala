package typings.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hot extends StObject {
  
  var hot: Boolean
  
  var pageviews: Double
  
  var unreviewed_annotations: Double
}
object Hot {
  
  inline def apply(hot: Boolean, pageviews: Double, unreviewed_annotations: Double): Hot = {
    val __obj = js.Dynamic.literal(hot = hot.asInstanceOf[js.Any], pageviews = pageviews.asInstanceOf[js.Any], unreviewed_annotations = unreviewed_annotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hot] (val x: Self) extends AnyVal {
    
    inline def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
    
    inline def setPageviews(value: Double): Self = StObject.set(x, "pageviews", value.asInstanceOf[js.Any])
    
    inline def setUnreviewed_annotations(value: Double): Self = StObject.set(x, "unreviewed_annotations", value.asInstanceOf[js.Any])
  }
}
