package typings.hapiAddress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uri {
  type Options = typings.hapiHoek.mod.ts.XOR[
    typings.hapiAddress.mod.uri.Options.Options, 
    typings.hapiAddress.mod.uri.Options.Relative
  ]
}
