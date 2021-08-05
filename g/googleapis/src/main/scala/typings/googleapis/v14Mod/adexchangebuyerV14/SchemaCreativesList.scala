package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The creatives feed lists the active creatives for the Ad Exchange buyer
  * accounts that the user has access to. Each entry in the feed corresponds to
  * a single creative.
  */
trait SchemaCreativesList extends StObject {
  
  /**
    * A list of creatives.
    */
  var items: js.UndefOr[js.Array[SchemaCreative]] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Continuation token used to page through creatives. To retrieve the next
    * page of results, set the next request&#39;s &quot;pageToken&quot; value
    * to this.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaCreativesList {
  
  inline def apply(): SchemaCreativesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativesList]
  }
  
  extension [Self <: SchemaCreativesList](x: Self) {
    
    inline def setItems(value: js.Array[SchemaCreative]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaCreative*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
