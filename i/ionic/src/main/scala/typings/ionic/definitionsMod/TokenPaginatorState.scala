package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenPaginatorState
  extends StObject
     with PaginatorState {
  
  var page_token: js.UndefOr[String] = js.undefined
}
object TokenPaginatorState {
  
  @scala.inline
  def apply(done: Boolean, loaded: Double): TokenPaginatorState = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenPaginatorState]
  }
  
  @scala.inline
  implicit class TokenPaginatorStateMutableBuilder[Self <: TokenPaginatorState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage_token(value: String): Self = StObject.set(x, "page_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_tokenUndefined: Self = StObject.set(x, "page_token", js.undefined)
  }
}
