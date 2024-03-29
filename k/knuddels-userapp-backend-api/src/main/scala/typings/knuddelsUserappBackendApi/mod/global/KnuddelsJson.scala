package typings.knuddelsUserappBackendApi.mod.global

import org.scalablytyped.runtime.StringDictionary
import typings.knuddelsUserappBackendApi.mod.KnuddelsJsonData
import typings.knuddelsUserappBackendApi.mod._KnuddelsJsonData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type KnuddelsJson = {[x: string] : knuddels-userapp-backend-api.knuddels-userapp-backend-api.KnuddelsJsonData | undefined}
}}}
to avoid circular code involving: 
- knuddels-userapp-backend-api.knuddels-userapp-backend-api.<global>.KnuddelsJson
- knuddels-userapp-backend-api.knuddels-userapp-backend-api.<global>.KnuddelsJsonArray
- knuddels-userapp-backend-api.knuddels-userapp-backend-api.KnuddelsJsonData
*/
trait KnuddelsJson
  extends StObject
     with /* x */ StringDictionary[js.UndefOr[KnuddelsJsonData]]
     with _KnuddelsJsonData
object KnuddelsJson {
  
  inline def apply(): KnuddelsJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnuddelsJson]
  }
}
