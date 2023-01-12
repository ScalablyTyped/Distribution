package typings.maximMazurokGapiClientBlogger.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelfLink extends StObject {
  
  /** The URL of the container for pages in this blog. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** The count of pages in this blog. */
  var totalItems: js.UndefOr[Double] = js.undefined
}
object SelfLink {
  
  inline def apply(): SelfLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelfLink] (val x: Self) extends AnyVal {
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
