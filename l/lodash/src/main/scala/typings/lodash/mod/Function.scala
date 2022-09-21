package typings.lodash.mod

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Function[T]
  extends StObject
     with LoDashImplicitWrapper[T]
     with _ImpChain[T] {
  
  /**
    * @see _.ary
    */
  def ary(): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  def ary(n: Double): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  
  /**
    * @see _.castArray
    */
  def castArray(): Collection[T] = js.native
  
  /**
    * @see _.chain
    */
  def chain(): FunctionChain[T] = js.native
  
  /**
    * @see _.curry
    */
  def curry(): Function[
    (CurriedFunction1[Any, Any]) | (CurriedFunction2[Any, Any, Any]) | (CurriedFunction3[Any, Any, Any, Any]) | (CurriedFunction4[Any, Any, Any, Any, Any]) | (CurriedFunction5[Any, Any, Any, Any, Any, Any]) | (js.Function1[/* repeated */ Any, Any])
  ] = js.native
  def curry(arity: Double): Function[
    (CurriedFunction1[Any, Any]) | (CurriedFunction2[Any, Any, Any]) | (CurriedFunction3[Any, Any, Any, Any]) | (CurriedFunction4[Any, Any, Any, Any, Any]) | (CurriedFunction5[Any, Any, Any, Any, Any, Any]) | (js.Function1[/* repeated */ Any, Any])
  ] = js.native
  
  /**
    * @see _.curryRight
    */
  def curryRight(): Function[
    (js.Function1[/* repeated */ Any, Any]) | (RightCurriedFunction1[Any, Any]) | (RightCurriedFunction2[Any, Any, Any]) | (RightCurriedFunction3[Any, Any, Any, Any]) | (RightCurriedFunction4[Any, Any, Any, Any, Any]) | (RightCurriedFunction5[Any, Any, Any, Any, Any, Any])
  ] = js.native
  def curryRight(arity: Double): Function[
    (js.Function1[/* repeated */ Any, Any]) | (RightCurriedFunction1[Any, Any]) | (RightCurriedFunction2[Any, Any, Any]) | (RightCurriedFunction3[Any, Any, Any, Any]) | (RightCurriedFunction4[Any, Any, Any, Any, Any]) | (RightCurriedFunction5[Any, Any, Any, Any, Any, Any])
  ] = js.native
  
  def debounce(): Function[DebouncedFunc[T]] = js.native
  def debounce(wait: Double): Function[DebouncedFunc[T]] = js.native
  def debounce(wait: Double, options: DebounceSettings): Function[DebouncedFunc[T]] = js.native
  /**
    * @see _.debounce
    */
  def debounce(wait: Double, options: DebounceSettingsLeading): Function[DebouncedFuncLeading[T]] = js.native
  def debounce(wait: Unit, options: DebounceSettings): Function[DebouncedFunc[T]] = js.native
  def debounce(wait: Unit, options: DebounceSettingsLeading): Function[DebouncedFuncLeading[T]] = js.native
  
  /**
    * @see _.flip
    */
  def flip(): this.type = js.native
  
  /**
    * @see _.flow
    */
  def flow(func: (Many[js.Function1[/* repeated */ Any, Any]])*): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2](f2: js.Function1[/* a */ ReturnType[T], R2]): Function[js.Function1[/* args */ Parameters[T], R2]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2, R3](f2: js.Function1[/* a */ ReturnType[T], R2], f3: js.Function1[/* a */ R2, R3]): Function[js.Function1[/* args */ Parameters[T], R3]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2, R3, R4](
    f2: js.Function1[/* a */ ReturnType[T], R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): Function[js.Function1[/* args */ Parameters[T], R4]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2, R3, R4, R5](
    f2: js.Function1[/* a */ ReturnType[T], R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): Function[js.Function1[/* args */ Parameters[T], R5]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2, R3, R4, R5, R6](
    f2: js.Function1[/* a */ ReturnType[T], R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): Function[js.Function1[/* args */ Parameters[T], R6]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2, R3, R4, R5, R6, R7](
    f2: js.Function1[/* a */ ReturnType[T], R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): Function[js.Function1[/* args */ Parameters[T], R7]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2, R3, R4, R5, R6, R7](
    f2: js.Function1[/* a */ ReturnType[T], R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    func: (Many[js.Function1[/* a */ Any, Any]])*
  ): Function[js.Function1[/* args */ Parameters[T], Any]] = js.native
  
  /**
    * @see _.flowRight
    */
  def flowRight(func: (Many[js.Function1[/* repeated */ Any, Any]])*): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  /**
    * @see _.flowRight
    */
  @JSName("flowRight")
  def flowRight_0[A /* <: js.Array[Any] */](
    f1: js.Function1[
      /* args */ A, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ js.Any
    ]
  ): Function[js.Function1[/* args */ A, ReturnType[T]]] = js.native
  /**
    * @see _.flowRight
    */
  @JSName("flowRight")
  def flowRight_0[A /* <: js.Array[Any] */, R1](
    f2: js.Function1[
      /* a */ R1, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ js.Any
    ],
    f1: js.Function1[/* args */ A, R1]
  ): Function[js.Function1[/* args */ A, ReturnType[T]]] = js.native
  /**
    * @see _.flowRight
    */
  @JSName("flowRight")
  def flowRight_0[A /* <: js.Array[Any] */, R1, R2](
    f3: js.Function1[
      /* a */ R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ js.Any
    ],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): Function[js.Function1[/* args */ A, ReturnType[T]]] = js.native
  /**
    * @see _.flowRight
    */
  @JSName("flowRight")
  def flowRight_0[A /* <: js.Array[Any] */, R1, R2, R3](
    f4: js.Function1[
      /* a */ R3, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ js.Any
    ],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): Function[js.Function1[/* args */ A, ReturnType[T]]] = js.native
  /**
    * @see _.flowRight
    */
  @JSName("flowRight")
  def flowRight_0[A /* <: js.Array[Any] */, R1, R2, R3, R4](
    f5: js.Function1[
      /* a */ R4, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ js.Any
    ],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): Function[js.Function1[/* args */ A, ReturnType[T]]] = js.native
  /**
    * @see _.flowRight
    */
  @JSName("flowRight")
  def flowRight_0[A /* <: js.Array[Any] */, R1, R2, R3, R4, R5](
    f6: js.Function1[
      /* a */ R5, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ js.Any
    ],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): Function[js.Function1[/* args */ A, ReturnType[T]]] = js.native
  
  /**
    * @see _.iteratee
    */
  def iteratee(): Function[T] = js.native
  
  /**
    * @see _.memoize
    */
  def memoize(): Function[T & MemoizedFunction] = js.native
  def memoize(resolver: js.Function1[/* repeated */ Any, Any]): Function[T & MemoizedFunction] = js.native
  
  /**
    * @see _.negate
    */
  def negate(): Function[js.Function1[/* args */ Parameters[T], Boolean]] = js.native
  
  /**
    * @see _.once
    */
  def once(): Function[T] = js.native
  
  /**
    * @see _.over
    */
  def over[TResult](iteratees: (Many[js.Function1[/* repeated */ Any, TResult]])*): Function[js.Function1[/* repeated */ Any, js.Array[ReturnType[T] | TResult]]] = js.native
  
  /**
    * @see _.overArgs
    */
  def overArgs(transforms: (Many[js.Function1[/* repeated */ Any, Any]])*): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  
  /**
    * @see _.overEvery
    */
  def overEvery[TArgs](iteratees: (Many[js.Function1[/* repeated */ TArgs, Boolean]])*): Function[js.Function1[/* args */ Parameters[T] | js.Array[TArgs], Boolean]] = js.native
  
  /**
    * @see _.overSome
    */
  def overSome[TArgs](iteratees: (Many[js.Function1[/* repeated */ TArgs, Boolean]])*): Function[js.Function1[/* args */ Parameters[T] | js.Array[TArgs], Boolean]] = js.native
  
  /**
    * @see _.partial
    */
  def partial(): Function[T] = js.native
  /**
    * @see _.partial
    */
  def partial[T1](arg1: T1): Function[js.Function1[/* ts */ Any, Any]] = js.native
  /**
    * @see _.partial
    */
  def partial[T2](plc1: __, arg2: T2): Function[
    (Function3[Any, Any, Any, Any]) | (Function2[Any, Any, Any]) | (Function1[Any, Any])
  ] = js.native
  /**
    * @see _.partial
    */
  def partial[T3](plc1: __, plc2: __, arg3: T3): Function[(Function3[Any, Any, Any, Any]) | (Function2[Any, Any, Any])] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2](arg1: T1, arg2: T2): Function[js.Function1[/* ts */ Any, Any]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T3](arg1: T1, plc2: __, arg3: T3): Function[(Function2[Any, Any, Any]) | (Function1[Any, Any])] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T4](arg1: T1, plc2: __, plc3: __, arg4: T4): Function[Function2[Any, Any, Any]] = js.native
  /**
    * @see _.partial
    */
  def partial[T2, T3](plc1: __, arg2: T2, arg3: T3): Function[(Function2[Any, Any, Any]) | (Function1[Any, Any])] = js.native
  /**
    * @see _.partial
    */
  def partial[T2, T4](plc1: __, arg2: T2, plc3: __, arg4: T4): Function[Function2[Any, Any, Any]] = js.native
  /**
    * @see _.partial
    */
  def partial[T3, T4](plc1: __, plc2: __, arg3: T3, arg4: T4): Function[Function2[Any, Any, Any]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3](arg1: T1, arg2: T2, arg3: T3): Function[js.Function1[/* ts */ Any, Any]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T4](arg1: T1, arg2: T2, plc3: __, arg4: T4): Function[Function1[Any, Any]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T3, T4](arg1: T1, plc2: __, arg3: T3, arg4: T4): Function[Function1[Any, Any]] = js.native
  /**
    * @see _.partial
    */
  def partial[T2, T3, T4](plc1: __, arg2: T2, arg3: T3, arg4: T4): Function[Function1[Any, Any]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4](arg1: T1, arg2: T2, arg3: T3, arg4: T4): Function[js.Function1[/* ts */ Any, Any]] = js.native
  
  /**
    * @see _.partialRight
    */
  def partialRight(): Function[T] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1](arg1: T1, plc2: __, plc3: __, plc4: __): Function[Function3[Any, Any, Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T2](arg2: T2, plc3: __, plc4: __): Function[Function3[Any, Any, Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T3](arg3: T3, plc4: __): Function[Function3[Any, Any, Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[TS /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param ts because its type TS is not an array type */ ts: TS
  ): Function[js.Function0[Any]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2](arg1: T1, arg2: T2, plc3: __): Function[Function1[Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2](arg1: T1, arg2: T2, plc3: __, plc4: __): Function[Function2[Any, Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T3](arg1: T1, plc2: __, arg3: T3, plc4: __): Function[Function2[Any, Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T4](arg1: T1, plc2: __, plc3: __, arg4: T4): Function[Function2[Any, Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T2, T3](arg2: T2, arg3: T3): Function[Function1[Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T2, T4](arg2: T2, plc3: __, arg4: T4): Function[Function2[Any, Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3](arg1: T1, arg2: T2, arg3: T3, plc4: __): Function[Function1[Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T4](arg1: T1, arg2: T2, plc3: __, arg4: T4): Function[Function1[Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T3, T4](arg1: T1, plc2: __, arg3: T3, arg4: T4): Function[Function1[Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T2, T3, T4](arg2: T2, arg3: T3, arg4: T4): Function[Function1[Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1[T1](arg1: T1, plc2: __): Function[Function1[Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1[T1](arg1: T1, plc2: __, plc3: __): Function[Function2[Any, Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T3[T1, T3](arg1: T1, plc2: __, arg3: T3): Function[Function1[Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T2[T2](arg2: T2): Function[Function1[Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T2[T2](arg2: T2, plc3: __): Function[Function2[Any, Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T2T3[T2, T3](arg2: T2, arg3: T3, plc4: __): Function[Function2[Any, Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T3[T3](arg3: T3): Function[Function2[Any, Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T3T4[T3, T4](arg3: T3, arg4: T4): Function[Function2[Any, Any, Any]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T4[T4](arg4: T4): Function[Function3[Any, Any, Any, Any]] = js.native
  
  /**
    * @see _.rearg
    */
  def rearg(indexes: Many[Double]*): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  
  /**
    * @see _.rest
    */
  def rest(): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  def rest(start: Double): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  
  /**
    * @see _.spread
    */
  def spread(): Function[js.Function1[/* repeated */ Any, ReturnType[T]]] = js.native
  def spread(start: Double): Function[js.Function1[/* repeated */ Any, ReturnType[T]]] = js.native
  
  /**
    * @see _.throttle
    */
  def throttle(): Function[DebouncedFunc[T]] = js.native
  def throttle(wait: Double): Function[DebouncedFunc[T]] = js.native
  def throttle(wait: Double, options: ThrottleSettings): Function[DebouncedFunc[T]] = js.native
  def throttle(wait: Unit, options: ThrottleSettings): Function[DebouncedFunc[T]] = js.native
  
  /**
    * @see _.unary
    */
  def unary(): Function[
    js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ /* arg1 */ js.Any, 
      ReturnType[T]
    ]
  ] = js.native
}
