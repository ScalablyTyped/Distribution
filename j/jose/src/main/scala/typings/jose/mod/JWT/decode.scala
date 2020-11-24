package typings.jose.mod.JWT

import typings.jose.anon.DecodeOptionscompletetrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWT.decode")
@js.native
object decode extends js.Object {
  
  def apply(jwt: String): js.Object = js.native
  /**
    * Decodes the JWT **without verifying the token**. For JWT verification/validation use
    * `jose.JWT.verify`.
    */
  def apply(jwt: String, options: DecodeOptionscompletetrue): completeResult[js.UndefOr[scala.Nothing]] = js.native
  def apply(jwt: String, options: DecodeOptions): js.Object = js.native
}
