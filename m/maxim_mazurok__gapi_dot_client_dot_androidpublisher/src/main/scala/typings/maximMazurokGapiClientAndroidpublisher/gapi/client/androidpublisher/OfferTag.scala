package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfferTag extends StObject {
  
  /** Must conform with RFC-1034. That is, this string can only contain lower-case letters (a-z), numbers (0-9), and hyphens (-), and be at most 20 characters. */
  var tag: js.UndefOr[String] = js.undefined
}
object OfferTag {
  
  inline def apply(): OfferTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfferTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OfferTag] (val x: Self) extends AnyVal {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
