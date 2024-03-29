package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StringDictionary
import typings.knuddelsUserappsApi.mod.KnuddelsJsonData
import typings.knuddelsUserappsApi.mod._KnuddelsJsonData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type KnuddelsJson = {[x: string] : knuddels-userapps-api.knuddels-userapps-api.KnuddelsJsonData | undefined}
}}}
to avoid circular code involving: 
- knuddels-userapps-api.knuddels-userapps-api.<global>.KnuddelsJson
- knuddels-userapps-api.knuddels-userapps-api.<global>.KnuddelsJsonArray
- knuddels-userapps-api.knuddels-userapps-api.KnuddelsJsonData
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
