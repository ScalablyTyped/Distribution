package typings.jsspecJsspec

import org.scalablytyped.runtime.TopLevel
import typings.jsspecJsspec.JSSpec.SharedContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a Context that can be executed in another Context.
  *
  * The context will be executed as though it were defined in the
  * context it is called into with `itBehavesLike`.
  */
@JSGlobal("sharedContext")
@js.native
object sharedContext extends TopLevel[SharedContext]

