package typings.jwtSimple

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jwt-simple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(token: js.Any, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def decode(token: js.Any, key: String, noVerify: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], noVerify.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def decode(token: js.Any, key: String, noVerify: Boolean, algorithm: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], noVerify.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def decode(token: js.Any, key: String, noVerify: Unit, algorithm: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], noVerify.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def encode(payload: js.Any, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(payload: js.Any, key: String, algorithm: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[String]
}
