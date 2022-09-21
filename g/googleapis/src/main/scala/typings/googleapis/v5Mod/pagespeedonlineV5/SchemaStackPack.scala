package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStackPack extends StObject {
  
  /**
    * The stack pack advice strings.
    */
  var descriptions: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The stack pack icon data uri.
    */
  var iconDataURL: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The stack pack id.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The stack pack title.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaStackPack {
  
  inline def apply(): SchemaStackPack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStackPack]
  }
  
  extension [Self <: SchemaStackPack](x: Self) {
    
    inline def setDescriptions(value: StringDictionary[String]): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    inline def setDescriptionsNull: Self = StObject.set(x, "descriptions", null)
    
    inline def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
    
    inline def setIconDataURL(value: String): Self = StObject.set(x, "iconDataURL", value.asInstanceOf[js.Any])
    
    inline def setIconDataURLNull: Self = StObject.set(x, "iconDataURL", null)
    
    inline def setIconDataURLUndefined: Self = StObject.set(x, "iconDataURL", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
