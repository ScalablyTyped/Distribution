package typings.graphqlDashConfig

import typings.std.ErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/errors", JSImport.Namespace)
@js.native
object libErrorsMod extends js.Object {
  @js.native
  class ConfigNotFoundError protected () extends ErrorConstructor {
    def this(message: String) = this()
  }
  
}

