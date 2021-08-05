package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON request template to undelete a user in Directory API.
  */
trait SchemaUserUndelete extends StObject {
  
  /**
    * OrgUnit of User
    */
  var orgUnitPath: js.UndefOr[String] = js.undefined
}
object SchemaUserUndelete {
  
  inline def apply(): SchemaUserUndelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserUndelete]
  }
  
  extension [Self <: SchemaUserUndelete](x: Self) {
    
    inline def setOrgUnitPath(value: String): Self = StObject.set(x, "orgUnitPath", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitPathUndefined: Self = StObject.set(x, "orgUnitPath", js.undefined)
  }
}
