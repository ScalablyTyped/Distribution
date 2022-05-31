package typings.jsBase64

import typings.jsBase64.mod.global.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Base64 {
    
    @JSGlobal("Base64")
    @js.native
    val ^ : js.Any = js.native
    @JSGlobal("Base64.Base64")
    @js.native
    val Base64: typings.jsBase64.mod.Base64 = js.native
    
    @JSGlobal("Base64.VERSION")
    @js.native
    val VERSION: String = js.native
    
    @JSGlobal("Base64.atob")
    @js.native
    val atob: js.Function1[/* base64 */ String, String] = js.native
    
    @JSGlobal("Base64.btoa")
    @js.native
    val btoa: js.Function1[/* s */ String, String] = js.native
    
    @JSGlobal("Base64.btou")
    @js.native
    val btou: js.Function1[/* s */ String, String] = js.native
    
    @JSGlobal("Base64.decode")
    @js.native
    val decode: js.Function1[/* base64 */ String, String] = js.native
    
    @JSGlobal("Base64.encode")
    @js.native
    val encode: js.Function2[/* s */ String, /* uriSafe */ js.UndefOr[Boolean], String] = js.native
    
    @JSGlobal("Base64.encodeURI")
    @js.native
    val encodeURI: js.Function1[/* s */ String, String] = js.native
    
    @JSGlobal("Base64.encodeURL")
    @js.native
    val encodeURL: /* import warning: importer.ImportType#apply Failed type conversion: js-base64.js-base64.Base64['encodeURI'] */ js.Any = js.native
    
    @JSGlobal("Base64.extendBuiltins")
    @js.native
    val extendBuiltins: js.Function0[Unit] = js.native
    
    @JSGlobal("Base64.extendString")
    @js.native
    val extendString: js.Function0[Unit] = js.native
    
    @JSGlobal("Base64.extendUint8Array")
    @js.native
    val extendUint8Array: js.Function0[Unit] = js.native
    
    @JSGlobal("Base64.fromBase64")
    @js.native
    val fromBase64: js.Function1[/* base64 */ String, String] = js.native
    
    @JSGlobal("Base64.fromUint8Array")
    @js.native
    val fromUint8Array: js.Function2[/* uint8Array */ Uint8Array, /* uriSafe */ js.UndefOr[Boolean], String] = js.native
    
    inline def noConflict(): typings.jsBase64.mod.Base64 = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[typings.jsBase64.mod.Base64]
    
    @JSGlobal("Base64.toBase64")
    @js.native
    val toBase64: js.Function2[/* s */ String, /* uriSafe */ js.UndefOr[Boolean], String] = js.native
    
    @JSGlobal("Base64.toUint8Array")
    @js.native
    val toUint8Array: js.Function1[/* s */ String, Uint8Array] = js.native
    
    @JSGlobal("Base64.utob")
    @js.native
    val utob: js.Function1[/* s */ String, String] = js.native
  }
}
