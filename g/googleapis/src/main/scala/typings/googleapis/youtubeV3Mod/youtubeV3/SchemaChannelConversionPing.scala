package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pings that the app shall fire (authenticated by biscotti cookie). Each ping
  * has a context, in which the app must fire the ping, and a url identifying
  * the ping.
  */
@js.native
trait SchemaChannelConversionPing extends StObject {
  
  /**
    * Defines the context of the ping.
    */
  var context: js.UndefOr[String] = js.native
  
  /**
    * The url (without the schema) that the player shall send the ping to.
    * It&#39;s at caller&#39;s descretion to decide which schema to use (http
    * vs https) Example of a returned url:
    * //googleads.g.doubleclick.net/pagead/
    * viewthroughconversion/962985656/?data=path%3DtHe_path%3Btype%3D
    * cview%3Butuid%3DGISQtTNGYqaYl4sKxoVvKA&amp;labe=default The caller must
    * append biscotti authentication (ms param in case of mobile, for example)
    * to this ping.
    */
  var conversionUrl: js.UndefOr[String] = js.native
}
object SchemaChannelConversionPing {
  
  @scala.inline
  def apply(): SchemaChannelConversionPing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelConversionPing]
  }
  
  @scala.inline
  implicit class SchemaChannelConversionPingMutableBuilder[Self <: SchemaChannelConversionPing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setConversionUrl(value: String): Self = StObject.set(x, "conversionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionUrlUndefined: Self = StObject.set(x, "conversionUrl", js.undefined)
  }
}
