package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyLoaderInfo extends StObject {
  
  var decryptdata: LevelKey
  
  var keyLoadPromise: js.Promise[KeyLoadedData] | Null
  
  var loader: Loader[KeyLoaderContext] | Null
  
  var mediaKeySessionContext: MediaKeySessionContext | Null
}
object KeyLoaderInfo {
  
  inline def apply(decryptdata: LevelKey): KeyLoaderInfo = {
    val __obj = js.Dynamic.literal(decryptdata = decryptdata.asInstanceOf[js.Any], keyLoadPromise = null, loader = null, mediaKeySessionContext = null)
    __obj.asInstanceOf[KeyLoaderInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyLoaderInfo] (val x: Self) extends AnyVal {
    
    inline def setDecryptdata(value: LevelKey): Self = StObject.set(x, "decryptdata", value.asInstanceOf[js.Any])
    
    inline def setKeyLoadPromise(value: js.Promise[KeyLoadedData]): Self = StObject.set(x, "keyLoadPromise", value.asInstanceOf[js.Any])
    
    inline def setKeyLoadPromiseNull: Self = StObject.set(x, "keyLoadPromise", null)
    
    inline def setLoader(value: Loader[KeyLoaderContext]): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderNull: Self = StObject.set(x, "loader", null)
    
    inline def setMediaKeySessionContext(value: MediaKeySessionContext): Self = StObject.set(x, "mediaKeySessionContext", value.asInstanceOf[js.Any])
    
    inline def setMediaKeySessionContextNull: Self = StObject.set(x, "mediaKeySessionContext", null)
  }
}
