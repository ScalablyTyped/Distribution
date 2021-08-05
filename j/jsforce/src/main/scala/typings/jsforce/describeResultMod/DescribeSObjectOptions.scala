package typings.jsforce.describeResultMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSObjectOptions extends StObject {
  
  var ifModifiedSince: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object DescribeSObjectOptions {
  
  inline def apply(`type`: String): DescribeSObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSObjectOptions]
  }
  
  extension [Self <: DescribeSObjectOptions](x: Self) {
    
    inline def setIfModifiedSince(value: String): Self = StObject.set(x, "ifModifiedSince", value.asInstanceOf[js.Any])
    
    inline def setIfModifiedSinceUndefined: Self = StObject.set(x, "ifModifiedSince", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
