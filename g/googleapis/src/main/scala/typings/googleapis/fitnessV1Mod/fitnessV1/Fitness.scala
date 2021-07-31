package typings.googleapis.fitnessV1Mod.fitnessV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fitness
  *
  * Stores and accesses user data in the fitness store from apps on any
  * platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const fitness = google.fitness('v1');
  *
  * @namespace fitness
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Fitness
  */
@JSImport("googleapis/build/src/apis/fitness/v1", "fitness_v1.Fitness")
@js.native
class Fitness protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var users: ResourceUsers = js.native
}
