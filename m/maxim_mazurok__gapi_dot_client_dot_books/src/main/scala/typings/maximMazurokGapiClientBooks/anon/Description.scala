package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  /** Name of the source. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Extra text about the source of the review. */
  var extraDescription: js.UndefOr[String] = js.undefined
  
  /** URL of the source of the review. */
  var url: js.UndefOr[String] = js.undefined
}
object Description {
  
  inline def apply(): Description = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExtraDescription(value: String): Self = StObject.set(x, "extraDescription", value.asInstanceOf[js.Any])
    
    inline def setExtraDescriptionUndefined: Self = StObject.set(x, "extraDescription", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
