package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/pubsublite/v1", "pubsublite_v1.Pubsublite")
@js.native
open class Pubsublite protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var admin: ResourceAdmin = js.native
  
  var context: APIRequestContext = js.native
  
  var cursor: ResourceCursor = js.native
  
  var topicStats: ResourceTopicstats = js.native
}
