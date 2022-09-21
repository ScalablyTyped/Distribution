package typings.googleapis.v1p5beta1Mod.cloudassetV1p5beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudasset/v1p5beta1", "cloudasset_v1p5beta1.Cloudasset")
@js.native
open class Cloudasset protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var assets: ResourceAssets = js.native
  
  var context: APIRequestContext = js.native
}
