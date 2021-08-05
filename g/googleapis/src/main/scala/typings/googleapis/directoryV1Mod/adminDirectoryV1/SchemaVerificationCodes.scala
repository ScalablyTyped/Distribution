package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON response template for List verification codes operation in Directory
  * API.
  */
trait SchemaVerificationCodes extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * A list of verification code resources.
    */
  var items: js.UndefOr[js.Array[SchemaVerificationCode]] = js.undefined
  
  /**
    * The type of the resource. This is always
    * admin#directory#verificationCodesList.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaVerificationCodes {
  
  inline def apply(): SchemaVerificationCodes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerificationCodes]
  }
  
  extension [Self <: SchemaVerificationCodes](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[SchemaVerificationCode]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaVerificationCode*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
