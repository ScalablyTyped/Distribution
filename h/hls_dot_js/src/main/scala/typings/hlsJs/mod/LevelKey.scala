package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "LevelKey")
@js.native
/* private */ open class LevelKey () extends StObject {
  
  /* private */ var _uri: Any = js.native
  
  var iv: js.typedarray.Uint8Array | Null = js.native
  
  var key: js.typedarray.Uint8Array | Null = js.native
  
  var keyFormat: String | Null = js.native
  
  var keyFormatVersions: String | Null = js.native
  
  var keyID: String | Null = js.native
  
  var method: String | Null = js.native
  
  def uri: String | Null = js.native
}
/* static members */
object LevelKey {
  
  @JSImport("hls.js", "LevelKey")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromURI(uri: String): LevelKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURI")(uri.asInstanceOf[js.Any]).asInstanceOf[LevelKey]
  
  inline def fromURL(baseUrl: String, relativeUrl: String): LevelKey = (^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(baseUrl.asInstanceOf[js.Any], relativeUrl.asInstanceOf[js.Any])).asInstanceOf[LevelKey]
}
