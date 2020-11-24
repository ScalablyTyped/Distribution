package typings.maximMazurokGapiClientBlogger

import typings.maximMazurokGapiClientBlogger.gapi.client.blogger.BlogUserInfosResource
import typings.maximMazurokGapiClientBlogger.gapi.client.blogger.BlogsResource
import typings.maximMazurokGapiClientBlogger.gapi.client.blogger.CommentsResource
import typings.maximMazurokGapiClientBlogger.gapi.client.blogger.PageViewsResource
import typings.maximMazurokGapiClientBlogger.gapi.client.blogger.PagesResource
import typings.maximMazurokGapiClientBlogger.gapi.client.blogger.PostUserInfosResource
import typings.maximMazurokGapiClientBlogger.gapi.client.blogger.PostsResource
import typings.maximMazurokGapiClientBlogger.gapi.client.blogger.UsersResource
import typings.maximMazurokGapiClientBlogger.maximMazurokGapiClientBloggerStrings.blogger
import typings.maximMazurokGapiClientBlogger.maximMazurokGapiClientBloggerStrings.v3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Blogger API v3 v3 */
      def load(name: blogger, version: v3): js.Thenable[Unit] = js.native
      def load(name: blogger, version: v3, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object blogger extends js.Object {
        
        val blogUserInfos: BlogUserInfosResource = js.native
        
        val blogs: BlogsResource = js.native
        
        val comments: CommentsResource = js.native
        
        val pageViews: PageViewsResource = js.native
        
        val pages: PagesResource = js.native
        
        val postUserInfos: PostUserInfosResource = js.native
        
        val posts: PostsResource = js.native
        
        val users: UsersResource = js.native
      }
    }
  }
}
