package typings.jestAxe

import typings.axeCore.mod.AxeResults
import typings.axeCore.mod.Result
import typings.axeCore.mod.RunOptions
import typings.axeCore.mod.Spec
import typings.jestAxe.anon.PartialAxeResults
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-axe", "axe")
  @js.native
  val axe: JestAxe = js.native
  
  @JSImport("jest-axe", "configureAxe")
  @js.native
  def configureAxe(): JestAxe = js.native
  @JSImport("jest-axe", "configureAxe")
  @js.native
  def configureAxe(options: JestAxeConfigureOptions): JestAxe = js.native
  
  object toHaveNoViolations {
    
    @JSImport("jest-axe", "toHaveNoViolations")
    @js.native
    val ^ : js.Any = js.native
    @JSImport("jest-axe", "toHaveNoViolations.toHaveNoViolations")
    @js.native
    def toHaveNoViolations: IToHaveNoViolations = js.native
    @scala.inline
    def toHaveNoViolations_=(x: IToHaveNoViolations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toHaveNoViolations")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AssertionsResult extends StObject {
    
    /**
      * Actual checked aXe verification results.
      */
    var actual: js.Array[Result] = js.native
    
    /**
      * @returns Message from the Jest assertion.
      */
    def message(): String = js.native
    
    /**
      * Whether the assertion passed.
      */
    var pass: Boolean = js.native
  }
  object AssertionsResult {
    
    @scala.inline
    def apply(actual: js.Array[Result], message: () => String, pass: Boolean): AssertionsResult = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], message = js.Any.fromFunction0(message), pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssertionsResult]
    }
    
    @scala.inline
    implicit class AssertionsResultMutableBuilder[Self <: AssertionsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActual(value: js.Array[Result]): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActualVarargs(value: Result*): Self = StObject.set(x, "actual", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: () => String): Self = StObject.set(x, "message", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
  
  type IToHaveNoViolations = js.Function1[/* results */ js.UndefOr[PartialAxeResults], AssertionsResult]
  
  type JestAxe = js.Function2[
    /* html */ Element | String, 
    /* options */ js.UndefOr[RunOptions], 
    js.Promise[AxeResults]
  ]
  
  @js.native
  trait JestAxeConfigureOptions extends RunOptions {
    
    var globalOptions: js.UndefOr[Spec] = js.native
  }
  object JestAxeConfigureOptions {
    
    @scala.inline
    def apply(): JestAxeConfigureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JestAxeConfigureOptions]
    }
    
    @scala.inline
    implicit class JestAxeConfigureOptionsMutableBuilder[Self <: JestAxeConfigureOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalOptions(value: Spec): Self = StObject.set(x, "globalOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalOptionsUndefined: Self = StObject.set(x, "globalOptions", js.undefined)
    }
  }
  
  object global {
    
    object jest {
      
      @js.native
      trait Matchers[R, T] extends StObject {
        
        def toHaveNoViolations(): R = js.native
      }
      object Matchers {
        
        @scala.inline
        def apply[R, T](toHaveNoViolations: () => R): Matchers[R, T] = {
          val __obj = js.Dynamic.literal(toHaveNoViolations = js.Any.fromFunction0(toHaveNoViolations))
          __obj.asInstanceOf[Matchers[R, T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[_, _], R, T] (val x: Self with (Matchers[R, T])) extends AnyVal {
          
          @scala.inline
          def setToHaveNoViolations(value: () => R): Self = StObject.set(x, "toHaveNoViolations", js.Any.fromFunction0(value))
        }
      }
    }
  }
}
