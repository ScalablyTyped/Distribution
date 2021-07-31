package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStartPageToken extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#startPageToken&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The starting page token for listing changes.
    */
  var startPageToken: js.UndefOr[String] = js.undefined
}
object SchemaStartPageToken {
  
  @scala.inline
  def apply(): SchemaStartPageToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartPageToken]
  }
  
  @scala.inline
  implicit class SchemaStartPageTokenMutableBuilder[Self <: SchemaStartPageToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setStartPageToken(value: String): Self = StObject.set(x, "startPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPageTokenUndefined: Self = StObject.set(x, "startPageToken", js.undefined)
  }
}
