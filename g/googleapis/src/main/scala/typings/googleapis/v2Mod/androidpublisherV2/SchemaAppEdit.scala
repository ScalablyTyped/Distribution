package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an edit of an app. An edit allows clients to make multiple
  * changes before committing them in one operation.
  */
trait SchemaAppEdit extends StObject {
  
  /**
    * The time at which the edit will expire and will be no longer valid for
    * use in any subsequent API calls (encoded as seconds since the Epoch).
    */
  var expiryTimeSeconds: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the edit that can be used in subsequent API calls.
    */
  var id: js.UndefOr[String] = js.undefined
}
object SchemaAppEdit {
  
  inline def apply(): SchemaAppEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppEdit]
  }
  
  extension [Self <: SchemaAppEdit](x: Self) {
    
    inline def setExpiryTimeSeconds(value: String): Self = StObject.set(x, "expiryTimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setExpiryTimeSecondsUndefined: Self = StObject.set(x, "expiryTimeSeconds", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
