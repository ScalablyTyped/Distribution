package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaList extends StObject {
  
  /**
    * The ID of the list.
    */
  var listId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A map of nesting levels to the properties of bullets at the associated level. A list has at most nine levels of nesting, so the possible values for the keys of this map are 0 through 8, inclusive.
    */
  var nestingLevel: js.UndefOr[StringDictionary[SchemaNestingLevel] | Null] = js.undefined
}
object SchemaList {
  
  inline def apply(): SchemaList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaList]
  }
  
  extension [Self <: SchemaList](x: Self) {
    
    inline def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    inline def setListIdNull: Self = StObject.set(x, "listId", null)
    
    inline def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
    
    inline def setNestingLevel(value: StringDictionary[SchemaNestingLevel]): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
    
    inline def setNestingLevelNull: Self = StObject.set(x, "nestingLevel", null)
    
    inline def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
  }
}
