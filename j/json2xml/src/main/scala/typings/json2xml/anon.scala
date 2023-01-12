package typings.json2xml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attributeskey extends StObject {
    
    var attributes_key: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[Boolean] = js.undefined
  }
  object Attributeskey {
    
    inline def apply(): Attributeskey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributeskey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attributeskey] (val x: Self) extends AnyVal {
      
      inline def setAttributes_key(value: String): Self = StObject.set(x, "attributes_key", value.asInstanceOf[js.Any])
      
      inline def setAttributes_keyUndefined: Self = StObject.set(x, "attributes_key", js.undefined)
      
      inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
}
