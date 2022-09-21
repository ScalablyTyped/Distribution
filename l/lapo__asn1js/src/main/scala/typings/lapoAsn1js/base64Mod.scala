package typings.lapoAsn1js

import typings.lapoAsn1js.mod.Binary
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object base64Mod {
  
  @JSImport("@lapo/asn1js/base64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(a: Binary): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(a.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def pretty(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pretty")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@lapo/asn1js/base64", "re")
  @js.native
  def re: js.RegExp = js.native
  inline def re_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("re")(x.asInstanceOf[js.Any])
  
  inline def unarmor(a: String): ReturnType[js.Function1[/* a */ Binary, js.typedarray.Uint8Array]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unarmor")(a.asInstanceOf[js.Any]).asInstanceOf[ReturnType[js.Function1[/* a */ Binary, js.typedarray.Uint8Array]]]
}
