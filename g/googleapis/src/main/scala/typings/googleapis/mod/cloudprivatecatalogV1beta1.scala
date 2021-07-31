package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudprivatecatalogV1beta1 {
  
  /**
    * Cloud Private Catalog API
    *
    * Enable cloud users to discover enterprise catalogs and products in their
    * organizations.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudprivatecatalog = google.cloudprivatecatalog('v1beta1');
    *
    * @namespace cloudprivatecatalog
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Cloudprivatecatalog
    */
  @JSImport("googleapis", "cloudprivatecatalog_v1beta1.Cloudprivatecatalog")
  @js.native
  class Cloudprivatecatalog protected ()
    extends typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1.Cloudprivatecatalog {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudprivatecatalog_v1beta1.Resource$Folders")
  @js.native
  class ResourceFolders protected ()
    extends typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1.ResourceFolders {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudprivatecatalog_v1beta1.Resource$Folders$Catalogs")
  @js.native
  class ResourceFoldersCatalogs protected ()
    extends typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1.ResourceFoldersCatalogs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudprivatecatalog_v1beta1.Resource$Folders$Products")
  @js.native
  class ResourceFoldersProducts protected ()
    extends typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1.ResourceFoldersProducts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudprivatecatalog_v1beta1.Resource$Folders$Versions")
  @js.native
  class ResourceFoldersVersions protected ()
    extends typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1.ResourceFoldersVersions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudprivatecatalog_v1beta1.Resource$Organizations")
  @js.native
  class ResourceOrganizations protected ()
    extends typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1.ResourceOrganizations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudprivatecatalog_v1beta1.Resource$Organizations$Catalogs")
  @js.native
  class ResourceOrganizationsCatalogs protected ()
    extends typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1.ResourceOrganizationsCatalogs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudprivatecatalog_v1beta1.Resource$Organizations$Products")
  @js.native
  class ResourceOrganizationsProducts protected ()
    extends typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1.ResourceOrganizationsProducts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudprivatecatalog_v1beta1.Resource$Organizations$Versions")
  @js.native
  class ResourceOrganizationsVersions protected ()
    extends typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1.ResourceOrganizationsVersions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudprivatecatalog_v1beta1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudprivatecatalog_v1beta1.Resource$Projects$Catalogs")
  @js.native
  class ResourceProjectsCatalogs protected ()
    extends typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1.ResourceProjectsCatalogs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudprivatecatalog_v1beta1.Resource$Projects$Products")
  @js.native
  class ResourceProjectsProducts protected ()
    extends typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1.ResourceProjectsProducts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudprivatecatalog_v1beta1.Resource$Projects$Versions")
  @js.native
  class ResourceProjectsVersions protected ()
    extends typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1.ResourceProjectsVersions {
    def this(context: APIRequestContext) = this()
  }
}
