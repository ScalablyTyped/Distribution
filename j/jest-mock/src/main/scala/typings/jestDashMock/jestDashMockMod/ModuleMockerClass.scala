package typings.jestDashMock.jestDashMockMod

import org.scalablytyped.runtime.Instantiable1
import typings.jestDashMock.jestDashMockStrings.get
import typings.jestDashMock.jestDashMockStrings.set
import typings.std.Map
import typings.std.Parameters
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleMockerClass extends js.Object {
  var ModuleMocker: Instantiable1[/* global */ Global, ModuleMockerClass] = js.native
  var _createMockFunction: js.Any = js.native
  var _defaultMockConfig: js.Any = js.native
  var _defaultMockState: js.Any = js.native
  var _ensureMockConfig: js.Any = js.native
  var _ensureMockState: js.Any = js.native
  var _environmentGlobal: js.Any = js.native
  var _generateMock: js.Any = js.native
  var _getSlots: js.Any = js.native
  var _invocationCallCounter: js.Any = js.native
  var _makeComponent: js.Any = js.native
  var _mockConfigRegistry: js.Any = js.native
  var _mockState: js.Any = js.native
  var _spyOnProperty: js.Any = js.native
  var _spyState: js.Any = js.native
  var _typeOf: js.Any = js.native
  def clearAllMocks(): Unit = js.native
  def fn[T, Y /* <: js.Array[_] */](): Mock[T, Y] = js.native
  def fn[T, Y /* <: js.Array[_] */](implementation: js.Function1[/* args */ Y, T]): Mock[T, Y] = js.native
  /**
    * @see README.md
    * @param _metadata Metadata for the mock in the schema returned by the
    * getMetadata method of this module.
    */
  def generateFromMetadata[T, Y /* <: js.Array[_] */](_metadata: MockFunctionMetadata[T, Y, MockFunctionMetadataType]): Mock[T, Y] = js.native
  /**
    * @see README.md
    * @param component The component for which to retrieve metadata.
    */
  def getMetadata[T, Y /* <: js.Array[_] */](component: T): (MockFunctionMetadata[T, Y, MockFunctionMetadataType]) | Null = js.native
  def getMetadata[T, Y /* <: js.Array[_] */](component: T, _refs: Map[T, Double]): (MockFunctionMetadata[T, Y, MockFunctionMetadataType]) | Null = js.native
  def isMockFunction[T](fn: js.Any): /* is jest-mock.jest-mock.Mock<T, std.Array<unknown>> */ Boolean = js.native
  def resetAllMocks(): Unit = js.native
  def restoreAllMocks(): Unit = js.native
  def spyOn[T /* <: js.Object */, M /* <: FunctionPropertyNames[T] */](`object`: T, methodName: M): SpyInstance[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: T[M] */ js.Any
    ], 
    Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: T[M] */ js.Any
    ]
  ] = js.native
  @JSName("spyOn")
  def spyOn_get[T /* <: js.Object */, M /* <: NonFunctionPropertyNames[T] */](`object`: T, methodName: M, accessType: get): SpyInstance[
    /* import warning: importer.ImportType#apply Failed type conversion: T[M] */ js.Any, 
    js.Array[js.Any]
  ] = js.native
  @JSName("spyOn")
  def spyOn_set[T /* <: js.Object */, M /* <: NonFunctionPropertyNames[T] */](`object`: T, methodName: M, accessType: set): SpyInstance[
    Unit, 
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[M] */ js.Any
    ]
  ] = js.native
}

