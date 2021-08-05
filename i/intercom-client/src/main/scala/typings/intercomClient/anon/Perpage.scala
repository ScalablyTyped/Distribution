package typings.intercomClient.anon

import typings.intercomClient.intercomClientStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Perpage extends StObject {
  
  var per_page: js.UndefOr[Double] = js.undefined
  
  var `type`: user
}
object Perpage {
  
  inline def apply(): Perpage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("user")
    __obj.asInstanceOf[Perpage]
  }
  
  extension [Self <: Perpage](x: Self) {
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setType(value: user): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
