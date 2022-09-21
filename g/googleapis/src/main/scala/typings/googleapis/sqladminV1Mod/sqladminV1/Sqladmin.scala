package typings.googleapis.sqladminV1Mod.sqladminV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sqladmin/v1", "sqladmin_v1.Sqladmin")
@js.native
open class Sqladmin protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var backupRuns: ResourceBackupruns = js.native
  
  var connect: ResourceConnect = js.native
  
  var context: APIRequestContext = js.native
  
  var databases: ResourceDatabases = js.native
  
  var flags: ResourceFlags = js.native
  
  var instances: ResourceInstances = js.native
  
  var operations: ResourceOperations = js.native
  
  var projects: ResourceProjects = js.native
  
  var sslCerts: ResourceSslcerts = js.native
  
  var tiers: ResourceTiers = js.native
  
  var users: ResourceUsers = js.native
}
