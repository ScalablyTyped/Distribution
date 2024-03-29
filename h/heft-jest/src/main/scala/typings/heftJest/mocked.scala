package typings.heftJest

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mocked {
  
  type ArgumentsOf[T] = js.Any
  
  type ConstructorArgumentsOf[T] = js.Any
  
  type MaybeMocked[T] = T | MockedObject[T] | MockedFunction[T]
  
  type MaybeMockedConstructor[T] = js.Object
  
  type MaybeMockedDeep[T] = T | MockedObjectDeep[T] | MockedFunctionDeep[T]
  
  type MethodKeysOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends heft-jest.mocked.MockableFunction? K : never}[keyof T] */ js.Any
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.MockInstance<ReturnType<T>, ArgumentsOf<T>> * / any */ @js.native
  trait MockWithArgs[T /* <: MockableFunction */]
    extends StObject
       with Instantiable1[/* args */ ConstructorArgumentsOf[T], T] {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgumentsOf<T> is not an array type */ args: ArgumentsOf[T]
    ): ReturnType[T] = js.native
  }
  
  @js.native
  trait MockableFunction extends StObject {
    
    def apply(args: js.Any*): js.Any = js.native
  }
  
  type MockedFunction[T /* <: MockableFunction */] = MockWithArgs[T] & typings.heftJest.heftJestStrings.MockedFunction & TopLevel[T]
  
  type MockedFunctionDeep[T /* <: MockableFunction */] = MockWithArgs[T] & MockedObjectDeep[T]
  
  type MockedObject[T] = MaybeMockedConstructor[T] & typings.heftJest.heftJestStrings.MockedObject & TopLevel[js.Any] & TopLevel[T]
  
  type MockedObjectDeep[T] = MaybeMockedConstructor[T] & typings.heftJest.heftJestStrings.MockedObjectDeep & TopLevel[js.Any] & TopLevel[T]
  
  type PropertyKeysOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends heft-jest.mocked.MockableFunction? never : K}[keyof T] */ js.Any
}
