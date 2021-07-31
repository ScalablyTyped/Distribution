package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bloggerV2 {
  
  /**
    * Blogger API
    *
    * API for access to the data within Blogger.
    *
    * @example
    * const {google} = require('googleapis');
    * const blogger = google.blogger('v2');
    *
    * @namespace blogger
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Blogger
    */
  @JSImport("googleapis", "blogger_v2.Blogger")
  @js.native
  class Blogger protected ()
    extends typings.googleapis.bloggerV2Mod.bloggerV2.Blogger {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "blogger_v2.Resource$Blogs")
  @js.native
  class ResourceBlogs protected ()
    extends typings.googleapis.bloggerV2Mod.bloggerV2.ResourceBlogs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "blogger_v2.Resource$Comments")
  @js.native
  class ResourceComments protected ()
    extends typings.googleapis.bloggerV2Mod.bloggerV2.ResourceComments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "blogger_v2.Resource$Pages")
  @js.native
  class ResourcePages protected ()
    extends typings.googleapis.bloggerV2Mod.bloggerV2.ResourcePages {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "blogger_v2.Resource$Posts")
  @js.native
  class ResourcePosts protected ()
    extends typings.googleapis.bloggerV2Mod.bloggerV2.ResourcePosts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "blogger_v2.Resource$Users")
  @js.native
  class ResourceUsers protected ()
    extends typings.googleapis.bloggerV2Mod.bloggerV2.ResourceUsers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "blogger_v2.Resource$Users$Blogs")
  @js.native
  class ResourceUsersBlogs protected ()
    extends typings.googleapis.bloggerV2Mod.bloggerV2.ResourceUsersBlogs {
    def this(context: APIRequestContext) = this()
  }
}
