package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapResultTupleOptions
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Optional="false" array of $.ig.OlapResultAxisMember objects which form the tuple object.
    */
  var members: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object OlapResultTupleOptions {
  
  inline def apply(): OlapResultTupleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapResultTupleOptions]
  }
  
  extension [Self <: OlapResultTupleOptions](x: Self) {
    
    inline def setMembers(value: js.Array[js.Any]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: js.Any*): Self = StObject.set(x, "members", js.Array(value :_*))
  }
}
