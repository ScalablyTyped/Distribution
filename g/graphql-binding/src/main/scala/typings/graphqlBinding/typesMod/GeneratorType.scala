package typings.graphqlBinding.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphqlBinding.graphqlBindingStrings.typescript
  - typings.graphqlBinding.graphqlBindingStrings.javascript
*/
trait GeneratorType extends js.Object

object GeneratorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def javascript: typings.graphqlBinding.graphqlBindingStrings.javascript = this.cast("javascript")
  @scala.inline
  def typescript: typings.graphqlBinding.graphqlBindingStrings.typescript = this.cast("typescript")
}

