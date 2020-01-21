package typings.graphqlConfig

import typings.std.ErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  class ConfigNotFoundError protected () extends ErrorConstructor {
    def this(message: String) = this()
  }
  
}

