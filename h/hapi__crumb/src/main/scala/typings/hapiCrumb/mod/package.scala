package typings.hapiCrumb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SkipFunction = js.Function2[
    /* request */ js.UndefOr[typings.hapiHapi.mod.Request], 
    /* h */ js.UndefOr[typings.hapiHapi.mod.ResponseToolkit], 
    scala.Boolean
  ]
}
