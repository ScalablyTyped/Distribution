package typings.googleapis.mybusinessqandaV1Mod.mybusinessqandaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnswer extends StObject {
  
  /**
    * Output only. The author of the answer. Will only be set during list operations.
    */
  var author: js.UndefOr[SchemaAuthor] = js.undefined
  
  /**
    * Output only. The timestamp for when the answer was written. Only retrieved during ListResponse fetching.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The unique name for the answer locations/x/questions/x/answers/x
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The text of the answer. It should contain at least one non-whitespace character. The maximum length is 4096 characters.
    */
  var text: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp for when the answer was last modified.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The number of upvotes for the answer.
    */
  var upvoteCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAnswer {
  
  inline def apply(): SchemaAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnswer]
  }
  
  extension [Self <: SchemaAnswer](x: Self) {
    
    inline def setAuthor(value: SchemaAuthor): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUpvoteCount(value: Double): Self = StObject.set(x, "upvoteCount", value.asInstanceOf[js.Any])
    
    inline def setUpvoteCountNull: Self = StObject.set(x, "upvoteCount", null)
    
    inline def setUpvoteCountUndefined: Self = StObject.set(x, "upvoteCount", js.undefined)
  }
}
