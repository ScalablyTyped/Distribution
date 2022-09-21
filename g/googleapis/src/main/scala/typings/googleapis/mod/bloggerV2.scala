package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bloggerV2 {
  
  @JSImport("googleapis", "blogger_v2.Blogger")
  @js.native
  open class Blogger protected ()
    extends typings.googleapis.bloggerV2Mod.bloggerV2.Blogger {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "blogger_v2.Resource$Blogs")
  @js.native
  open class ResourceBlogs protected ()
    extends typings.googleapis.bloggerV2Mod.bloggerV2.ResourceBlogs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "blogger_v2.Resource$Comments")
  @js.native
  open class ResourceComments protected ()
    extends typings.googleapis.bloggerV2Mod.bloggerV2.ResourceComments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "blogger_v2.Resource$Pages")
  @js.native
  open class ResourcePages protected ()
    extends typings.googleapis.bloggerV2Mod.bloggerV2.ResourcePages {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "blogger_v2.Resource$Posts")
  @js.native
  open class ResourcePosts protected ()
    extends typings.googleapis.bloggerV2Mod.bloggerV2.ResourcePosts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "blogger_v2.Resource$Users")
  @js.native
  open class ResourceUsers protected ()
    extends typings.googleapis.bloggerV2Mod.bloggerV2.ResourceUsers {
    def this(context: APIRequestContext) = this()
  }
}
