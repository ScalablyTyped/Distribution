package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<hellosign-sdk.hellosign-sdk.Team, 'name'> */
trait PickTeamname extends StObject {
  
  var name: String
}
object PickTeamname {
  
  inline def apply(name: String): PickTeamname = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTeamname]
  }
  
  extension [Self <: PickTeamname](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
