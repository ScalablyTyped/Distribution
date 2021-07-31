package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalPermission extends StObject {
  
  /** Permission value. */
  var permission: js.UndefOr[String] = js.undefined
}
object GlobalPermission {
  
  @scala.inline
  def apply(): GlobalPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalPermission]
  }
  
  @scala.inline
  implicit class GlobalPermissionMutableBuilder[Self <: GlobalPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
