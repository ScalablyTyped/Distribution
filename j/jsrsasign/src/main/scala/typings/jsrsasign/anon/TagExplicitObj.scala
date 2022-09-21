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
  
  extension [Self <: TagExplicitObj](x: Self) {
    
    inline def setTag(value: ExplicitObj): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
