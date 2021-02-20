package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait region extends StObject
@JSImport("itunesconnectanalytics", "region")
@js.native
object region extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[region with String] = js.native
  
  @js.native
  sealed trait africaMiddleEastIndia extends region
  /* "-100005" */ val africaMiddleEastIndia: typings.itunesconnectanalytics.mod.region.africaMiddleEastIndia with String = js.native
  
  @js.native
  sealed trait asiaPacific extends region
  /* "-100004" */ val asiaPacific: typings.itunesconnectanalytics.mod.region.asiaPacific with String = js.native
  
  @js.native
  sealed trait europe extends region
  /* "-100003" */ val europe: typings.itunesconnectanalytics.mod.region.europe with String = js.native
  
  @js.native
  sealed trait latinAmericaTheCaribbean extends region
  /* "-100002" */ val latinAmericaTheCaribbean: typings.itunesconnectanalytics.mod.region.latinAmericaTheCaribbean with String = js.native
  
  @js.native
  sealed trait usaCanada extends region
  /* "-100001" */ val usaCanada: typings.itunesconnectanalytics.mod.region.usaCanada with String = js.native
}
