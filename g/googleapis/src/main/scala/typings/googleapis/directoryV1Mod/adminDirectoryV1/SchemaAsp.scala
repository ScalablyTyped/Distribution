package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAsp extends StObject {
  
  /**
    * The unique ID of the ASP.
    */
  var codeId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The time when the ASP was created. Expressed in [Unix time](https://en.wikipedia.org/wiki/Epoch_time) format.
    */
  var creationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ETag of the ASP.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the API resource. This is always `admin#directory#asp`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time when the ASP was last used. Expressed in [Unix time](https://en.wikipedia.org/wiki/Epoch_time) format.
    */
  var lastTimeUsed: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the application that the user, represented by their `userId`, entered when the ASP was created.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique ID of the user who issued the ASP.
    */
  var userKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaAsp {
  
  inline def apply(): SchemaAsp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsp]
  }
  
  extension [Self <: SchemaAsp](x: Self) {
    
    inline def setCodeId(value: Double): Self = StObject.set(x, "codeId", value.asInstanceOf[js.Any])
    
    inline def setCodeIdNull: Self = StObject.set(x, "codeId", null)
    
    inline def setCodeIdUndefined: Self = StObject.set(x, "codeId", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeNull: Self = StObject.set(x, "creationTime", null)
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastTimeUsed(value: String): Self = StObject.set(x, "lastTimeUsed", value.asInstanceOf[js.Any])
    
    inline def setLastTimeUsedNull: Self = StObject.set(x, "lastTimeUsed", null)
    
    inline def setLastTimeUsedUndefined: Self = StObject.set(x, "lastTimeUsed", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    inline def setUserKeyNull: Self = StObject.set(x, "userKey", null)
    
    inline def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
  }
}
