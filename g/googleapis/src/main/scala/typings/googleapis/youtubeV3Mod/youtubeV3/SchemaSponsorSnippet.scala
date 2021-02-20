package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSponsorSnippet extends StObject {
  
  /**
    * The id of the channel being sponsored.
    */
  var channelId: js.UndefOr[String] = js.native
  
  /**
    * The cumulative time a user has been a sponsor in months.
    */
  var cumulativeDurationMonths: js.UndefOr[Double] = js.native
  
  /**
    * Details about the sponsor.
    */
  var sponsorDetails: js.UndefOr[SchemaChannelProfileDetails] = js.native
  
  /**
    * The date and time when the user became a sponsor. The value is specified
    * in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var sponsorSince: js.UndefOr[String] = js.native
}
object SchemaSponsorSnippet {
  
  @scala.inline
  def apply(): SchemaSponsorSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSponsorSnippet]
  }
  
  @scala.inline
  implicit class SchemaSponsorSnippetMutableBuilder[Self <: SchemaSponsorSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setCumulativeDurationMonths(value: Double): Self = StObject.set(x, "cumulativeDurationMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCumulativeDurationMonthsUndefined: Self = StObject.set(x, "cumulativeDurationMonths", js.undefined)
    
    @scala.inline
    def setSponsorDetails(value: SchemaChannelProfileDetails): Self = StObject.set(x, "sponsorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSponsorDetailsUndefined: Self = StObject.set(x, "sponsorDetails", js.undefined)
    
    @scala.inline
    def setSponsorSince(value: String): Self = StObject.set(x, "sponsorSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSponsorSinceUndefined: Self = StObject.set(x, "sponsorSince", js.undefined)
  }
}
