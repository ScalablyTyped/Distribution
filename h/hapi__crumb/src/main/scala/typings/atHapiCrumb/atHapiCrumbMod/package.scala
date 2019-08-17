package typings.atHapiCrumb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiCrumbMod {
  import typings.atHapiHapi.atHapiHapiMod.Request
  import typings.atHapiHapi.atHapiHapiMod.ResponseToolkit

  type SkipFunction = js.Function2[/* request */ js.UndefOr[Request], /* h */ js.UndefOr[ResponseToolkit], Boolean]
}
