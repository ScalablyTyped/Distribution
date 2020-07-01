package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait region extends js.Object

@JSImport("itunesconnectanalytics", "region")
@js.native
object region extends js.Object {
  @js.native
  sealed trait africaMiddleEastIndia extends region
  
  @js.native
  sealed trait asiaPacific extends region
  
  @js.native
  sealed trait europe extends region
  
  @js.native
  sealed trait latinAmericaTheCaribbean extends region
  
  @js.native
  sealed trait usaCanada extends region
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[region with String] = js.native
  /* "-100005" */ @js.native
  object africaMiddleEastIndia extends TopLevel[africaMiddleEastIndia with String]
  
  /* "-100004" */ @js.native
  object asiaPacific extends TopLevel[asiaPacific with String]
  
  /* "-100003" */ @js.native
  object europe extends TopLevel[europe with String]
  
  /* "-100002" */ @js.native
  object latinAmericaTheCaribbean extends TopLevel[latinAmericaTheCaribbean with String]
  
  /* "-100001" */ @js.native
  object usaCanada extends TopLevel[usaCanada with String]
  
}

