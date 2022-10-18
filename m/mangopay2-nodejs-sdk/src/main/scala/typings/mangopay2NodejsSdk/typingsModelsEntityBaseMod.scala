package typings.mangopay2NodejsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsEntityBaseMod {
  
  object entityBase {
    
    trait EntityBaseData extends StObject {
      
      var CreationDate: Double
      
      var Id: String
      
      var Tag: String
    }
    object EntityBaseData {
      
      inline def apply(CreationDate: Double, Id: String, Tag: String): EntityBaseData = {
        val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
        __obj.asInstanceOf[EntityBaseData]
      }
      
      extension [Self <: EntityBaseData](x: Self) {
        
        inline def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      }
    }
  }
}
