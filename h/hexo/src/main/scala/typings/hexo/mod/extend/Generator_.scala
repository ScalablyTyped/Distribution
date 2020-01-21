package typings.hexo.mod.extend

import typings.hexo.mod.Site
import typings.hexo.mod.extend.Generator.Return
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Generator_ extends js.Object {
  def register(name: String, fn: js.Function1[/* locals */ Site, Return | js.Array[Return]]): Unit
}

object Generator_ {
  @scala.inline
  def apply(register: (String, js.Function1[/* locals */ Site, Return | js.Array[Return]]) => Unit): Generator_ = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[Generator_]
  }
}

