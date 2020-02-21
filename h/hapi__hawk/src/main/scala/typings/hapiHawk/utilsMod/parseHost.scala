package typings.hapiHawk.utilsMod

import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/utils", "parseHost")
@js.native
object parseHost extends js.Object {
  def apply(req: RequestOptions | typings.node.httpsMod.RequestOptions): Host | Null = js.native
  def apply(req: RequestOptions | typings.node.httpsMod.RequestOptions, hostHeaderName: String): Host | Null = js.native
}

