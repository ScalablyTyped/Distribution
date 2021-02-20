package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Placement Tag Data
  */
@js.native
trait SchemaTagData extends StObject {
  
  /**
    * Ad associated with this placement tag. Applicable only when format is
    * PLACEMENT_TAG_TRACKING.
    */
  var adId: js.UndefOr[String] = js.native
  
  /**
    * Tag string to record a click.
    */
  var clickTag: js.UndefOr[String] = js.native
  
  /**
    * Creative associated with this placement tag. Applicable only when format
    * is PLACEMENT_TAG_TRACKING.
    */
  var creativeId: js.UndefOr[String] = js.native
  
  /**
    * TagData tag format of this tag.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * Tag string for serving an ad.
    */
  var impressionTag: js.UndefOr[String] = js.native
}
object SchemaTagData {
  
  @scala.inline
  def apply(): SchemaTagData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTagData]
  }
  
  @scala.inline
  implicit class SchemaTagDataMutableBuilder[Self <: SchemaTagData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdId(value: String): Self = StObject.set(x, "adId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdIdUndefined: Self = StObject.set(x, "adId", js.undefined)
    
    @scala.inline
    def setClickTag(value: String): Self = StObject.set(x, "clickTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickTagUndefined: Self = StObject.set(x, "clickTag", js.undefined)
    
    @scala.inline
    def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setImpressionTag(value: String): Self = StObject.set(x, "impressionTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionTagUndefined: Self = StObject.set(x, "impressionTag", js.undefined)
  }
}
