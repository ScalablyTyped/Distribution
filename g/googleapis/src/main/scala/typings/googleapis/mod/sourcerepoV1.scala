package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcerepoV1 {
  
  @JSImport("googleapis", "sourcerepo_v1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.sourcerepoV1Mod.sourcerepoV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "sourcerepo_v1.Resource$Projects$Repos")
  @js.native
  open class ResourceProjectsRepos protected ()
    extends typings.googleapis.sourcerepoV1Mod.sourcerepoV1.ResourceProjectsRepos {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "sourcerepo_v1.Sourcerepo")
  @js.native
  open class Sourcerepo protected ()
    extends typings.googleapis.sourcerepoV1Mod.sourcerepoV1.Sourcerepo {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
