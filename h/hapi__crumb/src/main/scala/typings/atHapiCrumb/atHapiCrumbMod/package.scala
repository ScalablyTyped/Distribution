package typings.atHapiCrumb

import typings.atHapiHapi.atHapiHapiMod.Request
import typings.atHapiHapi.atHapiHapiMod.ResponseToolkit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiCrumbMod {
  type SkipFunction = js.Function2[/* request */ js.UndefOr[Request], /* h */ js.UndefOr[ResponseToolkit], Boolean]
}
