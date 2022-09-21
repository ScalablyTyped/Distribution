package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCollectionSelector extends StObject {
  
  /**
    * When false, selects only collections that are immediate children of the `parent` specified in the containing `RunQueryRequest`. When true, selects all descendant collections.
    */
  var allDescendants: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The collection ID. When set, selects only collections with this ID.
    */
  var collectionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCollectionSelector {
  
  inline def apply(): SchemaCollectionSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectionSelector]
  }
  
  extension [Self <: SchemaCollectionSelector](x: Self) {
    
    inline def setAllDescendants(value: Boolean): Self = StObject.set(x, "allDescendants", value.asInstanceOf[js.Any])
    
    inline def setAllDescendantsNull: Self = StObject.set(x, "allDescendants", null)
    
    inline def setAllDescendantsUndefined: Self = StObject.set(x, "allDescendants", js.undefined)
    
    inline def setCollectionId(value: String): Self = StObject.set(x, "collectionId", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdNull: Self = StObject.set(x, "collectionId", null)
    
    inline def setCollectionIdUndefined: Self = StObject.set(x, "collectionId", js.undefined)
  }
}
