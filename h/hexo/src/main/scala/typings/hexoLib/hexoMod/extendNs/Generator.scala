package typings
package hexoLib.hexoMod.extendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Generator extends js.Object {
  def register(
    name: java.lang.String,
    fn: js.Function1[
      /* locals */ hexoLib.hexoMod.Site, 
      hexoLib.hexoMod.extendNs.GeneratorNs.Return | js.Array[hexoLib.hexoMod.extendNs.GeneratorNs.Return]
    ]
  ): scala.Unit
}

object Generator {
  @scala.inline
  def apply(
    register: (java.lang.String, js.Function1[
      /* locals */ hexoLib.hexoMod.Site, 
      hexoLib.hexoMod.extendNs.GeneratorNs.Return | js.Array[hexoLib.hexoMod.extendNs.GeneratorNs.Return]
    ]) => scala.Unit
  ): Generator = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[Generator]
  }
}

