package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifies a creative which has been associated with a given campaign.
  */
@js.native
trait SchemaCampaignCreativeAssociation extends StObject {
  
  /**
    * ID of the creative associated with the campaign. This is a required
    * field.
    */
  var creativeId: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#campaignCreativeAssociation&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaCampaignCreativeAssociation {
  
  @scala.inline
  def apply(): SchemaCampaignCreativeAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCampaignCreativeAssociation]
  }
  
  @scala.inline
  implicit class SchemaCampaignCreativeAssociationMutableBuilder[Self <: SchemaCampaignCreativeAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
