package typings.mangopay2NodejsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityBase {
  
  @js.native
  trait EntityBaseData extends StObject {
    
    var CreationDate: Double = js.native
    
    var Id: String = js.native
    
    var Tag: String = js.native
  }
  object EntityBaseData {
    
    @scala.inline
    def apply(CreationDate: Double, Id: String, Tag: String): EntityBaseData = {
      val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntityBaseData]
    }
    
    @scala.inline
    implicit class EntityBaseDataMutableBuilder[Self <: EntityBaseData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    }
  }
}
