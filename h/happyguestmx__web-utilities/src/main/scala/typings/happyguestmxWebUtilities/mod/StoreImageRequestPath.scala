package typings.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreImageRequestPath extends StObject {
  
  var bucket: String
  
  var public: String
}
object StoreImageRequestPath {
  
  inline def apply(bucket: String, public: String): StoreImageRequestPath = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreImageRequestPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoreImageRequestPath] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
  }
}
