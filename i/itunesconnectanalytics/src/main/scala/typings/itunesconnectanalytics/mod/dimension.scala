package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait dimension extends js.Object

@JSImport("itunesconnectanalytics", "dimension")
@js.native
object dimension extends js.Object {
  @js.native
  sealed trait appVersion extends dimension
  
  @js.native
  sealed trait apps extends dimension
  
  @js.native
  sealed trait campaigns extends dimension
  
  @js.native
  sealed trait device extends dimension
  
  @js.native
  sealed trait platformVersion extends dimension
  
  @js.native
  sealed trait region extends dimension
  
  @js.native
  sealed trait sourceType extends dimension
  
  @js.native
  sealed trait territory extends dimension
  
  @js.native
  sealed trait websites extends dimension
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[dimension with String] = js.native
  /* "appVersion" */ @js.native
  object appVersion extends TopLevel[appVersion with String]
  
  /* "appReferrer" */ @js.native
  object apps extends TopLevel[apps with String]
  
  /* "campaignId" */ @js.native
  object campaigns extends TopLevel[campaigns with String]
  
  /* "platform" */ @js.native
  object device extends TopLevel[device with String]
  
  /* "platformVersion" */ @js.native
  object platformVersion extends TopLevel[platformVersion with String]
  
  /* "region" */ @js.native
  object region
    extends TopLevel[typings.itunesconnectanalytics.mod.dimension.region with String]
  
  /* "source" */ @js.native
  object sourceType extends TopLevel[sourceType with String]
  
  /* "storefront" */ @js.native
  object territory
    extends TopLevel[typings.itunesconnectanalytics.mod.dimension.territory with String]
  
  /* "domainReferrer" */ @js.native
  object websites extends TopLevel[websites with String]
  
}

