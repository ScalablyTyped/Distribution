package typings.jsspecJsspec

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JSSpec {
  
  /**
    * Sync Function - with optional arguments
    */
  @js.native
  trait ArgFunc extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  /**
    * Async Function
    */
  type AsyncFunc = js.Function0[PromiseLike[Any]]
  
  @js.native
  trait Context extends StObject {
    
    /**
      * Create a new context with the `title` and defined in `fn`.
      */
    def apply(title: String, fn: Func): Unit = js.native
    /**
      * Create a new context with the `title` and defined in `fn`.
      * Use `options` to specify settings for running Examples in this context.
      */
    def apply(title: String, options: ContextOptions, fn: Func): Unit = js.native
  }
  
  trait ContextOptions extends StObject {
    
    /**
      * Run the contained Examples/Contexts in random order?
      * - Run in random order if `true`
      * - Run in definition order if `false`
      */
    var random: js.UndefOr[Boolean] = js.undefined
    
    /**
      * fail the test after _timeout_ milliseconds
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ContextOptions {
    
    inline def apply(): ContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextOptions] (val x: Self) extends AnyVal {
      
      inline def setRandom(value: Boolean): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      inline def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait Example extends StObject {
    
    /**
      * Provide a test case with the given `title`, executing `fn`.
      *
      * An `async` function will be awaited.
      */
    def apply(title: String, fn: AsyncFunc | Func): Unit = js.native
    /**
      * Provide a test case with the given `title`, executing `fn`.
      *
      * Use `options` to specify settings for running this example
      *
      * An `async` function will be awaited.
      */
    def apply(title: String, option: ExampleOptions): Unit = js.native
    def apply(title: String, option: ExampleOptions, fn: AsyncFunc | Func): Unit = js.native
  }
  
  trait ExampleOptions extends StObject {
    
    /**
      * fail the test after _timeout_ milliseconds
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ExampleOptions {
    
    inline def apply(): ExampleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExampleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExampleOptions] (val x: Self) extends AnyVal {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /**
    * Sync Function
    */
  type Func = js.Function0[Unit]
  
  @js.native
  trait Hook extends StObject {
    
    /**
      * Provide a hook, executing `fn`.
      *
      * An `async` function will be awaited.
      */
    def apply(fn: AsyncFunc | Func): Unit = js.native
    /**
      * Provide a named hook, executing `fn`.
      *
      * An `async` function will be awaited.
      */
    def apply(name: String, fn: AsyncFunc | Func): Unit = js.native
    /**
      * Provide a named hook, executing `fn`.
      *
      * An `async` function will be awaited.
      *
      * Use `options` to specify settings for running this hook
      */
    def apply(name: String, options: ExampleOptions, fn: AsyncFunc | Func): Unit = js.native
  }
  
  type LazyEvaluated = js.Function2[/* varName */ String, /* fnOrValue */ Any, Unit]
  
  @js.native
  trait PendingContext extends StObject {
    
    /**
      * Create a new context with the `title` and defined in `fn`.
      *
      * `fn` will not be run, but the context will be reported as pending.
      */
    def apply(title: String): Unit = js.native
    def apply(title: String, fn: Func): Unit = js.native
    /**
      * Create a new context with the `title` and defined in `fn`.
      *
      * `fn` will not be run, but the context will be reported as pending.
      * As the `fn` is not run, `options` has no effect.
      */
    def apply(title: String, options: ContextOptions, fn: Func): Unit = js.native
  }
  
  @js.native
  trait PendingExample extends StObject {
    
    /**
      * Provide a pending test case with the given `title`. `fn` will not be executed.
      */
    def apply(title: String, fn: AsyncFunc | Func): Unit = js.native
    /**
      * Provide a pending test case with the given `title`. `fn` will note be executed.
      *
      * `options` will be ignored.
      */
    def apply(title: String, option: ExampleOptions): Unit = js.native
    def apply(title: String, option: ExampleOptions, fn: AsyncFunc | Func): Unit = js.native
  }
  
  @js.native
  trait SharedContext extends StObject {
    
    /**
      * Create a new context with the `title` and defined in `fn`.
      */
    def apply(title: String, fn: ArgFunc): Unit = js.native
    /**
      * Create a new context with the `title` and defined in `fn`.
      * Use `options` to specify settings for running Examples in this context.
      */
    def apply(title: String, options: ContextOptions, fn: ArgFunc): Unit = js.native
  }
  
  type SharedInvocation = js.Function2[/* contextName */ String, /* repeated */ Any, Unit]
  
  @js.native
  trait Subject extends StObject {
    
    /**
      * Set `subject` which can be accessed inside of an Example.
      *
      * If `fnOrValue` is a function, it will be executed to evaluate the initial state of
      * `subject` when it is first accessed in an example (or supporting hook).
      */
    def apply(fnOrValue: Any): Unit = js.native
    /**
      * Set a variable which can be accessed inside of an Example.
      * `subject` will refer to the same variable.
      *
      * If `fnOrValue` is a function, it will be executed to evaluate the initial state of
      * `varName` or `subject` when it is first accessed in an example (or supporting hook).
      */
    def apply(varName: String, fnOrValue: Any): Unit = js.native
  }
}
