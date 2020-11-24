package typings.lodash.mod

import typings.std.Parameters
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionChain[T]
  extends LoDashExplicitWrapper[T]
     with _ExpChain[T] {
  
  /**
    * @see _.ary
    */
  def ary(): FunctionChain[js.Function1[/* repeated */ _, _]] = js.native
  def ary(n: Double): FunctionChain[js.Function1[/* repeated */ _, _]] = js.native
  
  /**
    * @see _.castArray
    */
  def castArray(): CollectionChain[T] = js.native
  
  /**
    * @see _.curry
    */
  def curry(): FunctionChain[
    (CurriedFunction1[_, _]) | (CurriedFunction2[_, _, _]) | (CurriedFunction3[_, _, _, _]) | (CurriedFunction4[_, _, _, _, _]) | (CurriedFunction5[_, _, _, _, _, _]) | (js.Function1[/* repeated */ _, _])
  ] = js.native
  def curry(arity: Double): FunctionChain[
    (CurriedFunction1[_, _]) | (CurriedFunction2[_, _, _]) | (CurriedFunction3[_, _, _, _]) | (CurriedFunction4[_, _, _, _, _]) | (CurriedFunction5[_, _, _, _, _, _]) | (js.Function1[/* repeated */ _, _])
  ] = js.native
  
  /**
    * @see _.curryRight
    */
  def curryRight(): FunctionChain[
    (js.Function1[/* repeated */ _, _]) | (RightCurriedFunction1[_, _]) | (RightCurriedFunction2[_, _, _]) | (RightCurriedFunction3[_, _, _, _]) | (RightCurriedFunction4[_, _, _, _, _]) | (RightCurriedFunction5[_, _, _, _, _, _])
  ] = js.native
  def curryRight(arity: Double): FunctionChain[
    (js.Function1[/* repeated */ _, _]) | (RightCurriedFunction1[_, _]) | (RightCurriedFunction2[_, _, _]) | (RightCurriedFunction3[_, _, _, _]) | (RightCurriedFunction4[_, _, _, _, _]) | (RightCurriedFunction5[_, _, _, _, _, _])
  ] = js.native
  
  /**
    * @see _.debounce
    */
  def debounce(): FunctionChain[DebouncedFunc[T]] = js.native
  def debounce(wait: js.UndefOr[scala.Nothing], options: DebounceSettings): FunctionChain[DebouncedFunc[T]] = js.native
  def debounce(wait: Double): FunctionChain[DebouncedFunc[T]] = js.native
  def debounce(wait: Double, options: DebounceSettings): FunctionChain[DebouncedFunc[T]] = js.native
  
  /**
    * @see _.flip
    */
  def flip(): this.type = js.native
  
  /**
    * @see _.flow
    */
  def flow(func: (Many[js.Function1[/* repeated */ _, _]])*): FunctionChain[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2](f2: js.Function1[/* a */ ReturnType[T], R2]): FunctionChain[js.Function1[/* args */ Parameters[T], R2]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2, R3](f2: js.Function1[/* a */ ReturnType[T], R2], f3: js.Function1[/* a */ R2, R3]): FunctionChain[js.Function1[/* args */ Parameters[T], R3]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2, R3, R4](
    f2: js.Function1[/* a */ ReturnType[T], R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): FunctionChain[js.Function1[/* args */ Parameters[T], R4]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2, R3, R4, R5](
    f2: js.Function1[/* a */ ReturnType[T], R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): FunctionChain[js.Function1[/* args */ Parameters[T], R5]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2, R3, R4, R5, R6](
    f2: js.Function1[/* a */ ReturnType[T], R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): FunctionChain[js.Function1[/* args */ Parameters[T], R6]] = js.native
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
  ): FunctionChain[js.Function1[/* args */ Parameters[T], R7]] = js.native
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
    func: (Many[js.Function1[/* a */ _, _]])*
  ): FunctionChain[js.Function1[/* args */ Parameters[T], _]] = js.native
  
  /**
    * @see _.flowRight
    */
  def flowRight(func: (Many[js.Function1[/* repeated */ _, _]])*): FunctionChain[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.flowRight
    */
  @JSName("flowRight")
  def flowRight_0[A /* <: js.Array[_] */](
    f1: js.Function1[
      /* args */ A, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ js.Any
    ]
  ): FunctionChain[js.Function1[/* args */ A, ReturnType[T]]] = js.native
  /**
    * @see _.flowRight
    */
  @JSName("flowRight")
  def flowRight_0[A /* <: js.Array[_] */, R1](
    f2: js.Function1[
      /* a */ R1, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ js.Any
    ],
    f1: js.Function1[/* args */ A, R1]
  ): FunctionChain[js.Function1[/* args */ A, ReturnType[T]]] = js.native
  /**
    * @see _.flowRight
    */
  @JSName("flowRight")
  def flowRight_0[A /* <: js.Array[_] */, R1, R2](
    f3: js.Function1[
      /* a */ R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ js.Any
    ],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): FunctionChain[js.Function1[/* args */ A, ReturnType[T]]] = js.native
  /**
    * @see _.flowRight
    */
  @JSName("flowRight")
  def flowRight_0[A /* <: js.Array[_] */, R1, R2, R3](
    f4: js.Function1[
      /* a */ R3, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ js.Any
    ],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): FunctionChain[js.Function1[/* args */ A, ReturnType[T]]] = js.native
  /**
    * @see _.flowRight
    */
  @JSName("flowRight")
  def flowRight_0[A /* <: js.Array[_] */, R1, R2, R3, R4](
    f5: js.Function1[
      /* a */ R4, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ js.Any
    ],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): FunctionChain[js.Function1[/* args */ A, ReturnType[T]]] = js.native
  /**
    * @see _.flowRight
    */
  @JSName("flowRight")
  def flowRight_0[A /* <: js.Array[_] */, R1, R2, R3, R4, R5](
    f6: js.Function1[
      /* a */ R5, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ js.Any
    ],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): FunctionChain[js.Function1[/* args */ A, ReturnType[T]]] = js.native
  
  /**
    * @see _.iteratee
    */
  def iteratee(): FunctionChain[T] = js.native
  
  /**
    * @see _.memoize
    */
  def memoize(): FunctionChain[T with MemoizedFunction] = js.native
  def memoize(resolver: js.Function1[/* repeated */ js.Any, _]): FunctionChain[T with MemoizedFunction] = js.native
  
  /**
    * @see _.negate
    */
  def negate(): FunctionChain[js.Function1[/* args */ Parameters[T], Boolean]] = js.native
  
  /**
    * @see _.once
    */
  def once(): FunctionChain[T] = js.native
  
  /**
    * @see _.over
    */
  def over[TResult](iteratees: (Many[js.Function1[/* repeated */ _, TResult]])*): FunctionChain[js.Function1[/* repeated */ _, js.Array[ReturnType[T] | TResult]]] = js.native
  
  /**
    * @see _.overArgs
    */
  def overArgs(transforms: (Many[js.Function1[/* repeated */ _, _]])*): FunctionChain[js.Function1[/* repeated */ _, _]] = js.native
  
  /**
    * @see _.overEvery
    */
  def overEvery[TArgs](iteratees: (Many[js.Function1[/* repeated */ TArgs, Boolean]])*): FunctionChain[js.Function1[/* args */ Parameters[T] | js.Array[TArgs], Boolean]] = js.native
  
  /**
    * @see _.overSome
    */
  def overSome[TArgs](iteratees: (Many[js.Function1[/* repeated */ TArgs, Boolean]])*): FunctionChain[js.Function1[/* args */ Parameters[T] | js.Array[TArgs], Boolean]] = js.native
  
  /**
    * @see _.partial
    */
  def partial(): FunctionChain[T] = js.native
  /**
    * @see _.partial
    */
  def partial[T1](arg1: T1): FunctionChain[js.Function1[/* ts */ _, _]] = js.native
  /**
    * @see _.partial
    */
  def partial[T2](plc1: __, arg2: T2): FunctionChain[(Function3[_, _, _, _]) | (Function2[_, _, _]) | (Function1[_, _])] = js.native
  /**
    * @see _.partial
    */
  def partial[T3](plc1: __, plc2: __, arg3: T3): FunctionChain[(Function3[_, _, _, _]) | (Function2[_, _, _])] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2](arg1: T1, arg2: T2): FunctionChain[js.Function1[/* ts */ _, _]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T3](arg1: T1, plc2: __, arg3: T3): FunctionChain[(Function2[_, _, _]) | (Function1[_, _])] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T4](arg1: T1, plc2: __, plc3: __, arg4: T4): FunctionChain[Function2[_, _, _]] = js.native
  /**
    * @see _.partial
    */
  def partial[T2, T3](plc1: __, arg2: T2, arg3: T3): FunctionChain[(Function2[_, _, _]) | (Function1[_, _])] = js.native
  /**
    * @see _.partial
    */
  def partial[T2, T4](plc1: __, arg2: T2, plc3: __, arg4: T4): FunctionChain[Function2[_, _, _]] = js.native
  /**
    * @see _.partial
    */
  def partial[T3, T4](plc1: __, plc2: __, arg3: T3, arg4: T4): FunctionChain[Function2[_, _, _]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3](arg1: T1, arg2: T2, arg3: T3): FunctionChain[js.Function1[/* ts */ _, _]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T4](arg1: T1, arg2: T2, plc3: __, arg4: T4): FunctionChain[Function1[_, _]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T3, T4](arg1: T1, plc2: __, arg3: T3, arg4: T4): FunctionChain[Function1[_, _]] = js.native
  /**
    * @see _.partial
    */
  def partial[T2, T3, T4](plc1: __, arg2: T2, arg3: T3, arg4: T4): FunctionChain[Function1[_, _]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4](arg1: T1, arg2: T2, arg3: T3, arg4: T4): FunctionChain[js.Function1[/* ts */ _, _]] = js.native
  
  /**
    * @see _.partialRight
    */
  def partialRight(): FunctionChain[T] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1](arg1: T1, plc2: __, plc3: __, plc4: __): FunctionChain[Function3[_, _, _, _]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T2](arg2: T2): FunctionChain[Function1[_, _]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T2](arg2: T2, plc3: __): FunctionChain[Function2[_, _, _]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T2](arg2: T2, plc3: __, plc4: __): FunctionChain[Function3[_, _, _, _]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2](arg1: T1, arg2: T2, plc3: __, plc4: __): FunctionChain[Function2[_, _, _]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T3](arg1: T1, plc2: __, arg3: T3, plc4: __): FunctionChain[Function2[_, _, _]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T4](arg1: T1, plc2: __, plc3: __, arg4: T4): FunctionChain[Function2[_, _, _]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T2, T3](arg2: T2, arg3: T3): FunctionChain[Function1[_, _]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T2, T3](arg2: T2, arg3: T3, plc4: __): FunctionChain[Function2[_, _, _]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T2, T4](arg2: T2, plc3: __, arg4: T4): FunctionChain[Function2[_, _, _]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3](arg1: T1, arg2: T2, arg3: T3, plc4: __): FunctionChain[Function1[_, _]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T4](arg1: T1, arg2: T2, plc3: __, arg4: T4): FunctionChain[Function1[_, _]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T3, T4](arg1: T1, plc2: __, arg3: T3, arg4: T4): FunctionChain[Function1[_, _]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T2, T3, T4](arg2: T2, arg3: T3, arg4: T4): FunctionChain[Function1[_, _]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1[T1](arg1: T1, plc2: __): FunctionChain[Function1[_, _]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1[T1](arg1: T1, plc2: __, plc3: __): FunctionChain[Function2[_, _, _]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2[T1, T2](arg1: T1, arg2: T2, plc3: __): FunctionChain[Function1[_, _]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T3[T1, T3](arg1: T1, plc2: __, arg3: T3): FunctionChain[Function1[_, _]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T3[T3](arg3: T3): FunctionChain[Function2[_, _, _]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T3[T3](arg3: T3, plc4: __): FunctionChain[Function3[_, _, _, _]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T3T4[T3, T4](arg3: T3, arg4: T4): FunctionChain[Function2[_, _, _]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T4[T4](arg4: T4): FunctionChain[Function3[_, _, _, _]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_TS_ArrayWildcard[TS /* <: js.Array[_] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param ts because its type TS is not an array type */ ts: TS
  ): FunctionChain[js.Function0[_]] = js.native
  
  /**
    * @see _.rearg
    */
  def rearg(indexes: Many[Double]*): FunctionChain[js.Function1[/* repeated */ _, _]] = js.native
  
  /**
    * @see _.rest
    */
  def rest(): FunctionChain[js.Function1[/* repeated */ _, _]] = js.native
  def rest(start: Double): FunctionChain[js.Function1[/* repeated */ _, _]] = js.native
  
  /**
    * @see _.spread
    */
  def spread(): FunctionChain[js.Function1[/* repeated */ _, ReturnType[T]]] = js.native
  def spread(start: Double): FunctionChain[js.Function1[/* repeated */ _, ReturnType[T]]] = js.native
  
  /**
    * @see _.throttle
    */
  def throttle(): FunctionChain[DebouncedFunc[T]] = js.native
  def throttle(wait: js.UndefOr[scala.Nothing], options: ThrottleSettings): FunctionChain[DebouncedFunc[T]] = js.native
  def throttle(wait: Double): FunctionChain[DebouncedFunc[T]] = js.native
  def throttle(wait: Double, options: ThrottleSettings): FunctionChain[DebouncedFunc[T]] = js.native
  
  /**
    * @see _.unary
    */
  def unary(): FunctionChain[
    js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ /* arg1 */ js.Any, 
      ReturnType[T]
    ]
  ] = js.native
}
