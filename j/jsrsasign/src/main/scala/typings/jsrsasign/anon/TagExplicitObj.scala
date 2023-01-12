package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign._ASN1HEXParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagExplicitObj
  extends StObject
     with _ASN1HEXParseResult {
  
  var tag: ExplicitObj
}
object TagExplicitObj {
  
  inline def apply(tag: ExplicitObj): TagExplicitObj = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagExplicitObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagExplicitObj] (val x: Self) extends AnyVal {
    
    inline def setTag(value: ExplicitObj): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
