package typings.googleapis.containerV1beta1Mod.containerV1beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Kubernetes Engine API
  *
  * Builds and manages container-based applications, powered by the open source
  * Kubernetes technology.
  *
  * @example
  * const {google} = require('googleapis');
  * const container = google.container('v1beta1');
  *
  * @namespace container
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Container
  */
@JSImport("googleapis/build/src/apis/container/v1beta1", "container_v1beta1.Container")
@js.native
class Container protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
