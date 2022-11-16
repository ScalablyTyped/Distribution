package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StringDictionary
import typings.knuddelsUserappsApi.mod.JsonData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type Json = {[x: string] : knuddels-userapps-api.knuddels-userapps-api.JsonData | undefined}
}}}
to avoid circular code involving: 
- knuddels-userapps-api.knuddels-userapps-api.<global>.Json
- knuddels-userapps-api.knuddels-userapps-api.<global>.JsonArray
- knuddels-userapps-api.knuddels-userapps-api.<global>.KnuddelsEventArray
- knuddels-userapps-api.knuddels-userapps-api.JsonData
- knuddels-userapps-api.knuddels-userapps-api.KnuddelsEvent
*/
trait Json
  extends StObject
     with /* x */ StringDictionary[js.UndefOr[JsonData]]
object Json {
  
  inline def apply(): Json = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Json]
  }
}
