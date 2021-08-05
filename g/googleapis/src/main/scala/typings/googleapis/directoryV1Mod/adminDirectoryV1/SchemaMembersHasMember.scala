package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Has Member response in Directory API.
  */
trait SchemaMembersHasMember extends StObject {
  
  /**
    * Identifies whether the given user is a member of the group. Membership
    * can be direct or nested.
    */
  var isMember: js.UndefOr[Boolean] = js.undefined
}
object SchemaMembersHasMember {
  
  inline def apply(): SchemaMembersHasMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembersHasMember]
  }
  
  extension [Self <: SchemaMembersHasMember](x: Self) {
    
    inline def setIsMember(value: Boolean): Self = StObject.set(x, "isMember", value.asInstanceOf[js.Any])
    
    inline def setIsMemberUndefined: Self = StObject.set(x, "isMember", js.undefined)
  }
}
