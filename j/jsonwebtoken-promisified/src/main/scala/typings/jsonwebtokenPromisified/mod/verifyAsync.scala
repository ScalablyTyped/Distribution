package typings.jsonwebtokenPromisified.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsonwebtoken-promisified", "verifyAsync")
@js.native
object verifyAsync extends js.Object {
  
  def apply(token: String, secretOrPublicKey: String): js.Promise[js.Object | String] = js.native
  def apply(token: String, secretOrPublicKey: String, options: VerifyOptions): js.Promise[js.Object | String] = js.native
  def apply(token: String, secretOrPublicKey: Buffer): js.Promise[js.Object | String] = js.native
  def apply(token: String, secretOrPublicKey: Buffer, options: VerifyOptions): js.Promise[js.Object | String] = js.native
}
