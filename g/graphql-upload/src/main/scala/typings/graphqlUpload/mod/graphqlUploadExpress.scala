package typings.graphqlUpload.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-upload", "graphqlUploadExpress")
@js.native
object graphqlUploadExpress extends js.Object {
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(uploadOptions: UploadOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

