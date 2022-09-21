package typings.idnaUts46Hx

import typings.idnaUts46Hx.anon.IDN
import typings.idnaUts46Hx.anon.IDNPC
import typings.idnaUts46Hx.anon.PC
import typings.idnaUts46Hx.anon.Transitional
import typings.idnaUts46Hx.anon.UseStd3ASCII
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("idna-uts46-hx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(domains: String): IDNPC = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(domains.asInstanceOf[js.Any]).asInstanceOf[IDNPC]
  inline def convert(domains: js.Array[String]): PC = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(domains.asInstanceOf[js.Any]).asInstanceOf[PC]
  
  inline def convert_IDN(domains: String): IDN = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(domains.asInstanceOf[js.Any]).asInstanceOf[IDN]
  
  inline def convert_IDNPC(domains: js.Array[String]): IDNPC = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(domains.asInstanceOf[js.Any]).asInstanceOf[IDNPC]
  
  inline def toAscii(domain: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toAscii")(domain.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toAscii(domain: String, options: Transitional): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toAscii")(domain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toUnicode(domain: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnicode")(domain.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toUnicode(domain: String, options: UseStd3ASCII): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toUnicode")(domain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
