package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The conversionPings object encapsulates information about conversion pings
  * that need to be respected by the channel.
  */
trait SchemaChannelConversionPings extends StObject {
  
  /**
    * Pings that the app shall fire (authenticated by biscotti cookie). Each
    * ping has a context, in which the app must fire the ping, and a url
    * identifying the ping.
    */
  var pings: js.UndefOr[js.Array[SchemaChannelConversionPing]] = js.undefined
}
object SchemaChannelConversionPings {
  
  @scala.inline
  def apply(): SchemaChannelConversionPings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelConversionPings]
  }
  
  @scala.inline
  implicit class SchemaChannelConversionPingsMutableBuilder[Self <: SchemaChannelConversionPings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPings(value: js.Array[SchemaChannelConversionPing]): Self = StObject.set(x, "pings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPingsUndefined: Self = StObject.set(x, "pings", js.undefined)
    
    @scala.inline
    def setPingsVarargs(value: SchemaChannelConversionPing*): Self = StObject.set(x, "pings", js.Array(value :_*))
  }
}
