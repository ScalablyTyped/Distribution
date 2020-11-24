package typings.graphqlReact.mod

import typings.graphqlReact.anon.Locations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLCacheValue[T] extends js.Object {
  
  var data: T = js.native
  
  var fetchError: Null | String = js.native
  
  var graphQLErrors: Null | js.Array[Locations] = js.native
  
  var httpError: Null | HttpError = js.native
  
  var parseError: Null | String = js.native
}
object GraphQLCacheValue {
  
  @scala.inline
  def apply[T](data: T): GraphQLCacheValue[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLCacheValue[T]]
  }
  
  @scala.inline
  implicit class GraphQLCacheValueOps[Self <: GraphQLCacheValue[_], T] (val x: Self with GraphQLCacheValue[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchError(value: String): Self = this.set("fetchError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchErrorNull: Self = this.set("fetchError", null)
    
    @scala.inline
    def setGraphQLErrorsVarargs(value: Locations*): Self = this.set("graphQLErrors", js.Array(value :_*))
    
    @scala.inline
    def setGraphQLErrors(value: js.Array[Locations]): Self = this.set("graphQLErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphQLErrorsNull: Self = this.set("graphQLErrors", null)
    
    @scala.inline
    def setHttpError(value: HttpError): Self = this.set("httpError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpErrorNull: Self = this.set("httpError", null)
    
    @scala.inline
    def setParseError(value: String): Self = this.set("parseError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseErrorNull: Self = this.set("parseError", null)
  }
}
