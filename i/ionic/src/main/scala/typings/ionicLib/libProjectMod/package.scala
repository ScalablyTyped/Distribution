package typings
package ionicLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libProjectMod {
  type ProjectDetailsErrorCode = ionicLib.ionicLibStrings.ERR_INVALID_PROJECT_FILE | ionicLib.ionicLibStrings.ERR_INVALID_PROJECT_TYPE | ionicLib.ionicLibStrings.ERR_MISSING_PROJECT_TYPE | ionicLib.ionicLibStrings.ERR_MULTI_MISSING_CONFIG | ionicLib.ionicLibStrings.ERR_MULTI_MISSING_ID
  type ProjectDetailsResult = (ProjectDetailsSingleAppResult | ProjectDetailsMultiAppResult | ProjectDetailsUnknownResult) with ionicLib.Anon_ConfigPath
}
