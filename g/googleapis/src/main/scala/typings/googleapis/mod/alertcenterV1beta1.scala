package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertcenterV1beta1 {
  
  /**
    * G Suite Alert Center API
    *
    * Manages alerts on issues affecting your domain.
    *
    * @example
    * const {google} = require('googleapis');
    * const alertcenter = google.alertcenter('v1beta1');
    *
    * @namespace alertcenter
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Alertcenter
    */
  @JSImport("googleapis", "alertcenter_v1beta1.Alertcenter")
  @js.native
  class Alertcenter protected ()
    extends typings.googleapis.v1beta1Mod.alertcenterV1beta1.Alertcenter {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "alertcenter_v1beta1.Resource$Alerts")
  @js.native
  class ResourceAlerts protected ()
    extends typings.googleapis.v1beta1Mod.alertcenterV1beta1.ResourceAlerts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "alertcenter_v1beta1.Resource$Alerts$Feedback")
  @js.native
  class ResourceAlertsFeedback protected ()
    extends typings.googleapis.v1beta1Mod.alertcenterV1beta1.ResourceAlertsFeedback {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "alertcenter_v1beta1.Resource$V1beta1")
  @js.native
  class ResourceV1beta1 protected ()
    extends typings.googleapis.v1beta1Mod.alertcenterV1beta1.ResourceV1beta1 {
    def this(context: APIRequestContext) = this()
  }
}
