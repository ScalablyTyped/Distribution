package typings.lesgo.anon

import typings.lesgo.servicesElasticsearchServiceMod.ProfileId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Profileid extends StObject {
  
  var profile_id: ProfileId
}
object Profileid {
  
  inline def apply(profile_id: ProfileId): Profileid = {
    val __obj = js.Dynamic.literal(profile_id = profile_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profileid]
  }
  
  extension [Self <: Profileid](x: Self) {
    
    inline def setProfile_id(value: ProfileId): Self = StObject.set(x, "profile_id", value.asInstanceOf[js.Any])
  }
}
