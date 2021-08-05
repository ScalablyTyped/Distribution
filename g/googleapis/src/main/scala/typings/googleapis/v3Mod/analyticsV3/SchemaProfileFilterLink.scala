package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Analytics profile filter link.
  */
trait SchemaProfileFilterLink extends StObject {
  
  /**
    * Filter for this link.
    */
  var filterRef: js.UndefOr[SchemaFilterRef] = js.undefined
  
  /**
    * Profile filter link ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Resource type for Analytics filter.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * View (Profile) for this link.
    */
  var profileRef: js.UndefOr[SchemaProfileRef] = js.undefined
  
  /**
    * The rank of this profile filter link relative to the other filters linked
    * to the same profile. For readonly (i.e., list and get) operations, the
    * rank always starts at 1. For write (i.e., create, update, or delete)
    * operations, you may specify a value between 0 and 255 inclusively, [0,
    * 255]. In order to insert a link at the end of the list, either don&#39;t
    * specify a rank or set a rank to a number greater than the largest rank in
    * the list. In order to insert a link to the beginning of the list specify
    * a rank that is less than or equal to 1. The new link will move all
    * existing filters with the same or lower rank down the list. After the
    * link is inserted/updated/deleted all profile filter links will be
    * renumbered starting at 1.
    */
  var rank: js.UndefOr[Double] = js.undefined
  
  /**
    * Link for this profile filter link.
    */
  var selfLink: js.UndefOr[String] = js.undefined
}
object SchemaProfileFilterLink {
  
  inline def apply(): SchemaProfileFilterLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProfileFilterLink]
  }
  
  extension [Self <: SchemaProfileFilterLink](x: Self) {
    
    inline def setFilterRef(value: SchemaFilterRef): Self = StObject.set(x, "filterRef", value.asInstanceOf[js.Any])
    
    inline def setFilterRefUndefined: Self = StObject.set(x, "filterRef", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProfileRef(value: SchemaProfileRef): Self = StObject.set(x, "profileRef", value.asInstanceOf[js.Any])
    
    inline def setProfileRefUndefined: Self = StObject.set(x, "profileRef", js.undefined)
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
