package typings.he

import typings.he.mod.Decode_
import typings.he.mod.Encode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object he {
    
    @JSGlobal("he")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("he.decode")
    @js.native
    def decode: Decode_ = js.native
    inline def decode_=(x: Decode_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decode")(x.asInstanceOf[js.Any])
    
    @JSGlobal("he.encode")
    @js.native
    def encode: Encode_ = js.native
    inline def encode_=(x: Encode_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encode")(x.asInstanceOf[js.Any])
    
    inline def escape(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSGlobal("he.unescape")
    @js.native
    def unescape: Decode_ = js.native
    inline def unescape_=(x: Decode_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unescape")(x.asInstanceOf[js.Any])
    
    @JSGlobal("he.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
