package typings.atGrampsRestDashHelpers

import typings.atGrampsRestDashHelpers.atGrampsRestDashHelpersMod.GraphQLConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@gramps/rest-helpers", JSImport.Namespace)
@js.native
object atGrampsRestDashHelpersMod extends js.Object {
  @js.native
  class GraphQLConnector () extends js.Object {
    var apiBaseUri: String = js.native
    var cacheExpiry: Double = js.native
    var enableCache: Boolean = js.native
    var headers: js.Object = js.native
    var redis: Boolean = js.native
    var request: js.Any = js.native
    def delete(endpoint: String, options: js.Object): js.Promise[_] = js.native
    def get(endpoint: String): js.Promise[_] = js.native
    def post(endpoint: String, body: js.Object, options: js.Object): js.Promise[_] = js.native
    def put(endpoint: String, body: js.Object, options: js.Object): js.Promise[_] = js.native
  }
  
  @js.native
  class GraphQLModel protected () extends js.Object {
    def this(has: js.Any) = this()
    var connector: GraphQLConnector = js.native
  }
  
}

