package typings
package heremapsLib.HNs.serviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * This type encapsulates a response object provider by a HERE platform service.
         */

trait ServiceResult
  extends /* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  var Response: js.UndefOr[heremapsLib.Anon_MetaInfo] = js.undefined
  var response: js.UndefOr[heremapsLib.Anon_MetaInfoRoute] = js.undefined
  var results: js.UndefOr[heremapsLib.Anon_Next] = js.undefined
  var search: js.UndefOr[heremapsLib.Anon_Context] = js.undefined
}

