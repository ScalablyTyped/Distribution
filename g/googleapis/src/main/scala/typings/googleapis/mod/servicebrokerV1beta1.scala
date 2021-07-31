package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicebrokerV1beta1 {
  
  @JSImport("googleapis", "servicebroker_v1beta1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "servicebroker_v1beta1.Resource$Projects$Brokers")
  @js.native
  class ResourceProjectsBrokers protected ()
    extends typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1.ResourceProjectsBrokers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "servicebroker_v1beta1.Resource$Projects$Brokers$Instances")
  @js.native
  class ResourceProjectsBrokersInstances protected ()
    extends typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1.ResourceProjectsBrokersInstances {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "servicebroker_v1beta1.Resource$Projects$Brokers$Instances$Bindings")
  @js.native
  class ResourceProjectsBrokersInstancesBindings protected ()
    extends typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1.ResourceProjectsBrokersInstancesBindings {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "servicebroker_v1beta1.Resource$Projects$Brokers$V2")
  @js.native
  class ResourceProjectsBrokersV2 protected ()
    extends typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1.ResourceProjectsBrokersV2 {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "servicebroker_v1beta1.Resource$Projects$Brokers$V2$Catalog")
  @js.native
  class ResourceProjectsBrokersV2Catalog protected ()
    extends typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1.ResourceProjectsBrokersV2Catalog {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "servicebroker_v1beta1.Resource$Projects$Brokers$V2$Service_instances")
  @js.native
  class ResourceProjectsBrokersV2ServiceInstances protected ()
    extends typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1.ResourceProjectsBrokersV2ServiceInstances {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "servicebroker_v1beta1.Resource$Projects$Brokers$V2$Service_instances$Service_bindings")
  @js.native
  class ResourceProjectsBrokersV2ServiceInstancesServiceBindings protected ()
    extends typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1.ResourceProjectsBrokersV2ServiceInstancesServiceBindings {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "servicebroker_v1beta1.Resource$V1beta1")
  @js.native
  class ResourceV1beta1 protected ()
    extends typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1.ResourceV1beta1 {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Service Broker API
    *
    * The Google Cloud Platform Service Broker API provides Google hosted
    * implementation of the Open Service Broker API
    * (https://www.openservicebrokerapi.org/).
    *
    * @example
    * const {google} = require('googleapis');
    * const servicebroker = google.servicebroker('v1beta1');
    *
    * @namespace servicebroker
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Servicebroker
    */
  @JSImport("googleapis", "servicebroker_v1beta1.Servicebroker")
  @js.native
  class Servicebroker protected ()
    extends typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1.Servicebroker {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
