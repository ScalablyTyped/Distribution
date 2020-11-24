package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait region extends js.Object
@JSImport("itunesconnectanalytics", "region")
@js.native
object region extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[region with String] = js.native
  
  @js.native
  sealed trait africaMiddleEastIndia extends region
  /* "-100005" */ @js.native
  object africaMiddleEastIndia extends TopLevel[africaMiddleEastIndia with String]
  
  @js.native
  sealed trait asiaPacific extends region
  /* "-100004" */ @js.native
  object asiaPacific extends TopLevel[asiaPacific with String]
  
  @js.native
  sealed trait europe extends region
  /* "-100003" */ @js.native
  object europe extends TopLevel[europe with String]
  
  @js.native
  sealed trait latinAmericaTheCaribbean extends region
  /* "-100002" */ @js.native
  object latinAmericaTheCaribbean extends TopLevel[latinAmericaTheCaribbean with String]
  
  @js.native
  sealed trait usaCanada extends region
  /* "-100001" */ @js.native
  object usaCanada extends TopLevel[usaCanada with String]
}
