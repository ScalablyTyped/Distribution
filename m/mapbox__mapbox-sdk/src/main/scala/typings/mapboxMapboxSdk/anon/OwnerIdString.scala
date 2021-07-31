package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerIdString extends StObject {
  
  var ownerId: String
}
object OwnerIdString {
  
  @scala.inline
  def apply(ownerId: String): OwnerIdString = {
    val __obj = js.Dynamic.literal(ownerId = ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerIdString]
  }
  
  @scala.inline
  implicit class OwnerIdStringMutableBuilder[Self <: OwnerIdString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
  }
}
