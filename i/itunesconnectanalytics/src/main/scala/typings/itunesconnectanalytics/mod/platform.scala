package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait platform extends js.Object
@JSImport("itunesconnectanalytics", "platform")
@js.native
object platform extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[platform with String] = js.native
  
  @js.native
  sealed trait appleTV extends platform
  /* "AppleTV" */ @js.native
  object appleTV extends TopLevel[appleTV with String]
  
  @js.native
  sealed trait iPad extends platform
  /* "iPad" */ @js.native
  object iPad extends TopLevel[iPad with String]
  
  @js.native
  sealed trait iPhone extends platform
  /* "iPhone" */ @js.native
  object iPhone extends TopLevel[iPhone with String]
  
  @js.native
  sealed trait iPod extends platform
  /* "iPod" */ @js.native
  object iPod extends TopLevel[iPod with String]
}
