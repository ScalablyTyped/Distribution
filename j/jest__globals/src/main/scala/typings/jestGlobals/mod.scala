package typings.jestGlobals

import typings.jestExpect.mod.JestExpect_
import typings.jestGlobals.anon.FnCall
import typings.jestGlobals.anon.FnCallTestNameFnTimeout
import typings.jestMock.mod.ClassLike
import typings.jestMock.mod.FunctionLike
import typings.jestMock.mod.Mocked_
import typings.jestTypes.anon.ItBaseconcurrentItConcurr
import typings.jestTypes.mod.BlockFn
import typings.jestTypes.mod.BlockNameLike
import typings.jestTypes.mod.Describe
import typings.jestTypes.mod.DescribeBase
import typings.jestTypes.mod.HookBase
import typings.jestTypes.mod.ItBase
import typings.jestTypes.mod.ItConcurrent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/globals", "afterAll")
  @js.native
  val afterAll: HookBase & FnCall = js.native
  
  @JSImport("@jest/globals", "afterEach")
  @js.native
  val afterEach: HookBase & FnCall = js.native
  
  @JSImport("@jest/globals", "beforeAll")
  @js.native
  val beforeAll: HookBase & FnCall = js.native
  
  @JSImport("@jest/globals", "beforeEach")
  @js.native
  val beforeEach: HookBase & FnCall = js.native
  
  @JSImport("@jest/globals", "describe")
  @js.native
  val describe: Describe & (js.Function2[/* blockName */ BlockNameLike, /* blockFn */ BlockFn, Unit]) = js.native
  
  @JSImport("@jest/globals", "expect")
  @js.native
  val expect: JestExpect_ = js.native
  
  @JSImport("@jest/globals", "fdescribe")
  @js.native
  val fdescribe: DescribeBase & (js.Function2[/* blockName */ BlockNameLike, /* blockFn */ BlockFn, Unit]) = js.native
  
  @JSImport("@jest/globals", "fit")
  @js.native
  val fit: ItBaseconcurrentItConcurr & FnCallTestNameFnTimeout = js.native
  
  @JSImport("@jest/globals", "it")
  @js.native
  val it: ItConcurrent & FnCallTestNameFnTimeout = js.native
  
  @JSImport("@jest/globals", "test")
  @js.native
  val test: ItConcurrent & FnCallTestNameFnTimeout = js.native
  
  @JSImport("@jest/globals", "xdescribe")
  @js.native
  val xdescribe: DescribeBase & (js.Function2[/* blockName */ BlockNameLike, /* blockFn */ BlockFn, Unit]) = js.native
  
  @JSImport("@jest/globals", "xit")
  @js.native
  val xit: ItBase & FnCallTestNameFnTimeout = js.native
  
  @JSImport("@jest/globals", "xtest")
  @js.native
  val xtest: ItBase & FnCallTestNameFnTimeout = js.native
  
  object jest {
    
    /**
      * Constructs the type of a mock function, e.g. the return type of `jest.fn()`.
      */
    type Mock[T /* <: FunctionLike */] = typings.jestMock.mod.Mock[T]
    
    /**
      * Wraps a class, function or object type with Jest mock type definitions.
      */
    type Mocked[T /* <: js.Object */] = Mocked_[T]
    
    /**
      * Wraps a class type with Jest mock type definitions.
      */
    type MockedClass[T /* <: ClassLike */] = typings.jestMock.mod.MockedClass[T]
    
    /**
      * Wraps a function type with Jest mock type definitions.
      */
    type MockedFunction[T /* <: FunctionLike */] = typings.jestMock.mod.MockedFunction[T]
    
    /**
      * Wraps an object type with Jest mock type definitions.
      */
    type MockedObject[T /* <: js.Object */] = typings.jestMock.mod.MockedObject[T]
    
    /**
      * Constructs the type of a spied class or function.
      */
    type Spied[T /* <: ClassLike | FunctionLike */] = typings.jestMock.mod.Spied[T]
    
    /**
      * Constructs the type of a spied class.
      */
    type SpiedClass[T /* <: ClassLike */] = typings.jestMock.mod.SpiedClass[T]
    
    /**
      * Constructs the type of a spied function.
      */
    type SpiedFunction[T /* <: FunctionLike */] = typings.jestMock.mod.SpiedFunction[T]
    
    /**
      * Constructs the type of a spied getter.
      */
    type SpiedGetter[T] = typings.jestMock.mod.SpiedGetter[T]
    
    /**
      * Constructs the type of a spied setter.
      */
    type SpiedSetter[T] = typings.jestMock.mod.SpiedSetter[T]
  }
}
