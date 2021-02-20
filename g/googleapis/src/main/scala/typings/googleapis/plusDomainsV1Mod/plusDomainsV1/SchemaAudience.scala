package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAudience extends StObject {
  
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The access control list entry.
    */
  var item: js.UndefOr[SchemaPlusDomainsAclentryResource] = js.native
  
  /**
    * Identifies this resource as an audience. Value:
    * &quot;plus#audience&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The number of people in this circle. This only applies if entity_type is
    * CIRCLE.
    */
  var memberCount: js.UndefOr[Double] = js.native
  
  /**
    * The circle members&#39; visibility as chosen by the owner of the circle.
    * This only applies for items with &quot;item.type&quot; equals
    * &quot;circle&quot;. Possible values are:   - &quot;public&quot; - Members
    * are visible to the public.  - &quot;limited&quot; - Members are visible
    * to a limited audience.  - &quot;private&quot; - Members are visible to
    * the owner only.
    */
  var visibility: js.UndefOr[String] = js.native
}
object SchemaAudience {
  
  @scala.inline
  def apply(): SchemaAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAudience]
  }
  
  @scala.inline
  implicit class SchemaAudienceMutableBuilder[Self <: SchemaAudience] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItem(value: SchemaPlusDomainsAclentryResource): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMemberCount(value: Double): Self = StObject.set(x, "memberCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberCountUndefined: Self = StObject.set(x, "memberCount", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
