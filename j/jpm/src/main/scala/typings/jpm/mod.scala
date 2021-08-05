package typings.jpm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sdk/base64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decode(data: String, charset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], charset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(data: String, charset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any], charset.asInstanceOf[js.Any])).asInstanceOf[String]
}
