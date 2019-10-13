package typings.lodashDashDecorators

import typings.lodashDashDecorators.applicatorsMod.Applicator
import typings.lodashDashDecorators.factoryCommonMod.BiTypedDecorator
import typings.lodashDashDecorators.factoryCommonMod.BiTypedDecorator1
import typings.lodashDashDecorators.factoryCommonMod.BiTypedDecorator2
import typings.lodashDashDecorators.factoryCommonMod.BiTypedDecoratorN
import typings.lodashDashDecorators.factoryCommonMod.BiTypedMethodDecorator
import typings.lodashDashDecorators.factoryCommonMod.BiTypedMethodDecorator1
import typings.lodashDashDecorators.factoryCommonMod.InstanceChainData
import typings.lodashDashDecorators.factoryCommonMod.LodashDecorator
import typings.lodashDashDecorators.factoryCommonMod.LodashMethodDecorator
import typings.lodashDashDecorators.factoryCommonMod.ResolvableFunction
import typings.lodashDashDecorators.factoryDecoratorConfigMod.DecoratorConfigOptions
import typings.lodashDashDecorators.sharedMod.DebounceOptions
import typings.lodashDashDecorators.sharedMod.MemoizeConfig
import typings.lodashDashDecorators.sharedMod.ThrottleOptions
import typings.lodashDashDecorators.utilsMod.CompositeKeyWeakMap
import typings.std.ClassDecorator
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators", JSImport.Namespace)
@js.native
object lodashDashDecoratorsMod extends js.Object {
  @js.native
  class DecoratorConfig protected ()
    extends typings.lodashDashDecorators.factoryMod.DecoratorConfig {
    def this(execute: js.Function, applicator: Applicator) = this()
    def this(execute: js.Function, applicator: Applicator, options: DecoratorConfigOptions) = this()
  }
  
  @js.native
  class InternalDecoratorFactory ()
    extends typings.lodashDashDecorators.factoryDecoratorFactoryMod.InternalDecoratorFactory
  
  val Attempt: BiTypedMethodDecorator = js.native
  val Bind: BiTypedMethodDecorator1[js.Any] = js.native
  val Curry: BiTypedMethodDecorator1[Double] = js.native
  val CurryAll: BiTypedDecorator1[Double] = js.native
  val CurryRight: BiTypedMethodDecorator1[Double] = js.native
  val CurryRightAll: BiTypedMethodDecorator1[Double] = js.native
  val DecoratorFactory: typings.lodashDashDecorators.factoryDecoratorFactoryMod.InternalDecoratorFactory = js.native
  val Defer: BiTypedDecoratorN = js.native
  val InstanceChainMap: CompositeKeyWeakMap[InstanceChainData] = js.native
  val Memoize: BiTypedMethodDecorator1[String | js.Function | (MemoizeConfig[js.Any, js.Any])] = js.native
  val MemoizeAll: BiTypedMethodDecorator1[js.Function | (MemoizeConfig[js.Any, js.Any])] = js.native
  val Negate: BiTypedDecorator1[ResolvableFunction] = js.native
  val Once: BiTypedDecorator = js.native
  val Rest: BiTypedMethodDecorator1[Double] = js.native
  val Spread: BiTypedMethodDecorator1[Double] = js.native
  val Tap: BiTypedMethodDecorator = js.native
  val Throttle: BiTypedDecorator2[Double, ThrottleOptions] = js.native
  val ThrottleGetter: BiTypedDecorator2[Double, ThrottleOptions] = js.native
  val ThrottleSetter: BiTypedDecorator2[Double, ThrottleOptions] = js.native
  val Unary: BiTypedMethodDecorator = js.native
  val attempt: BiTypedMethodDecorator = js.native
  val bind: BiTypedMethodDecorator1[js.Any] = js.native
  val curry: BiTypedMethodDecorator1[Double] = js.native
  val curryAll: BiTypedDecorator1[Double] = js.native
  val curryRight: BiTypedMethodDecorator1[Double] = js.native
  val curryRightAll: BiTypedMethodDecorator1[Double] = js.native
  val defer: BiTypedDecoratorN = js.native
  val memoize: BiTypedMethodDecorator1[String | js.Function | (MemoizeConfig[js.Any, js.Any])] = js.native
  val memoizeAll: BiTypedMethodDecorator1[js.Function | (MemoizeConfig[js.Any, js.Any])] = js.native
  val negate: BiTypedDecorator1[ResolvableFunction] = js.native
  val once: BiTypedDecorator = js.native
  val rest: BiTypedMethodDecorator1[Double] = js.native
  val spread: BiTypedMethodDecorator1[Double] = js.native
  val tap: BiTypedMethodDecorator = js.native
  val throttle: BiTypedDecorator2[Double, ThrottleOptions] = js.native
  val throttleGetter: BiTypedDecorator2[Double, ThrottleOptions] = js.native
  val throttleSetter: BiTypedDecorator2[Double, ThrottleOptions] = js.native
  val unary: BiTypedMethodDecorator = js.native
  def After(n: Double): LodashDecorator = js.native
  def AfterAll(n: Double): LodashDecorator = js.native
  def Ary(n: Double): LodashMethodDecorator = js.native
  def Before(n: Double): LodashDecorator = js.native
  def BeforeAll(n: Double): LodashDecorator = js.native
  def BindAll(): ClassDecorator = js.native
  def BindAll(methods: js.Array[String]): ClassDecorator = js.native
  def Debounce(): LodashDecorator = js.native
  def Debounce(wait: Double): LodashDecorator = js.native
  def Debounce(wait: Double, options: DebounceOptions): LodashDecorator = js.native
  def DebounceAll(): LodashMethodDecorator = js.native
  def DebounceAll(wait: Double): LodashMethodDecorator = js.native
  def DebounceAll(wait: Double, options: DebounceOptions): LodashMethodDecorator = js.native
  def Delay(wait: Double, args: js.Any*): LodashMethodDecorator = js.native
  def Flip(): LodashDecorator = js.native
  def Flip(fn: ResolvableFunction): LodashDecorator = js.native
  def Flow(fns: ResolvableFunction*): LodashDecorator = js.native
  def FlowRight(fns: ResolvableFunction*): LodashDecorator = js.native
  def Mixin(srcs: js.Object*): ClassDecorator = js.native
  def OverArgs(transforms: js.Function*): LodashMethodDecorator = js.native
  def Partial(partials: js.Any*): PropertyDecorator = js.native
  def PartialRight(partials: js.Any*): PropertyDecorator = js.native
  def Rearg(indexes: js.Array[Double], args: (Double | js.Array[Double])*): LodashDecorator = js.native
  def Rearg(indexes: Double, args: (Double | js.Array[Double])*): LodashDecorator = js.native
  def Rearg(indexes: ResolvableFunction, args: (Double | js.Array[Double])*): LodashDecorator = js.native
  def ThrottleAll(): LodashMethodDecorator = js.native
  def ThrottleAll(wait: Double): LodashMethodDecorator = js.native
  def ThrottleAll(wait: Double, options: ThrottleOptions): LodashMethodDecorator = js.native
  def Wrap(): LodashMethodDecorator = js.native
  def Wrap(fnToWrap: ResolvableFunction): LodashMethodDecorator = js.native
  def after(n: Double): LodashDecorator = js.native
  def afterAll(n: Double): LodashDecorator = js.native
  def ary(n: Double): LodashMethodDecorator = js.native
  def before(n: Double): LodashDecorator = js.native
  def beforeAll(n: Double): LodashDecorator = js.native
  def bindAll(): ClassDecorator = js.native
  def bindAll(methods: js.Array[String]): ClassDecorator = js.native
  def debounce(): LodashDecorator = js.native
  def debounce(wait: Double): LodashDecorator = js.native
  def debounce(wait: Double, options: DebounceOptions): LodashDecorator = js.native
  def debounceAll(): LodashMethodDecorator = js.native
  def debounceAll(wait: Double): LodashMethodDecorator = js.native
  def debounceAll(wait: Double, options: DebounceOptions): LodashMethodDecorator = js.native
  def delay(wait: Double, args: js.Any*): LodashMethodDecorator = js.native
  def flip(): LodashDecorator = js.native
  def flip(fn: ResolvableFunction): LodashDecorator = js.native
  def flow(fns: ResolvableFunction*): LodashDecorator = js.native
  def flowRight(fns: ResolvableFunction*): LodashDecorator = js.native
  def mixin(srcs: js.Object*): ClassDecorator = js.native
  def overArgs(transforms: js.Function*): LodashMethodDecorator = js.native
  def partial(partials: js.Any*): PropertyDecorator = js.native
  def partialRight(partials: js.Any*): PropertyDecorator = js.native
  def rearg(indexes: js.Array[Double], args: (Double | js.Array[Double])*): LodashDecorator = js.native
  def rearg(indexes: Double, args: (Double | js.Array[Double])*): LodashDecorator = js.native
  def rearg(indexes: ResolvableFunction, args: (Double | js.Array[Double])*): LodashDecorator = js.native
  def throttleAll(): LodashMethodDecorator = js.native
  def throttleAll(wait: Double): LodashMethodDecorator = js.native
  def throttleAll(wait: Double, options: ThrottleOptions): LodashMethodDecorator = js.native
  def wrap(): LodashMethodDecorator = js.native
  def wrap(fnToWrap: ResolvableFunction): LodashMethodDecorator = js.native
}

