package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUploadRef extends StObject {
  
  /**
    * An upload reference should be unique for each user. It follows the form: "https://streetviewpublish.googleapis.com/media/user/{account_id\}/photo/{upload_reference\}"
    */
  var uploadUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaUploadRef {
  
  inline def apply(): SchemaUploadRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadRef]
  }
  
  extension [Self <: SchemaUploadRef](x: Self) {
    
    inline def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    inline def setUploadUrlNull: Self = StObject.set(x, "uploadUrl", null)
    
    inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
  }
}
