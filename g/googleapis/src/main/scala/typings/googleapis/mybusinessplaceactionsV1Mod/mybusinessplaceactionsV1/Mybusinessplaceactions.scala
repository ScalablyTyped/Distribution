package typings.googleapis.mybusinessplaceactionsV1Mod.mybusinessplaceactionsV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mybusinessplaceactions/v1", "mybusinessplaceactions_v1.Mybusinessplaceactions")
@js.native
open class Mybusinessplaceactions protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var locations: ResourceLocations = js.native
  
  var placeActionTypeMetadata: ResourcePlaceactiontypemetadata = js.native
}
