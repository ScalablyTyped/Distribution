package typings.grampsRestHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@gramps/rest-helpers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class GraphQLConnector () extends js.Object {
    
    var apiBaseUri: String = js.native
    
    var cacheExpiry: Double = js.native
    
    def delete(endpoint: String, options: js.Object): js.Promise[_] = js.native
    
    var enableCache: Boolean = js.native
    
    def get(endpoint: String): js.Promise[_] = js.native
    
    var headers: js.Object = js.native
    
    def post(endpoint: String, body: js.Object, options: js.Object): js.Promise[_] = js.native
    
    def put(endpoint: String, body: js.Object, options: js.Object): js.Promise[_] = js.native
    
    var redis: Boolean = js.native
    
    var request: js.Any = js.native
  }
  
  @js.native
  class GraphQLModel protected () extends js.Object {
    def this(has: js.Any) = this()
    
    var connector: GraphQLConnector = js.native
  }
}
