package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudprivatecatalogproducerV1beta1 {
  
  /**
    * Cloud Private Catalog Producer API
    *
    * Enables cloud users to manage and share enterprise catalogs intheir
    * organizations.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudprivatecatalogproducer =
    * google.cloudprivatecatalogproducer('v1beta1');
    *
    * @namespace cloudprivatecatalogproducer
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Cloudprivatecatalogproducer
    */
  @JSImport("googleapis", "cloudprivatecatalogproducer_v1beta1.Cloudprivatecatalogproducer")
  @js.native
  class Cloudprivatecatalogproducer protected ()
    extends typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1.Cloudprivatecatalogproducer {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudprivatecatalogproducer_v1beta1.Resource$Catalogs")
  @js.native
  class ResourceCatalogs protected ()
    extends typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1.ResourceCatalogs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudprivatecatalogproducer_v1beta1.Resource$Catalogs$Associations")
  @js.native
  class ResourceCatalogsAssociations protected ()
    extends typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1.ResourceCatalogsAssociations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudprivatecatalogproducer_v1beta1.Resource$Catalogs$Products")
  @js.native
  class ResourceCatalogsProducts protected ()
    extends typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1.ResourceCatalogsProducts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudprivatecatalogproducer_v1beta1.Resource$Catalogs$Products$Icons")
  @js.native
  class ResourceCatalogsProductsIcons protected ()
    extends typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1.ResourceCatalogsProductsIcons {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudprivatecatalogproducer_v1beta1.Resource$Catalogs$Products$Versions")
  @js.native
  class ResourceCatalogsProductsVersions protected ()
    extends typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1.ResourceCatalogsProductsVersions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudprivatecatalogproducer_v1beta1.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
}
