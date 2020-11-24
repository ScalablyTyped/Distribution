package typings.hapiBoom.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/boom", "boomify")
@js.native
object boomify extends js.Object {
  
  def apply[Data, Decoration](err: Error): Boom[Data] with Decoration = js.native
  def apply[Data, Decoration](err: Error, options: Options[Data] with Decorate[Decoration]): Boom[Data] with Decoration = js.native
}
