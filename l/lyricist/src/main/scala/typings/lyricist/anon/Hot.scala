package typings.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hot extends StObject {
  
  var hot: Boolean = js.native
  
  var pageviews: Double = js.native
  
  var unreviewed_annotations: Double = js.native
}
object Hot {
  
  @scala.inline
  def apply(hot: Boolean, pageviews: Double, unreviewed_annotations: Double): Hot = {
    val __obj = js.Dynamic.literal(hot = hot.asInstanceOf[js.Any], pageviews = pageviews.asInstanceOf[js.Any], unreviewed_annotations = unreviewed_annotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hot]
  }
  
  @scala.inline
  implicit class HotMutableBuilder[Self <: Hot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageviews(value: Double): Self = StObject.set(x, "pageviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreviewed_annotations(value: Double): Self = StObject.set(x, "unreviewed_annotations", value.asInstanceOf[js.Any])
  }
}
