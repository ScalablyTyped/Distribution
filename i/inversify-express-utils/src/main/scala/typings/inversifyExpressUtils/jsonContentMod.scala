package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.httpContentMod.HttpContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonContentMod {
  
  @JSImport("inversify-express-utils/dts/content/jsonContent", "JsonContent")
  @js.native
  class JsonContent protected () extends HttpContent {
    def this(content: js.Any) = this()
    def this(content: js.Any, mediaType: String) = this()
    
    /* private */ var content: js.Any = js.native
    
    /* private */ var mediaType: js.Any = js.native
  }
}
