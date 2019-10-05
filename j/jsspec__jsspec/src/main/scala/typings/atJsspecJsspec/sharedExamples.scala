package typings.atJsspecJsspec

import org.scalablytyped.runtime.TopLevel
import typings.atJsspecJsspec.JSSpec.SharedContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a Context that can be included into another Context.
  *
  * Lazy evaluators will be executed as if they were defined
  * in the context where they called in with `includeContext`.
  */
@JSGlobal("sharedExamples")
@js.native
object sharedExamples extends TopLevel[SharedContext]

