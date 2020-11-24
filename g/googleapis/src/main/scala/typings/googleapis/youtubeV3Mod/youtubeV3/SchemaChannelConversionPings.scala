package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The conversionPings object encapsulates information about conversion pings
  * that need to be respected by the channel.
  */
@js.native
trait SchemaChannelConversionPings extends js.Object {
  
  /**
    * Pings that the app shall fire (authenticated by biscotti cookie). Each
    * ping has a context, in which the app must fire the ping, and a url
    * identifying the ping.
    */
  var pings: js.UndefOr[js.Array[SchemaChannelConversionPing]] = js.native
}
object SchemaChannelConversionPings {
  
  @scala.inline
  def apply(): SchemaChannelConversionPings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelConversionPings]
  }
  
  @scala.inline
  implicit class SchemaChannelConversionPingsOps[Self <: SchemaChannelConversionPings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPingsVarargs(value: SchemaChannelConversionPing*): Self = this.set("pings", js.Array(value :_*))
    
    @scala.inline
    def setPings(value: js.Array[SchemaChannelConversionPing]): Self = this.set("pings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePings: Self = this.set("pings", js.undefined)
  }
}
