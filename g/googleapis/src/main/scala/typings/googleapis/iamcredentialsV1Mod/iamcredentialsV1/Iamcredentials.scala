package typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IAM Service Account Credentials API
  *
  * Creates short-lived, limited-privilege credentials for IAM service
  * accounts.
  *
  * @example
  * const {google} = require('googleapis');
  * const iamcredentials = google.iamcredentials('v1');
  *
  * @namespace iamcredentials
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Iamcredentials
  */
@JSImport("googleapis/build/src/apis/iamcredentials/v1", "iamcredentials_v1.Iamcredentials")
@js.native
class Iamcredentials protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
