package typings.jestEnvironment

import typings.jestEnvironment.jestEnvironmentStrings.get
import typings.jestEnvironment.jestEnvironmentStrings.set
import typings.jestMock.anon.Shallow
import typings.jestMock.anon.`0`
import typings.jestMock.mod.ConstructorLikeKeys
import typings.jestMock.mod.FunctionLike
import typings.jestMock.mod.MethodLikeKeys
import typings.jestMock.mod.Mock
import typings.jestMock.mod.MockInstance
import typings.jestMock.mod.MockedShallow
import typings.jestMock.mod.Mocked_
import typings.jestMock.mod.PropertyLikeKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T /* <: FunctionLike */](): Mock[T] = js.native
    def apply[T /* <: FunctionLike */](implementation: T): Mock[T] = js.native
  }
  
  @js.native
  trait FnCallFn extends StObject {
    
    def apply(fn: Any): /* is jest-mock.jest-mock.Mock<jest-mock.jest-mock.UnknownFunction> */ Boolean = js.native
    def apply[T /* <: FunctionLike */](fn: MockInstance[T]): /* is jest-mock.jest-mock.MockInstance<T> */ Boolean = js.native
    def apply[P /* <: js.Array[Any] */, R](fn: js.Function1[/* args */ P, R]): /* is jest-mock.jest-mock.Mock<(args : P): R> */ Boolean = js.native
  }
  
  @js.native
  trait FnCallObjectMethodKeyAccessType extends StObject {
    
    def apply[T /* <: js.Object */, K /* <: ConstructorLikeKeys[T] | MethodLikeKeys[T] */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[K] */ js.Any */](`object`: T, methodKey: K): /* import warning: importer.ImportType#apply Failed type conversion: V extends jest-mock.jest-mock.ClassLike | jest-mock.jest-mock.FunctionLike ? jest-mock.jest-mock.Spied<V> : never */ js.Any = js.native
    def apply[T /* <: js.Object */, K /* <: PropertyLikeKeys[T] */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[K] */ js.Any */, A /* <: get | set */](`object`: T, methodKey: K, accessType: A): /* import warning: importer.ImportType#apply Failed type conversion: A extends 'get' ? jest-mock.jest-mock.SpiedGetter<V> : A extends 'set' ? jest-mock.jest-mock.SpiedSetter<V> : never */ js.Any = js.native
  }
  
  @js.native
  trait FnCallSourceOptions extends StObject {
    
    def apply[T /* <: js.Object */](source: T): Mocked_[T] = js.native
    def apply[T /* <: js.Object */](source: T, options: Shallow): Mocked_[T] = js.native
    def apply[T /* <: js.Object */](source: T, options: `0`): MockedShallow[T] = js.native
  }
  
  trait LogErrorsBeforeRetry extends StObject {
    
    var logErrorsBeforeRetry: js.UndefOr[Boolean] = js.undefined
  }
  object LogErrorsBeforeRetry {
    
    inline def apply(): LogErrorsBeforeRetry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogErrorsBeforeRetry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogErrorsBeforeRetry] (val x: Self) extends AnyVal {
      
      inline def setLogErrorsBeforeRetry(value: Boolean): Self = StObject.set(x, "logErrorsBeforeRetry", value.asInstanceOf[js.Any])
      
      inline def setLogErrorsBeforeRetryUndefined: Self = StObject.set(x, "logErrorsBeforeRetry", js.undefined)
    }
  }
  
  trait Virtual extends StObject {
    
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object Virtual {
    
    inline def apply(): Virtual = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Virtual]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Virtual] (val x: Self) extends AnyVal {
      
      inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
}
