package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComment extends StObject {
  
  /**
    * The full comment body. Maximum of 120000 characters. This can contain rich text syntax.
    */
  var body: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when this comment was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The user or Google Support agent created this comment.
    */
  var creator: js.UndefOr[SchemaActor] = js.undefined
  
  /**
    * Output only. The resource name for the comment.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. An automatically generated plain text version of body with all rich text syntax stripped.
    */
  var plainTextBody: js.UndefOr[String | Null] = js.undefined
}
object SchemaComment {
  
  inline def apply(): SchemaComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComment]
  }
  
  extension [Self <: SchemaComment](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreator(value: SchemaActor): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlainTextBody(value: String): Self = StObject.set(x, "plainTextBody", value.asInstanceOf[js.Any])
    
    inline def setPlainTextBodyNull: Self = StObject.set(x, "plainTextBody", null)
    
    inline def setPlainTextBodyUndefined: Self = StObject.set(x, "plainTextBody", js.undefined)
  }
}
