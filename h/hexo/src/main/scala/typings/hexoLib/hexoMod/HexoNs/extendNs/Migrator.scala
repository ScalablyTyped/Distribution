package typings
package hexoLib.hexoMod.HexoNs.extendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Migrator extends js.Object {
  def register(
    name: java.lang.String,
    fn: js.Function2[
      /* args */ minimistLib.minimistMod.minimistNs.ParsedArgs, 
      /* fn */ js.Function1[/* err */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit
}

