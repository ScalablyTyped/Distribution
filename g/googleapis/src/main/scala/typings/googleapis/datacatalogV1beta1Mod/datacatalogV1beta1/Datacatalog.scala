package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datacatalog/v1beta1", "datacatalog_v1beta1.Datacatalog")
@js.native
open class Datacatalog protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var catalog: ResourceCatalog = js.native
  
  var context: APIRequestContext = js.native
  
  var entries: ResourceEntries = js.native
  
  var projects: ResourceProjects = js.native
}
