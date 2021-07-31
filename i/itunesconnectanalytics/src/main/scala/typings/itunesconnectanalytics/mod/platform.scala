package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait platform extends StObject
@JSImport("itunesconnectanalytics", "platform")
@js.native
object platform extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[platform & String] = js.native
  
  @js.native
  sealed trait appleTV
    extends StObject
       with platform
  /* "AppleTV" */ val appleTV: typings.itunesconnectanalytics.mod.platform.appleTV & String = js.native
  
  @js.native
  sealed trait iPad
    extends StObject
       with platform
  /* "iPad" */ val iPad: typings.itunesconnectanalytics.mod.platform.iPad & String = js.native
  
  @js.native
  sealed trait iPhone
    extends StObject
       with platform
  /* "iPhone" */ val iPhone: typings.itunesconnectanalytics.mod.platform.iPhone & String = js.native
  
  @js.native
  sealed trait iPod
    extends StObject
       with platform
  /* "iPod" */ val iPod: typings.itunesconnectanalytics.mod.platform.iPod & String = js.native
}
