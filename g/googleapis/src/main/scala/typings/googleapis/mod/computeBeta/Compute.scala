package typings.googleapis.mod.computeBeta

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Compute Engine API
  *
  * Creates and runs virtual machines on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const compute = google.compute('beta');
  *
  * @namespace compute
  * @type {Function}
  * @version beta
  * @variation beta
  * @param {object=} options Options for Compute
  */
@JSImport("googleapis", "compute_beta.Compute")
@js.native
class Compute protected ()
  extends typings.googleapis.betaMod.computeBeta.Compute {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
