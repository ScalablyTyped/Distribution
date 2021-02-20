package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fitnessV1 {
  
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
  @JSImport("googleapis", "fitness_v1.Fitness")
  @js.native
  class Fitness protected ()
    extends typings.googleapis.fitnessV1Mod.fitnessV1.Fitness {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "fitness_v1.Resource$Users")
  @js.native
  class ResourceUsers protected ()
    extends typings.googleapis.fitnessV1Mod.fitnessV1.ResourceUsers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "fitness_v1.Resource$Users$Dataset")
  @js.native
  class ResourceUsersDataset protected ()
    extends typings.googleapis.fitnessV1Mod.fitnessV1.ResourceUsersDataset {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "fitness_v1.Resource$Users$Datasources")
  @js.native
  class ResourceUsersDatasources protected ()
    extends typings.googleapis.fitnessV1Mod.fitnessV1.ResourceUsersDatasources {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "fitness_v1.Resource$Users$Datasources$Datapointchanges")
  @js.native
  class ResourceUsersDatasourcesDatapointchanges protected ()
    extends typings.googleapis.fitnessV1Mod.fitnessV1.ResourceUsersDatasourcesDatapointchanges {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "fitness_v1.Resource$Users$Datasources$Datasets")
  @js.native
  class ResourceUsersDatasourcesDatasets protected ()
    extends typings.googleapis.fitnessV1Mod.fitnessV1.ResourceUsersDatasourcesDatasets {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "fitness_v1.Resource$Users$Sessions")
  @js.native
  class ResourceUsersSessions protected ()
    extends typings.googleapis.fitnessV1Mod.fitnessV1.ResourceUsersSessions {
    def this(context: APIRequestContext) = this()
  }
}
