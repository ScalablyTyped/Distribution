package typings.googleapis.plusV1Mod.plusV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCommentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the comment to get.
    */
  var commentId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCommentsGet {
  
  inline def apply(): ParamsResourceCommentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCommentsGet]
  }
  
  extension [Self <: ParamsResourceCommentsGet](x: Self) {
    
    inline def setCommentId(value: String): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    inline def setCommentIdUndefined: Self = StObject.set(x, "commentId", js.undefined)
  }
}
