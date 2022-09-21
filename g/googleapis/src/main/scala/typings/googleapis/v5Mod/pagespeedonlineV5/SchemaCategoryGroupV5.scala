package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCategoryGroupV5 extends StObject {
  
  /**
    * The description of what the category is grouping
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The human readable title of the group
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaCategoryGroupV5 {
  
  inline def apply(): SchemaCategoryGroupV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCategoryGroupV5]
  }
  
  extension [Self <: SchemaCategoryGroupV5](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
