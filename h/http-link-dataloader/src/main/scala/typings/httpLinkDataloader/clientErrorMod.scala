package typings.httpLinkDataloader

import typings.httpLinkDataloader.typesMod.GraphQLResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-link-dataloader/dist/src/ClientError", JSImport.Namespace)
@js.native
object clientErrorMod extends js.Object {
  @js.native
  class ClientError protected () extends Error {
    def this(result: GraphQLResponse) = this()
    var result: GraphQLResponse = js.native
  }
  
  /* static members */
  @js.native
  object ClientError extends js.Object {
    /* private */ def extractMessage(response: js.Any): js.Any = js.native
  }
  
}

