package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpData extends StObject {
  
  /**
    * Required. The URL that points to the file that stores the object list entries. This file must allow public access. Currently, only URLs with HTTP and HTTPS schemes are supported.
    */
  var listUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaHttpData {
  
  inline def apply(): SchemaHttpData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpData]
  }
  
  extension [Self <: SchemaHttpData](x: Self) {
    
    inline def setListUrl(value: String): Self = StObject.set(x, "listUrl", value.asInstanceOf[js.Any])
    
    inline def setListUrlNull: Self = StObject.set(x, "listUrl", null)
    
    inline def setListUrlUndefined: Self = StObject.set(x, "listUrl", js.undefined)
  }
}
