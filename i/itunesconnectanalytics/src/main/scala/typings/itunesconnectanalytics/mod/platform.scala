package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait platform extends js.Object

@JSImport("itunesconnectanalytics", "platform")
@js.native
object platform extends js.Object {
  @js.native
  sealed trait appleTV extends platform
  
  @js.native
  sealed trait iPad extends platform
  
  @js.native
  sealed trait iPhone extends platform
  
  @js.native
  sealed trait iPod extends platform
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[platform with String] = js.native
  /* "AppleTV" */ @js.native
  object appleTV extends TopLevel[appleTV with String]
  
  /* "iPad" */ @js.native
  object iPad extends TopLevel[iPad with String]
  
  /* "iPhone" */ @js.native
  object iPhone extends TopLevel[iPhone with String]
  
  /* "iPod" */ @js.native
  object iPod extends TopLevel[iPod with String]
  
}

