package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rights management policy for YouTube resources.
  */
@js.native
trait SchemaAccessPolicy extends StObject {
  
  /**
    * The value of allowed indicates whether the access to the policy is
    * allowed or denied by default.
    */
  var allowed: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of region codes that identify countries where the default policy
    * do not apply.
    */
  var exception: js.UndefOr[js.Array[String]] = js.native
}
object SchemaAccessPolicy {
  
  @scala.inline
  def apply(): SchemaAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessPolicy]
  }
  
  @scala.inline
  implicit class SchemaAccessPolicyMutableBuilder[Self <: SchemaAccessPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
    
    @scala.inline
    def setException(value: js.Array[String]): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    @scala.inline
    def setExceptionVarargs(value: String*): Self = StObject.set(x, "exception", js.Array(value :_*))
  }
}
