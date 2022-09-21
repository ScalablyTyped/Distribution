package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShortRepresentation extends StObject {
  
  /**
    * A string representation of the expression subtree rooted at this node.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A mapping of (subquery variable name) -\> (subquery node id) for cases where the `description` string of this node references a `SCALAR` subquery contained in the expression subtree rooted at this node. The referenced `SCALAR` subquery may not necessarily be a direct child of this node.
    */
  var subqueries: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
}
object SchemaShortRepresentation {
  
  inline def apply(): SchemaShortRepresentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShortRepresentation]
  }
  
  extension [Self <: SchemaShortRepresentation](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSubqueries(value: StringDictionary[Double]): Self = StObject.set(x, "subqueries", value.asInstanceOf[js.Any])
    
    inline def setSubqueriesNull: Self = StObject.set(x, "subqueries", null)
    
    inline def setSubqueriesUndefined: Self = StObject.set(x, "subqueries", js.undefined)
  }
}
