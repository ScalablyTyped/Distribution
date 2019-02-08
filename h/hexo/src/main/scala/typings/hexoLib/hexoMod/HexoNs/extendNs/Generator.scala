package typings
package hexoLib.hexoMod.HexoNs.extendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Generator extends js.Object {
  def register(
    name: java.lang.String,
    fn: js.Function1[
      /* locals */ hexoLib.hexoMod.Site, 
      hexoLib.hexoMod.HexoNs.extendNs.GeneratorNs.Return | js.Array[hexoLib.hexoMod.HexoNs.extendNs.GeneratorNs.Return]
    ]
  ): scala.Unit
}

