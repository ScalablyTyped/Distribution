package typings.jwtSimple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jwt-simple", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def decode(token: js.Any, key: String): js.Any = js.native
  def decode(token: js.Any, key: String, noVerify: js.UndefOr[scala.Nothing], algorithm: String): js.Any = js.native
  def decode(token: js.Any, key: String, noVerify: Boolean): js.Any = js.native
  def decode(token: js.Any, key: String, noVerify: Boolean, algorithm: String): js.Any = js.native
  
  def encode(payload: js.Any, key: String): String = js.native
  def encode(payload: js.Any, key: String, algorithm: String): String = js.native
}
