package typings.lapoAsn1js

import typings.lapoAsn1js.mod.Binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hexMod {
  
  @JSImport("@lapo/asn1js/hex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(a: Binary): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(a.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
