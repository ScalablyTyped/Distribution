package typings.lodashDecorators

import typings.lodashDecorators.anon.Post
import typings.lodashDecorators.applicatorMod.Applicator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/applicators/ComposeApplicator", JSImport.Namespace)
@js.native
object composeApplicatorMod extends js.Object {
  @js.native
  class ComposeApplicator () extends Applicator {
    def this(_config: Post) = this()
    var _config: js.Any = js.native
    val post: Boolean = js.native
  }
  
}

