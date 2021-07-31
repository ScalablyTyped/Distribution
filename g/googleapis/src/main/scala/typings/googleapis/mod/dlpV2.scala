package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dlpV2 {
  
  /**
    * Cloud Data Loss Prevention (DLP) API
    *
    * Provides methods for detection, risk analysis, and de-identification of
    * privacy-sensitive fragments in text, images, and Google Cloud Platform
    * storage repositories.
    *
    * @example
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
    *
    * @namespace dlp
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Dlp
    */
  @JSImport("googleapis", "dlp_v2.Dlp")
  @js.native
  class Dlp protected ()
    extends typings.googleapis.dlpV2Mod.dlpV2.Dlp {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "dlp_v2.Resource$Infotypes")
  @js.native
  class ResourceInfotypes protected ()
    extends typings.googleapis.dlpV2Mod.dlpV2.ResourceInfotypes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dlp_v2.Resource$Organizations")
  @js.native
  class ResourceOrganizations protected ()
    extends typings.googleapis.dlpV2Mod.dlpV2.ResourceOrganizations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dlp_v2.Resource$Organizations$Deidentifytemplates")
  @js.native
  class ResourceOrganizationsDeidentifytemplates protected ()
    extends typings.googleapis.dlpV2Mod.dlpV2.ResourceOrganizationsDeidentifytemplates {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dlp_v2.Resource$Organizations$Inspecttemplates")
  @js.native
  class ResourceOrganizationsInspecttemplates protected ()
    extends typings.googleapis.dlpV2Mod.dlpV2.ResourceOrganizationsInspecttemplates {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dlp_v2.Resource$Organizations$Storedinfotypes")
  @js.native
  class ResourceOrganizationsStoredinfotypes protected ()
    extends typings.googleapis.dlpV2Mod.dlpV2.ResourceOrganizationsStoredinfotypes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dlp_v2.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.dlpV2Mod.dlpV2.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dlp_v2.Resource$Projects$Content")
  @js.native
  class ResourceProjectsContent protected ()
    extends typings.googleapis.dlpV2Mod.dlpV2.ResourceProjectsContent {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dlp_v2.Resource$Projects$Deidentifytemplates")
  @js.native
  class ResourceProjectsDeidentifytemplates protected ()
    extends typings.googleapis.dlpV2Mod.dlpV2.ResourceProjectsDeidentifytemplates {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dlp_v2.Resource$Projects$Dlpjobs")
  @js.native
  class ResourceProjectsDlpjobs protected ()
    extends typings.googleapis.dlpV2Mod.dlpV2.ResourceProjectsDlpjobs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dlp_v2.Resource$Projects$Image")
  @js.native
  class ResourceProjectsImage protected ()
    extends typings.googleapis.dlpV2Mod.dlpV2.ResourceProjectsImage {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dlp_v2.Resource$Projects$Inspecttemplates")
  @js.native
  class ResourceProjectsInspecttemplates protected ()
    extends typings.googleapis.dlpV2Mod.dlpV2.ResourceProjectsInspecttemplates {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dlp_v2.Resource$Projects$Jobtriggers")
  @js.native
  class ResourceProjectsJobtriggers protected ()
    extends typings.googleapis.dlpV2Mod.dlpV2.ResourceProjectsJobtriggers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dlp_v2.Resource$Projects$Storedinfotypes")
  @js.native
  class ResourceProjectsStoredinfotypes protected ()
    extends typings.googleapis.dlpV2Mod.dlpV2.ResourceProjectsStoredinfotypes {
    def this(context: APIRequestContext) = this()
  }
}
