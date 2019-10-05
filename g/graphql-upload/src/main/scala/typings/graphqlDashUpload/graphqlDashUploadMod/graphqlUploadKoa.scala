package typings.graphqlDashUpload.graphqlDashUploadMod

import typings.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-upload", "graphqlUploadKoa")
@js.native
object graphqlUploadKoa extends js.Object {
  def apply[StateT, CustomT](): Middleware[StateT, CustomT] = js.native
  def apply[StateT, CustomT](uploadOptions: UploadOptions): Middleware[StateT, CustomT] = js.native
}

