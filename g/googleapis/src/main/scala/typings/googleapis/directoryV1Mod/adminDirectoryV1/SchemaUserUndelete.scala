package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON request template to undelete a user in Directory API.
  */
@js.native
trait SchemaUserUndelete extends StObject {
  
  /**
    * OrgUnit of User
    */
  var orgUnitPath: js.UndefOr[String] = js.native
}
object SchemaUserUndelete {
  
  @scala.inline
  def apply(): SchemaUserUndelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserUndelete]
  }
  
  @scala.inline
  implicit class SchemaUserUndeleteMutableBuilder[Self <: SchemaUserUndelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrgUnitPath(value: String): Self = StObject.set(x, "orgUnitPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgUnitPathUndefined: Self = StObject.set(x, "orgUnitPath", js.undefined)
  }
}
