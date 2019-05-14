package typings
package graphqlDashUploadLib.graphqlDashUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-upload", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GraphQLUpload: graphqlLib.graphqlMod.GraphQLScalarType = js.native
  def graphqlUploadExpress(): expressLib.expressMod.RequestHandler = js.native
  def graphqlUploadExpress(uploadOptions: UploadOptions): expressLib.expressMod.RequestHandler = js.native
  def graphqlUploadKoa[StateT, CustomT](): koaLib.koaMod.Middleware[StateT, CustomT] = js.native
  def graphqlUploadKoa[StateT, CustomT](uploadOptions: UploadOptions): koaLib.koaMod.Middleware[StateT, CustomT] = js.native
  def processRequest(request: nodeLib.httpMod.IncomingMessage, response: nodeLib.httpMod.ServerResponse): js.Promise[GraphQLOperation | js.Array[GraphQLOperation]] = js.native
  def processRequest(
    request: nodeLib.httpMod.IncomingMessage,
    response: nodeLib.httpMod.ServerResponse,
    uploadOptions: UploadOptions
  ): js.Promise[GraphQLOperation | js.Array[GraphQLOperation]] = js.native
}

