package typings
package heremapsLib.HNs.serviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type encapsulates URL parameters to be sent to a HERE platform service.
  */
trait ServiceParameters
  extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String]

object ServiceParameters {
  @scala.inline
  def apply(StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null): ServiceParameters = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ServiceParameters]
  }
}

