package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proximitybeaconV1beta1 {
  
  /**
    * Proximity Beacon API
    *
    * Registers, manages, indexes, and searches beacons.
    *
    * @example
    * const {google} = require('googleapis');
    * const proximitybeacon = google.proximitybeacon('v1beta1');
    *
    * @namespace proximitybeacon
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Proximitybeacon
    */
  @JSImport("googleapis", "proximitybeacon_v1beta1.Proximitybeacon")
  @js.native
  class Proximitybeacon protected ()
    extends typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1.Proximitybeacon {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "proximitybeacon_v1beta1.Resource$Beaconinfo")
  @js.native
  class ResourceBeaconinfo protected ()
    extends typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1.ResourceBeaconinfo {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "proximitybeacon_v1beta1.Resource$Beacons")
  @js.native
  class ResourceBeacons protected ()
    extends typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1.ResourceBeacons {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "proximitybeacon_v1beta1.Resource$Beacons$Attachments")
  @js.native
  class ResourceBeaconsAttachments protected ()
    extends typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1.ResourceBeaconsAttachments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "proximitybeacon_v1beta1.Resource$Beacons$Diagnostics")
  @js.native
  class ResourceBeaconsDiagnostics protected ()
    extends typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1.ResourceBeaconsDiagnostics {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "proximitybeacon_v1beta1.Resource$Namespaces")
  @js.native
  class ResourceNamespaces protected ()
    extends typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1.ResourceNamespaces {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "proximitybeacon_v1beta1.Resource$V1beta1")
  @js.native
  class ResourceV1beta1 protected ()
    extends typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1.ResourceV1beta1 {
    def this(context: APIRequestContext) = this()
  }
}
