package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait dimension extends js.Object
@JSImport("itunesconnectanalytics", "dimension")
@js.native
object dimension extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[dimension with String] = js.native
  
  @js.native
  sealed trait appVersion extends dimension
  /* "appVersion" */ @js.native
  object appVersion extends TopLevel[appVersion with String]
  
  @js.native
  sealed trait apps extends dimension
  /* "appReferrer" */ @js.native
  object apps extends TopLevel[apps with String]
  
  @js.native
  sealed trait campaigns extends dimension
  /* "campaignId" */ @js.native
  object campaigns extends TopLevel[campaigns with String]
  
  @js.native
  sealed trait device extends dimension
  /* "platform" */ @js.native
  object device extends TopLevel[device with String]
  
  @js.native
  sealed trait platformVersion extends dimension
  /* "platformVersion" */ @js.native
  object platformVersion extends TopLevel[platformVersion with String]
  
  @js.native
  sealed trait region extends dimension
  /* "region" */ @js.native
  object region
    extends TopLevel[typings.itunesconnectanalytics.mod.dimension.region with String]
  
  @js.native
  sealed trait sourceType extends dimension
  /* "source" */ @js.native
  object sourceType extends TopLevel[sourceType with String]
  
  @js.native
  sealed trait territory extends dimension
  /* "storefront" */ @js.native
  object territory
    extends TopLevel[typings.itunesconnectanalytics.mod.dimension.territory with String]
  
  @js.native
  sealed trait websites extends dimension
  /* "domainReferrer" */ @js.native
  object websites extends TopLevel[websites with String]
}
