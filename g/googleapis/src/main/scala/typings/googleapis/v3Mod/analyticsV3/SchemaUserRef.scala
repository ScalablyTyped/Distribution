package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a user reference.
  */
@js.native
trait SchemaUserRef extends StObject {
  
  /**
    * Email ID of this user.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * User ID.
    */
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object SchemaUserRef {
  
  @scala.inline
  def apply(): SchemaUserRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRef]
  }
  
  @scala.inline
  implicit class SchemaUserRefMutableBuilder[Self <: SchemaUserRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
