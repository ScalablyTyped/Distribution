package typings.hex2dec

import typings.hex2dec.anon.Prefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hex2dec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decToHex(decStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decToHex")(decStr.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def decToHex(decStr: String, opts: Prefix): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decToHex")(decStr.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def hexToDec(hexStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToDec")(hexStr.asInstanceOf[js.Any]).asInstanceOf[String]
}
