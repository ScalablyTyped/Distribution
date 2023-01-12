package typings.jestMock

import org.scalablytyped.runtime.Instantiable1
import typings.jestMock.anon.Shallow
import typings.jestMock.anon.`0`
import typings.jestMock.jestMockBooleans.`true`
import typings.jestMock.jestMockStrings.`return`
import typings.jestMock.jestMockStrings.`throw`
import typings.jestMock.jestMockStrings.get
import typings.jestMock.jestMockStrings.incomplete
import typings.jestMock.jestMockStrings.set
import typings.std.ConstructorParameters
import typings.std.Exclude
import typings.std.InstanceType
import typings.std.Map
import typings.std.Parameters
import typings.std.Record
import typings.std.ReturnType
import typings.std.ThisParameterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-mock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest-mock", "ModuleMocker")
  @js.native
  open class ModuleMocker protected () extends StObject {
    /**
      * @see README.md
      * @param global Global object of the test environment, used to create
      * mocks
      */
    def this(global: /* globalThis */ Any) = this()
    
    /* private */ var _createMockFunction: Any = js.native
    
    /* private */ var _defaultMockConfig: Any = js.native
    
    /* private */ var _defaultMockState: Any = js.native
    
    /* private */ var _ensureMockConfig: Any = js.native
    
    /* private */ var _ensureMockState: Any = js.native
    
    /* private */ val _environmentGlobal: Any = js.native
    
    /* private */ var _generateMock: Any = js.native
    
    /* private */ var _getSlots: Any = js.native
    
    /* private */ var _invocationCallCounter: Any = js.native
    
    /* private */ var _makeComponent: Any = js.native
    
    /* private */ var _mockConfigRegistry: Any = js.native
    
    /* private */ var _mockState: Any = js.native
    
    /* private */ var _spyOnProperty: Any = js.native
    
    /* private */ var _spyState: Any = js.native
    
    /* private */ var _typeOf: Any = js.native
    
    def clearAllMocks(): Unit = js.native
    
    def fn[T /* <: FunctionLike */](): Mock[T] = js.native
    def fn[T /* <: FunctionLike */](implementation: T): Mock[T] = js.native
    
    /**
      * @see README.md
      * @param metadata Metadata for the mock in the schema returned by the
      * getMetadata method of this module.
      */
    def generateFromMetadata[T](metadata: MockMetadata[T, MockMetadataType]): Mocked_[T] = js.native
    
    /**
      * @see README.md
      * @param component The component for which to retrieve metadata.
      */
    def getMetadata[T](component: T): (MockMetadata[T, MockMetadataType]) | Null = js.native
    def getMetadata[T](component: T, _refs: Map[T, Double]): (MockMetadata[T, MockMetadataType]) | Null = js.native
    
    def isMockFunction(fn: Any): /* is jest-mock.jest-mock.Mock<jest-mock.jest-mock.UnknownFunction> */ Boolean = js.native
    def isMockFunction[T /* <: FunctionLike */](fn: MockInstance[T]): /* is jest-mock.jest-mock.MockInstance<T> */ Boolean = js.native
    def isMockFunction[P /* <: js.Array[Any] */, R](fn: js.Function1[/* args */ P, R]): /* is jest-mock.jest-mock.Mock<(args : P): R> */ Boolean = js.native
    
    def mocked[T /* <: js.Object */](source: T): Mocked_[T] = js.native
    def mocked[T /* <: js.Object */](source: T, options: Shallow): Mocked_[T] = js.native
    def mocked[T /* <: js.Object */](source: T, options: `0`): MockedShallow[T] = js.native
    
    def resetAllMocks(): Unit = js.native
    
    def restoreAllMocks(): Unit = js.native
    
    def spyOn[T /* <: js.Object */, K /* <: ConstructorLikeKeys[T] | MethodLikeKeys[T] */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[K] */ js.Any */](`object`: T, methodKey: K): /* import warning: importer.ImportType#apply Failed type conversion: V extends jest-mock.jest-mock.ClassLike | jest-mock.jest-mock.FunctionLike ? jest-mock.jest-mock.Spied<V> : never */ js.Any = js.native
    def spyOn[T /* <: js.Object */, K /* <: PropertyLikeKeys[T] */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[K] */ js.Any */, A /* <: get | set */](`object`: T, methodKey: K, accessType: A): /* import warning: importer.ImportType#apply Failed type conversion: A extends 'get' ? jest-mock.jest-mock.SpiedGetter<V> : A extends 'set' ? jest-mock.jest-mock.SpiedSetter<V> : never */ js.Any = js.native
  }
  
  inline def fn[T /* <: FunctionLike */](): Mock[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fn")().asInstanceOf[Mock[T]]
  inline def fn[T /* <: FunctionLike */](implementation: T): Mock[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fn")(implementation.asInstanceOf[js.Any]).asInstanceOf[Mock[T]]
  
  inline def mocked[T /* <: js.Object */](source: T): Mocked_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mocked")(source.asInstanceOf[js.Any]).asInstanceOf[Mocked_[T]]
  inline def mocked[T_1 /* <: js.Object */](source: T_1, options: `0`): MockedShallow[T_1] = (^.asInstanceOf[js.Dynamic].applyDynamic("mocked")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MockedShallow[T_1]]
  inline def mocked[T /* <: js.Object */](source: T, options: Shallow): Mocked_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mocked")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mocked_[T]]
  
  inline def spyOn[T_1 /* <: js.Object */, K_5 /* <: /* keyof {[ K_3 in keyof T_1 as std.Required<T_1>[K_3] extends jest-mock.jest-mock.ClassLike? K_3 : never ]: T_1[K_3]} */ String */, V_1 /* <: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T_1>[K_5] */ js.Any */](`object`: T_1, methodKey: K_5): /* import warning: importer.ImportType#apply Failed type conversion: V_1 extends jest-mock.jest-mock.ClassLike | jest-mock.jest-mock.FunctionLike ? jest-mock.jest-mock.Spied<V_1> : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("spyOn")(`object`.asInstanceOf[js.Any], methodKey.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: V_1 extends jest-mock.jest-mock.ClassLike | jest-mock.jest-mock.FunctionLike ? jest-mock.jest-mock.Spied<V_1> : never */ js.Any]
  inline def spyOn[T /* <: js.Object */, K_2 /* <: Exclude[
    /* keyof T */ String, 
    /* keyof {[ K in keyof T as std.Required<T>[K] extends jest-mock.jest-mock.ClassLike? K : never ]: T[K]} */ String
  ] */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[K_2] */ js.Any */, A /* <: set | get */](`object`: T, methodKey: K_2, accessType: A): /* import warning: importer.ImportType#apply Failed type conversion: A extends 'get' ? jest-mock.jest-mock.SpiedGetter<V> : A extends 'set' ? jest-mock.jest-mock.SpiedSetter<V> : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("spyOn")(`object`.asInstanceOf[js.Any], methodKey.asInstanceOf[js.Any], accessType.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: A extends 'get' ? jest-mock.jest-mock.SpiedGetter<V> : A extends 'set' ? jest-mock.jest-mock.SpiedSetter<V> : never */ js.Any]
  
  @js.native
  trait ClassLike
    extends StObject
       with Instantiable1[/* args */ Any, Any]
  
  type ConstructorLikeKeys[T] = /* keyof {[ K in keyof T as std.Required<T>[K] extends jest-mock.jest-mock.ClassLike? K : never ]: T[K]} */ String
  
  type FunctionLike = js.Function1[/* args */ Any, Any]
  
  type MethodLikeKeys[T] = /* keyof {[ K in keyof T as std.Required<T>[K] extends jest-mock.jest-mock.FunctionLike? K : never ]: T[K]} */ String
  
  @js.native
  trait Mock[T /* <: FunctionLike */]
    extends js.Function
       with MockInstance[T]
       with Instantiable1[/* args */ Parameters[T], ReturnType[T]] {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<T> is not an array type */ args: Parameters[T]
    ): ReturnType[T] = js.native
  }
  
  type MockFunctionMetadata[T, MetadataType] = MockMetadata[T, MetadataType]
  
  type MockFunctionMetadataType = MockMetadataType
  
  /* Rewritten from type alias, can be one of: 
    - typings.jestMock.mod.MockFunctionResultIncomplete
    - typings.jestMock.mod.MockFunctionResultReturn[T]
    - typings.jestMock.mod.MockFunctionResultThrow
  */
  trait MockFunctionResult[T /* <: FunctionLike */] extends StObject
  object MockFunctionResult {
    
    inline def MockFunctionResultIncomplete(value: Unit): typings.jestMock.mod.MockFunctionResultIncomplete = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("incomplete")
      __obj.asInstanceOf[typings.jestMock.mod.MockFunctionResultIncomplete]
    }
    
    inline def MockFunctionResultReturn[T /* <: FunctionLike */](value: ReturnType[T]): typings.jestMock.mod.MockFunctionResultReturn[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("return")
      __obj.asInstanceOf[typings.jestMock.mod.MockFunctionResultReturn[T]]
    }
    
    inline def MockFunctionResultThrow(value: Any): typings.jestMock.mod.MockFunctionResultThrow = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("throw")
      __obj.asInstanceOf[typings.jestMock.mod.MockFunctionResultThrow]
    }
  }
  
  trait MockFunctionResultIncomplete
    extends StObject
       with MockFunctionResult[Any] {
    
    var `type`: incomplete
    
    /**
      * Result of a single call to a mock function that has not yet completed.
      * This occurs if you test the result from within the mock function itself,
      * or from within a function that was called by the mock.
      */
    var value: Unit
  }
  object MockFunctionResultIncomplete {
    
    inline def apply(value: Unit): MockFunctionResultIncomplete = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("incomplete")
      __obj.asInstanceOf[MockFunctionResultIncomplete]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MockFunctionResultIncomplete] (val x: Self) extends AnyVal {
      
      inline def setType(value: incomplete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait MockFunctionResultReturn[T /* <: FunctionLike */]
    extends StObject
       with MockFunctionResult[T] {
    
    var `type`: `return`
    
    /**
      * Result of a single call to a mock function that returned.
      */
    var value: ReturnType[T]
  }
  object MockFunctionResultReturn {
    
    inline def apply[T /* <: FunctionLike */](value: ReturnType[T]): MockFunctionResultReturn[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("return")
      __obj.asInstanceOf[MockFunctionResultReturn[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MockFunctionResultReturn[?], T /* <: FunctionLike */] (val x: Self & MockFunctionResultReturn[T]) extends AnyVal {
      
      inline def setType(value: `return`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: ReturnType[T]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait MockFunctionResultThrow
    extends StObject
       with MockFunctionResult[Any] {
    
    var `type`: `throw`
    
    /**
      * Result of a single call to a mock function that threw.
      */
    var value: Any
  }
  object MockFunctionResultThrow {
    
    inline def apply(value: Any): MockFunctionResultThrow = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("throw")
      __obj.asInstanceOf[MockFunctionResultThrow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MockFunctionResultThrow] (val x: Self) extends AnyVal {
      
      inline def setType(value: `throw`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait MockFunctionState[T /* <: FunctionLike */] extends StObject {
    
    /**
      * List of the call arguments of all calls that have been made to the mock.
      */
    var calls: js.Array[Parameters[T]]
    
    /**
      * List of all the function contexts that have been applied to calls to the mock.
      */
    var contexts: js.Array[ThisParameterType[T]]
    
    /**
      * List of all the object instances that have been instantiated from the mock.
      */
    var instances: js.Array[ReturnType[T]]
    
    /**
      * List of the call order indexes of the mock. Jest is indexing the order of
      * invocations of all mocks in a test file. The index is starting with `1`.
      */
    var invocationCallOrder: js.Array[Double]
    
    /**
      * List of the call arguments of the last call that was made to the mock.
      * If the function was not called, it will return `undefined`.
      */
    var lastCall: js.UndefOr[Parameters[T]] = js.undefined
    
    /**
      * List of the results of all calls that have been made to the mock.
      */
    var results: js.Array[MockFunctionResult[T]]
  }
  object MockFunctionState {
    
    inline def apply[T /* <: FunctionLike */](
      calls: js.Array[Parameters[T]],
      contexts: js.Array[ThisParameterType[T]],
      instances: js.Array[ReturnType[T]],
      invocationCallOrder: js.Array[Double],
      results: js.Array[MockFunctionResult[T]]
    ): MockFunctionState[T] = {
      val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], contexts = contexts.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], invocationCallOrder = invocationCallOrder.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockFunctionState[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MockFunctionState[?], T /* <: FunctionLike */] (val x: Self & MockFunctionState[T]) extends AnyVal {
      
      inline def setCalls(value: js.Array[Parameters[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
      
      inline def setCallsVarargs(value: Parameters[T]*): Self = StObject.set(x, "calls", js.Array(value*))
      
      inline def setContexts(value: js.Array[ThisParameterType[T]]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      inline def setContextsVarargs(value: ThisParameterType[T]*): Self = StObject.set(x, "contexts", js.Array(value*))
      
      inline def setInstances(value: js.Array[ReturnType[T]]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      inline def setInstancesVarargs(value: ReturnType[T]*): Self = StObject.set(x, "instances", js.Array(value*))
      
      inline def setInvocationCallOrder(value: js.Array[Double]): Self = StObject.set(x, "invocationCallOrder", value.asInstanceOf[js.Any])
      
      inline def setInvocationCallOrderVarargs(value: Double*): Self = StObject.set(x, "invocationCallOrder", js.Array(value*))
      
      inline def setLastCall(value: Parameters[T]): Self = StObject.set(x, "lastCall", value.asInstanceOf[js.Any])
      
      inline def setLastCallUndefined: Self = StObject.set(x, "lastCall", js.undefined)
      
      inline def setResults(value: js.Array[MockFunctionResult[T]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: MockFunctionResult[T]*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
  
  @js.native
  trait MockInstance[T /* <: FunctionLike */] extends StObject {
    
    var _isMockFunction: `true` = js.native
    
    var _protoImpl: js.Function = js.native
    
    def getMockImplementation(): js.UndefOr[T] = js.native
    
    def getMockName(): String = js.native
    
    var mock: MockFunctionState[T] = js.native
    
    def mockClear(): this.type = js.native
    
    def mockImplementation(fn: T): this.type = js.native
    
    def mockImplementationOnce(fn: T): this.type = js.native
    
    def mockName(name: String): this.type = js.native
    
    def mockRejectedValue(value: RejectType[T]): this.type = js.native
    
    def mockRejectedValueOnce(value: RejectType[T]): this.type = js.native
    
    def mockReset(): this.type = js.native
    
    def mockResolvedValue(value: ResolveType[T]): this.type = js.native
    
    def mockResolvedValueOnce(value: ResolveType[T]): this.type = js.native
    
    def mockRestore(): Unit = js.native
    
    def mockReturnThis(): this.type = js.native
    
    def mockReturnValue(value: ReturnType[T]): this.type = js.native
    
    def mockReturnValueOnce(value: ReturnType[T]): this.type = js.native
    
    def withImplementation(fn: T, callback: js.Function0[Unit]): Unit = js.native
    @JSName("withImplementation")
    def withImplementation_Promise(fn: T, callback: js.Function0[js.Promise[Any]]): js.Promise[Unit] = js.native
  }
  
  trait MockMetadata[T, MetadataType] extends StObject {
    
    var length: js.UndefOr[Double] = js.undefined
    
    var members: js.UndefOr[Record[String, MockMetadata[T, MockMetadataType]]] = js.undefined
    
    var mockImpl: js.UndefOr[T] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var ref: js.UndefOr[Double] = js.undefined
    
    var refID: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[MetadataType] = js.undefined
    
    var value: js.UndefOr[T] = js.undefined
  }
  object MockMetadata {
    
    inline def apply[T, MetadataType](): MockMetadata[T, MetadataType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockMetadata[T, MetadataType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MockMetadata[?, ?], T, MetadataType] (val x: Self & (MockMetadata[T, MetadataType])) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMembers(value: Record[String, MockMetadata[T, MockMetadataType]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      inline def setMockImpl(value: T): Self = StObject.set(x, "mockImpl", value.asInstanceOf[js.Any])
      
      inline def setMockImplUndefined: Self = StObject.set(x, "mockImpl", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRef(value: Double): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefID(value: Double): Self = StObject.set(x, "refID", value.asInstanceOf[js.Any])
      
      inline def setRefIDUndefined: Self = StObject.set(x, "refID", js.undefined)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setType(value: MetadataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jestMock.jestMockStrings.`object`
    - typings.jestMock.jestMockStrings.array
    - typings.jestMock.jestMockStrings.regexp
    - typings.jestMock.jestMockStrings.function
    - typings.jestMock.jestMockStrings.constant
    - typings.jestMock.jestMockStrings.collection
    - typings.jestMock.jestMockStrings.`null`
    - typings.jestMock.jestMockStrings.undefined
  */
  trait MockMetadataType extends StObject
  object MockMetadataType {
    
    inline def array: typings.jestMock.jestMockStrings.array = "array".asInstanceOf[typings.jestMock.jestMockStrings.array]
    
    inline def collection: typings.jestMock.jestMockStrings.collection = "collection".asInstanceOf[typings.jestMock.jestMockStrings.collection]
    
    inline def constant: typings.jestMock.jestMockStrings.constant = "constant".asInstanceOf[typings.jestMock.jestMockStrings.constant]
    
    inline def function: typings.jestMock.jestMockStrings.function = "function".asInstanceOf[typings.jestMock.jestMockStrings.function]
    
    inline def `null`: typings.jestMock.jestMockStrings.`null` = "null".asInstanceOf[typings.jestMock.jestMockStrings.`null`]
    
    inline def `object`: typings.jestMock.jestMockStrings.`object` = "object".asInstanceOf[typings.jestMock.jestMockStrings.`object`]
    
    inline def regexp: typings.jestMock.jestMockStrings.regexp = "regexp".asInstanceOf[typings.jestMock.jestMockStrings.regexp]
    
    inline def undefined: typings.jestMock.jestMockStrings.undefined = "undefined".asInstanceOf[typings.jestMock.jestMockStrings.undefined]
  }
  
  type MockedClass[T /* <: ClassLike */] = (MockInstance[js.Function1[/* args */ ConstructorParameters[T], Mocked_[InstanceType[T]]]]) & MockedObject[T]
  
  type MockedFunction[T /* <: FunctionLike */] = MockInstance[T] & MockedObject[T]
  
  type MockedFunctionShallow[T /* <: FunctionLike */] = MockInstance[T] & T
  
  type MockedObject[T /* <: js.Object */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends jest-mock.jest-mock.ClassLike? jest-mock.jest-mock.MockedClass<T[K]> : T[K] extends jest-mock.jest-mock.FunctionLike? jest-mock.jest-mock.MockedFunction<T[K]> : T[K] extends object? jest-mock.jest-mock.MockedObject<T[K]> : T[K]} */ js.Any) & T
  
  type MockedObjectShallow[T /* <: js.Object */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends jest-mock.jest-mock.ClassLike? jest-mock.jest-mock.MockedClass<T[K]> : T[K] extends jest-mock.jest-mock.FunctionLike? jest-mock.jest-mock.MockedFunctionShallow<T[K]> : T[K]} */ js.Any) & T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends jest-mock.jest-mock.ClassLike ? jest-mock.jest-mock.MockedClass<T> : T extends jest-mock.jest-mock.FunctionLike ? jest-mock.jest-mock.MockedFunctionShallow<T> : T extends object ? jest-mock.jest-mock.MockedObjectShallow<T> : T
    }}}
    */
  type MockedShallow[T] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends jest-mock.jest-mock.ClassLike ? jest-mock.jest-mock.MockedClass<T> : T extends jest-mock.jest-mock.FunctionLike ? jest-mock.jest-mock.MockedFunction<T> : T extends object ? jest-mock.jest-mock.MockedObject<T> : T
    }}}
    */
  type Mocked_[T] = T
  
  type PropertyLikeKeys[T] = Exclude[/* keyof T */ String, ConstructorLikeKeys[T] | MethodLikeKeys[T]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    std.ReturnType<T> extends std.PromiseLike<any> ? unknown : never
    }}}
    */
  @js.native
  trait RejectType[T /* <: FunctionLike */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    std.ReturnType<T> extends std.PromiseLike<infer U> ? U : never
    }}}
    */
  @js.native
  trait ResolveType[T /* <: FunctionLike */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends jest-mock.jest-mock.ClassLike ? jest-mock.jest-mock.SpiedClass<T> : T extends jest-mock.jest-mock.FunctionLike ? jest-mock.jest-mock.SpiedFunction<T> : never
    }}}
    */
  type Spied[T /* <: ClassLike | FunctionLike */] = SpiedClass[T]
  
  type SpiedClass[T /* <: ClassLike */] = MockInstance[js.Function1[/* args */ ConstructorParameters[T], InstanceType[T]]]
  
  type SpiedFunction[T /* <: FunctionLike */] = MockInstance[js.Function1[/* args */ Parameters[T], ReturnType[T]]]
  
  type SpiedGetter[T] = MockInstance[js.Function0[T]]
  
  type SpiedSetter[T] = MockInstance[js.Function1[/* arg */ T, Unit]]
  
  type SpyInstance[T /* <: FunctionLike */] = MockInstance[T]
  
  @js.native
  trait UnknownClass
    extends StObject
       with Instantiable1[/* args */ Any, Any]
  
  @js.native
  trait UnknownFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
}
