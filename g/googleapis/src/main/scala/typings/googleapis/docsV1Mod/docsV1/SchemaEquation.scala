package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEquation extends StObject {
  
  /**
    * The suggested deletion IDs. If empty, then there are no suggested deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The suggested insertion IDs. A Equation may have multiple insertion IDs if it is a nested suggested change. If empty, then this is not a suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaEquation {
  
  inline def apply(): SchemaEquation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEquation]
  }
  
  extension [Self <: SchemaEquation](x: Self) {
    
    inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedDeletionIdsNull: Self = StObject.set(x, "suggestedDeletionIds", null)
    
    inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
    
    inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedInsertionIdsNull: Self = StObject.set(x, "suggestedInsertionIds", null)
    
    inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
    
    inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value*))
  }
}
