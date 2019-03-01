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

object Generator {
  @scala.inline
  def apply(
    register: js.Function2[
      java.lang.String, 
      js.Function1[
        /* locals */ hexoLib.hexoMod.Site, 
        hexoLib.hexoMod.HexoNs.extendNs.GeneratorNs.Return | js.Array[hexoLib.hexoMod.HexoNs.extendNs.GeneratorNs.Return]
      ], 
      scala.Unit
    ]
  ): Generator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(register)
    __obj.asInstanceOf[Generator]
  }
}

