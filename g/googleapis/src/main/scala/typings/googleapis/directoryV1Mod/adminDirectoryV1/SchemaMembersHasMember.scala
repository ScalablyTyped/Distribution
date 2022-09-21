package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembersHasMember extends StObject {
  
  /**
    * Output only. Identifies whether the given user is a member of the group. Membership can be direct or nested.
    */
  var isMember: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaMembersHasMember {
  
  inline def apply(): SchemaMembersHasMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembersHasMember]
  }
  
  extension [Self <: SchemaMembersHasMember](x: Self) {
    
    inline def setIsMember(value: Boolean): Self = StObject.set(x, "isMember", value.asInstanceOf[js.Any])
    
    inline def setIsMemberNull: Self = StObject.set(x, "isMember", null)
    
    inline def setIsMemberUndefined: Self = StObject.set(x, "isMember", js.undefined)
  }
}
