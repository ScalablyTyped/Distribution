package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign._ASN1HEXParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagExplicitStr
  extends StObject
     with _ASN1HEXParseResult {
  
  var tag: ExplicitStr
}
object TagExplicitStr {
  
  inline def apply(tag: ExplicitStr): TagExplicitStr = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagExplicitStr]
  }
  
  extension [Self <: TagExplicitStr](x: Self) {
    
    inline def setTag(value: ExplicitStr): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
