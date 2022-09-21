package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/searchconsole/v1", "searchconsole_v1.Searchconsole")
@js.native
open class Searchconsole protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var searchanalytics: ResourceSearchanalytics = js.native
  
  var sitemaps: ResourceSitemaps = js.native
  
  var sites: ResourceSites = js.native
  
  var urlInspection: ResourceUrlinspection = js.native
  
  var urlTestingTools: ResourceUrltestingtools = js.native
}
