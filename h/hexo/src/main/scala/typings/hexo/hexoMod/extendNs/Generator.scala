package typings.hexo.hexoMod.extendNs

import typings.hexo.hexoMod.Site
import typings.hexo.hexoMod.extendNs.GeneratorNs.Return
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Generator extends js.Object {
  def register(name: String, fn: js.Function1[/* locals */ Site, Return | js.Array[Return]]): Unit
}

object Generator {
  @scala.inline
  def apply(register: (String, js.Function1[/* locals */ Site, Return | js.Array[Return]]) => Unit): Generator = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[Generator]
  }
}

