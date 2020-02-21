package typings.hapiHawk.utilsMod

import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/utils", "parseRequest")
@js.native
object parseRequest extends js.Object {
  def apply(req: RequestOptions | typings.node.httpsMod.RequestOptions): CustomRequest = js.native
  def apply(req: RequestOptions | typings.node.httpsMod.RequestOptions, options: ParseRequestOptions): CustomRequest = js.native
}

