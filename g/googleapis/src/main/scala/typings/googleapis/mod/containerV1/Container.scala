package typings.googleapis.mod.containerV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Kubernetes Engine API
  *
  * Builds and manages container-based applications, powered by the open source
  * Kubernetes technology.
  *
  * @example
  * const {google} = require('googleapis');
  * const container = google.container('v1');
  *
  * @namespace container
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Container
  */
@JSImport("googleapis", "container_v1.Container")
@js.native
class Container protected ()
  extends typings.googleapis.containerV1Mod.containerV1.Container {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
