package typings.grampsRestHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@gramps/rest-helpers", "GraphQLConnector")
  @js.native
  class GraphQLConnector () extends StObject {
    
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
  
  @JSImport("@gramps/rest-helpers", "GraphQLModel")
  @js.native
  class GraphQLModel protected () extends StObject {
    def this(has: js.Any) = this()
    
    var connector: GraphQLConnector = js.native
  }
}
