package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The template that returns individual ASP (Access Code) data.
  */
trait SchemaAsp extends StObject {
  
  /**
    * The unique ID of the ASP.
    */
  var codeId: js.UndefOr[Double] = js.undefined
  
  /**
    * The time when the ASP was created. Expressed in Unix time format.
    */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /**
    * ETag of the ASP.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the API resource. This is always admin#directory#asp.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the ASP was last used. Expressed in Unix time format.
    */
  var lastTimeUsed: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the application that the user, represented by their userId,
    * entered when the ASP was created.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID of the user who issued the ASP.
    */
  var userKey: js.UndefOr[String] = js.undefined
}
object SchemaAsp {
  
  @scala.inline
  def apply(): SchemaAsp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsp]
  }
  
  @scala.inline
  implicit class SchemaAspMutableBuilder[Self <: SchemaAsp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeId(value: Double): Self = StObject.set(x, "codeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeIdUndefined: Self = StObject.set(x, "codeId", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastTimeUsed(value: String): Self = StObject.set(x, "lastTimeUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTimeUsedUndefined: Self = StObject.set(x, "lastTimeUsed", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
  }
}
