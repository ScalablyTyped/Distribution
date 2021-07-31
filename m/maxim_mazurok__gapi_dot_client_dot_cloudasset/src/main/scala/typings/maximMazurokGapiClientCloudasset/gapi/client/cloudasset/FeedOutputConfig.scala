package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeedOutputConfig extends StObject {
  
  /** Destination on Pub/Sub. */
  var pubsubDestination: js.UndefOr[PubsubDestination] = js.undefined
}
object FeedOutputConfig {
  
  @scala.inline
  def apply(): FeedOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedOutputConfig]
  }
  
  @scala.inline
  implicit class FeedOutputConfigMutableBuilder[Self <: FeedOutputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPubsubDestination(value: PubsubDestination): Self = StObject.set(x, "pubsubDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsubDestinationUndefined: Self = StObject.set(x, "pubsubDestination", js.undefined)
  }
}
