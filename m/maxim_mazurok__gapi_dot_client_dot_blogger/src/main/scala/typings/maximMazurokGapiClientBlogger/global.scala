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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object blogger {
        
        @JSGlobal("gapi.client.blogger.blogUserInfos")
        @js.native
        val blogUserInfos: BlogUserInfosResource = js.native
        
        @JSGlobal("gapi.client.blogger.blogs")
        @js.native
        val blogs: BlogsResource = js.native
        
        @JSGlobal("gapi.client.blogger.comments")
        @js.native
        val comments: CommentsResource = js.native
        
        @JSGlobal("gapi.client.blogger.pageViews")
        @js.native
        val pageViews: PageViewsResource = js.native
        
        @JSGlobal("gapi.client.blogger.pages")
        @js.native
        val pages: PagesResource = js.native
        
        @JSGlobal("gapi.client.blogger.postUserInfos")
        @js.native
        val postUserInfos: PostUserInfosResource = js.native
        
        @JSGlobal("gapi.client.blogger.posts")
        @js.native
        val posts: PostsResource = js.native
        
        @JSGlobal("gapi.client.blogger.users")
        @js.native
        val users: UsersResource = js.native
      }
      
      /** Load Blogger API v3 v3 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: blogger, version: v3): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: blogger, version: v3, callback: js.Function0[_]): Unit = js.native
    }
  }
}
