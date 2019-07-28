package typings.graphqlDashUpload.graphqlDashUploadMod

import typings.express.expressMod.RequestHandler
import typings.graphql.graphqlMod.GraphQLScalarType
import typings.koa.koaMod.Middleware
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-upload", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GraphQLUpload: GraphQLScalarType = js.native
  def graphqlUploadExpress(): RequestHandler = js.native
  def graphqlUploadExpress(uploadOptions: UploadOptions): RequestHandler = js.native
  def graphqlUploadKoa[StateT, CustomT](): Middleware[StateT, CustomT] = js.native
  def graphqlUploadKoa[StateT, CustomT](uploadOptions: UploadOptions): Middleware[StateT, CustomT] = js.native
  def processRequest(request: IncomingMessage, response: ServerResponse): js.Promise[GraphQLOperation | js.Array[GraphQLOperation]] = js.native
  def processRequest(request: IncomingMessage, response: ServerResponse, uploadOptions: UploadOptions): js.Promise[GraphQLOperation | js.Array[GraphQLOperation]] = js.native
}

