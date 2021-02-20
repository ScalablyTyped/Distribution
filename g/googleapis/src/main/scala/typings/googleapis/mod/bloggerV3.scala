package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bloggerV3 {
  
  /**
    * Blogger API
    *
    * API for access to the data within Blogger.
    *
    * @example
    * const {google} = require('googleapis');
    * const blogger = google.blogger('v3');
    *
    * @namespace blogger
    * @type {Function}
    * @version v3
    * @variation v3
    * @param {object=} options Options for Blogger
    */
  @JSImport("googleapis", "blogger_v3.Blogger")
  @js.native
  class Blogger protected ()
    extends typings.googleapis.bloggerV3Mod.bloggerV3.Blogger {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "blogger_v3.Resource$Blogs")
  @js.native
  class ResourceBlogs protected ()
    extends typings.googleapis.bloggerV3Mod.bloggerV3.ResourceBlogs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "blogger_v3.Resource$Bloguserinfos")
  @js.native
  class ResourceBloguserinfos protected ()
    extends typings.googleapis.bloggerV3Mod.bloggerV3.ResourceBloguserinfos {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "blogger_v3.Resource$Comments")
  @js.native
  class ResourceComments protected ()
    extends typings.googleapis.bloggerV3Mod.bloggerV3.ResourceComments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "blogger_v3.Resource$Pages")
  @js.native
  class ResourcePages protected ()
    extends typings.googleapis.bloggerV3Mod.bloggerV3.ResourcePages {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "blogger_v3.Resource$Pageviews")
  @js.native
  class ResourcePageviews protected ()
    extends typings.googleapis.bloggerV3Mod.bloggerV3.ResourcePageviews {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "blogger_v3.Resource$Posts")
  @js.native
  class ResourcePosts protected ()
    extends typings.googleapis.bloggerV3Mod.bloggerV3.ResourcePosts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "blogger_v3.Resource$Postuserinfos")
  @js.native
  class ResourcePostuserinfos protected ()
    extends typings.googleapis.bloggerV3Mod.bloggerV3.ResourcePostuserinfos {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "blogger_v3.Resource$Users")
  @js.native
  class ResourceUsers protected ()
    extends typings.googleapis.bloggerV3Mod.bloggerV3.ResourceUsers {
    def this(context: APIRequestContext) = this()
  }
}
