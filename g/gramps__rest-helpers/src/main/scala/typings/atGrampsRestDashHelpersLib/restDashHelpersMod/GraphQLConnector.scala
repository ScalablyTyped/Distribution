package typings
package atGrampsRestDashHelpersLib.restDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@gramps/rest-helpers", "GraphQLConnector")
@js.native
class GraphQLConnector () extends js.Object {
  var apiBaseUri: java.lang.String = js.native
  var cacheExpiry: scala.Double = js.native
  var enableCache: scala.Boolean = js.native
  var headers: js.Object = js.native
  var redis: scala.Boolean = js.native
  var request: js.Any = js.native
  def delete(endpoint: java.lang.String, options: js.Object): js.Promise[_] = js.native
  def get(endpoint: java.lang.String): js.Promise[_] = js.native
  def post(endpoint: java.lang.String, body: js.Object, options: js.Object): js.Promise[_] = js.native
  def put(endpoint: java.lang.String, body: js.Object, options: js.Object): js.Promise[_] = js.native
}

