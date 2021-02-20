package typings.jwtSimple

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jwt-simple", "decode")
  @js.native
  def decode(token: js.Any, key: String): js.Any = js.native
  @JSImport("jwt-simple", "decode")
  @js.native
  def decode(token: js.Any, key: String, noVerify: js.UndefOr[scala.Nothing], algorithm: String): js.Any = js.native
  @JSImport("jwt-simple", "decode")
  @js.native
  def decode(token: js.Any, key: String, noVerify: Boolean): js.Any = js.native
  @JSImport("jwt-simple", "decode")
  @js.native
  def decode(token: js.Any, key: String, noVerify: Boolean, algorithm: String): js.Any = js.native
  
  @JSImport("jwt-simple", "encode")
  @js.native
  def encode(payload: js.Any, key: String): String = js.native
  @JSImport("jwt-simple", "encode")
  @js.native
  def encode(payload: js.Any, key: String, algorithm: String): String = js.native
}
