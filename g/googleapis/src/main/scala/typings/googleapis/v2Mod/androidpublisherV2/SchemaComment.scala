package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComment extends StObject {
  
  /**
    * A comment from a developer.
    */
  var developerComment: js.UndefOr[SchemaDeveloperComment] = js.undefined
  
  /**
    * A comment from a user.
    */
  var userComment: js.UndefOr[SchemaUserComment] = js.undefined
}
object SchemaComment {
  
  inline def apply(): SchemaComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComment]
  }
  
  extension [Self <: SchemaComment](x: Self) {
    
    inline def setDeveloperComment(value: SchemaDeveloperComment): Self = StObject.set(x, "developerComment", value.asInstanceOf[js.Any])
    
    inline def setDeveloperCommentUndefined: Self = StObject.set(x, "developerComment", js.undefined)
    
    inline def setUserComment(value: SchemaUserComment): Self = StObject.set(x, "userComment", value.asInstanceOf[js.Any])
    
    inline def setUserCommentUndefined: Self = StObject.set(x, "userComment", js.undefined)
  }
}
