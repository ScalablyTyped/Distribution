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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Execute after the final Example is executed in this context.
    *
    * If no example is executed, the hook will not be executed.
    */
  @JSGlobal("after")
  @js.native
  def after: Hook = js.native
  
  /**
    * Execute once after every Example in this context.
    *
    * If no example is executed, the hook will not be executed.
    */
  @JSGlobal("afterEach")
  @js.native
  def afterEach: Hook = js.native
  @scala.inline
  def afterEach_=(x: Hook): Unit = js.Dynamic.global.updateDynamic("afterEach")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def after_=(x: Hook): Unit = js.Dynamic.global.updateDynamic("after")(x.asInstanceOf[js.Any])
  
  /**
    * Execute before the first Example is executed in this context.
    *
    * If no example is executed, the hook will not be executed.
    */
  @JSGlobal("before")
  @js.native
  def before: Hook = js.native
  
  /**
    * Execute once before every Example in this context.
    *
    * If no example is executed, the hook will not be executed.
    */
  @JSGlobal("beforeEach")
  @js.native
  def beforeEach: Hook = js.native
  @scala.inline
  def beforeEach_=(x: Hook): Unit = js.Dynamic.global.updateDynamic("beforeEach")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def before_=(x: Hook): Unit = js.Dynamic.global.updateDynamic("before")(x.asInstanceOf[js.Any])
  
  /**
    * Create a new Context
    */
  @JSGlobal("context")
  @js.native
  def context: Context = js.native
  @scala.inline
  def context_=(x: Context): Unit = js.Dynamic.global.updateDynamic("context")(x.asInstanceOf[js.Any])
  
  /**
    * Create a new Context
    */
  @JSGlobal("describe")
  @js.native
  def describe: Context = js.native
  @scala.inline
  def describe_=(x: Context): Unit = js.Dynamic.global.updateDynamic("describe")(x.asInstanceOf[js.Any])
  
  /**
    * Call the `fn` of a `sharedExamples` into this context for evaluation.
    *
    * The called in context will be executed as though its content was written
    * at the location where this method calls it in.
    */
  @JSGlobal("includeContext")
  @js.native
  def includeContext: SharedInvocation = js.native
  @scala.inline
  def includeContext_=(x: SharedInvocation): Unit = js.Dynamic.global.updateDynamic("includeContext")(x.asInstanceOf[js.Any])
  
  /**
    * Define an Example to be executed.
    *
    * The example has access to variables set through lazyEvaluators as
    * global variables.
    */
  @JSGlobal("it")
  @js.native
  def it: Example = js.native
  
  /**
    * Call a `sharedContext` into this context for evaluation.
    *
    * The called in context will be executed as though it were defined at the
    * location where this method calls it in.
    */
  @JSGlobal("itBehavesLike")
  @js.native
  def itBehavesLike: SharedInvocation = js.native
  @scala.inline
  def itBehavesLike_=(x: SharedInvocation): Unit = js.Dynamic.global.updateDynamic("itBehavesLike")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def it_=(x: Example): Unit = js.Dynamic.global.updateDynamic("it")(x.asInstanceOf[js.Any])
  
  /**
    * Set an Example as pending. The `fn` will
    * not be executed.
    */
  @JSGlobal("pend")
  @js.native
  def pend: PendingExample = js.native
  @scala.inline
  def pend_=(x: PendingExample): Unit = js.Dynamic.global.updateDynamic("pend")(x.asInstanceOf[js.Any])
  
  @JSGlobal("set")
  @js.native
  def set: LazyEvaluated = js.native
  @scala.inline
  def set_=(x: LazyEvaluated): Unit = js.Dynamic.global.updateDynamic("set")(x.asInstanceOf[js.Any])
  
  /**
    * Create a Context that can be executed in another Context.
    *
    * The context will be executed as though it were defined in the
    * context it is called into with `itBehavesLike`.
    */
  @JSGlobal("sharedContext")
  @js.native
  def sharedContext: SharedContext = js.native
  @scala.inline
  def sharedContext_=(x: SharedContext): Unit = js.Dynamic.global.updateDynamic("sharedContext")(x.asInstanceOf[js.Any])
  
  /**
    * Create a Context that can be included into another Context.
    *
    * Lazy evaluators will be executed as if they were defined
    * in the context where they called in with `includeContext`.
    */
  @JSGlobal("sharedExamples")
  @js.native
  def sharedExamples: SharedContext = js.native
  @scala.inline
  def sharedExamples_=(x: SharedContext): Unit = js.Dynamic.global.updateDynamic("sharedExamples")(x.asInstanceOf[js.Any])
  
  /**
    * Declare the special lazy evaluated variable `subject`
    */
  @JSGlobal("subject")
  @js.native
  def subject: Subject = js.native
  @scala.inline
  def subject_=(x: Subject): Unit = js.Dynamic.global.updateDynamic("subject")(x.asInstanceOf[js.Any])
  
  /**
    * Set an entire `context` block as pending. The `fn` will
    * not be executed.
    */
  @JSGlobal("xcontext")
  @js.native
  def xcontext: PendingContext = js.native
  @scala.inline
  def xcontext_=(x: PendingContext): Unit = js.Dynamic.global.updateDynamic("xcontext")(x.asInstanceOf[js.Any])
  
  /**
    * Set an entire `describe` block as pending. The `fn` will
    * not be executed.
    */
  @JSGlobal("xdescribe")
  @js.native
  def xdescribe: PendingContext = js.native
  @scala.inline
  def xdescribe_=(x: PendingContext): Unit = js.Dynamic.global.updateDynamic("xdescribe")(x.asInstanceOf[js.Any])
  
  /**
    * Set an Example as pending. The `fn` will
    * not be executed.
    */
  @JSGlobal("xit")
  @js.native
  def xit: PendingExample = js.native
  @scala.inline
  def xit_=(x: PendingExample): Unit = js.Dynamic.global.updateDynamic("xit")(x.asInstanceOf[js.Any])
}
