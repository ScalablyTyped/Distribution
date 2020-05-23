package typings.jsspecJsspec

import typings.jsspecJsspec.JSSpec.Context
import typings.jsspecJsspec.JSSpec.Example
import typings.jsspecJsspec.JSSpec.Hook
import typings.jsspecJsspec.JSSpec.LazyEvaluated
import typings.jsspecJsspec.JSSpec.PendingContext
import typings.jsspecJsspec.JSSpec.PendingExample
import typings.jsspecJsspec.JSSpec.SharedContext
import typings.jsspecJsspec.JSSpec.SharedInvocation
import typings.jsspecJsspec.JSSpec.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  /**
    * Execute after the final Example is executed in this context.
    *
    * If no example is executed, the hook will not be executed.
    */
  var after: Hook = js.native
  /**
    * Execute once after every Example in this context.
    *
    * If no example is executed, the hook will not be executed.
    */
  var afterEach: Hook = js.native
  /**
    * Execute before the first Example is executed in this context.
    *
    * If no example is executed, the hook will not be executed.
    */
  var before: Hook = js.native
  /**
    * Execute once before every Example in this context.
    *
    * If no example is executed, the hook will not be executed.
    */
  var beforeEach: Hook = js.native
  /**
    * Create a new Context
    */
  var context: Context = js.native
  /**
    * Create a new Context
    */
  var describe: Context = js.native
  /**
    * Call the `fn` of a `sharedExamples` into this context for evaluation.
    *
    * The called in context will be executed as though its content was written
    * at the location where this method calls it in.
    */
  var includeContext: SharedInvocation = js.native
  /**
    * Define an Example to be executed.
    *
    * The example has access to variables set through lazyEvaluators as
    * global variables.
    */
  var it: Example = js.native
  /**
    * Call a `sharedContext` into this context for evaluation.
    *
    * The called in context will be executed as though it were defined at the
    * location where this method calls it in.
    */
  var itBehavesLike: SharedInvocation = js.native
  /**
    * Set an Example as pending. The `fn` will
    * not be executed.
    */
  var pend: PendingExample = js.native
  var set: LazyEvaluated = js.native
  /**
    * Create a Context that can be executed in another Context.
    *
    * The context will be executed as though it were defined in the
    * context it is called into with `itBehavesLike`.
    */
  var sharedContext: SharedContext = js.native
  /**
    * Create a Context that can be included into another Context.
    *
    * Lazy evaluators will be executed as if they were defined
    * in the context where they called in with `includeContext`.
    */
  var sharedExamples: SharedContext = js.native
  /**
    * Declare the special lazy evaluated variable `subject`
    */
  var subject: Subject = js.native
  /**
    * Set an entire `context` block as pending. The `fn` will
    * not be executed.
    */
  var xcontext: PendingContext = js.native
  /**
    * Set an entire `describe` block as pending. The `fn` will
    * not be executed.
    */
  var xdescribe: PendingContext = js.native
  /**
    * Set an Example as pending. The `fn` will
    * not be executed.
    */
  var xit: PendingExample = js.native
}

