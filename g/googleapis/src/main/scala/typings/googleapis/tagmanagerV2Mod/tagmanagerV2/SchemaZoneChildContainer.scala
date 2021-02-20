package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a child container of a Zone.
  */
@js.native
trait SchemaZoneChildContainer extends StObject {
  
  /**
    * The zone&#39;s nickname for the child container.
    */
  var nickname: js.UndefOr[String] = js.native
  
  /**
    * The child container&#39;s public id.
    */
  var publicId: js.UndefOr[String] = js.native
}
object SchemaZoneChildContainer {
  
  @scala.inline
  def apply(): SchemaZoneChildContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaZoneChildContainer]
  }
  
  @scala.inline
  implicit class SchemaZoneChildContainerMutableBuilder[Self <: SchemaZoneChildContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    @scala.inline
    def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIdUndefined: Self = StObject.set(x, "publicId", js.undefined)
  }
}
