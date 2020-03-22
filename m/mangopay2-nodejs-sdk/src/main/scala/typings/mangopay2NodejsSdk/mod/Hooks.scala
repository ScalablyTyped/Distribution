package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.hook.CreateHook
import typings.mangopay2NodejsSdk.mod.hook.HookData
import typings.mangopay2NodejsSdk.mod.hook.UpdateHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "Hooks")
@js.native
class Hooks () extends js.Object {
  /**
    * Create new hook
    * @param hook
    * @param options
    */
  @JSName("create")
  var create_Original: MethodOverload[CreateHook, HookData] = js.native
  /**
    * Get all hooks
    * @param options
    */
  @JSName("getAll")
  var getAll_Original: NoArgMethodOverload[js.Array[HookData]] = js.native
  /**
    * Get hook
    * @param hookId
    * @param options
    */
  @JSName("get")
  var get_Original: MethodOverload[String, HookData] = js.native
  /**
    * Save hook
    * @param hook
    * @param options
    */
  @JSName("update")
  var update_Original: MethodOverload[UpdateHook, HookData] = js.native
  /**
    * Create new hook
    * @param hook
    * @param options
    */
  def create(data: CreateHook): js.Promise[HookData] = js.native
  /**
    * Create new hook
    * @param hook
    * @param options
    */
  def create(data: CreateHook, callback: js.Function1[/* data */ HookData, Unit]): Unit = js.native
  /**
    * Create new hook
    * @param hook
    * @param options
    */
  def create(
    data: CreateHook,
    callback: js.Function1[/* data */ WithResponse[HookData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def create(
    data: CreateHook,
    callback: js.Function1[/* data */ HookData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create new hook
    * @param hook
    * @param options
    */
  def create(data: CreateHook, options: MethodOptionWithResponse): js.Promise[WithResponse[HookData]] = js.native
  def create(data: CreateHook, options: MethodOptionWithoutResponse): js.Promise[HookData] = js.native
  /**
    * Get hook
    * @param hookId
    * @param options
    */
  def get(data: String): js.Promise[HookData] = js.native
  /**
    * Get hook
    * @param hookId
    * @param options
    */
  def get(data: String, callback: js.Function1[/* data */ HookData, Unit]): Unit = js.native
  /**
    * Get hook
    * @param hookId
    * @param options
    */
  def get(
    data: String,
    callback: js.Function1[/* data */ WithResponse[HookData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def get(
    data: String,
    callback: js.Function1[/* data */ HookData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get hook
    * @param hookId
    * @param options
    */
  def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[HookData]] = js.native
  def get(data: String, options: MethodOptionWithoutResponse): js.Promise[HookData] = js.native
  /**
    * Get all hooks
    * @param options
    */
  def getAll(): js.Promise[js.Array[HookData]] = js.native
  /**
    * Get all hooks
    * @param options
    */
  def getAll(
    callback: js.Function1[
      (/* data */ js.Array[HookData]) | (/* data */ WithResponse[js.Array[HookData]]), 
      Unit
    ]
  ): Unit = js.native
  def getAll(
    callback: js.Function1[/* data */ WithResponse[js.Array[HookData]], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getAll(callback: js.Function1[/* data */ js.Array[HookData], Unit], options: MethodOptionWithoutResponse): Unit = js.native
  /**
    * Get all hooks
    * @param options
    */
  def getAll(options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[HookData]]] = js.native
  def getAll(options: MethodOptionWithoutResponse): js.Promise[js.Array[HookData]] = js.native
  /**
    * Save hook
    * @param hook
    * @param options
    */
  def update(data: UpdateHook): js.Promise[HookData] = js.native
  /**
    * Save hook
    * @param hook
    * @param options
    */
  def update(data: UpdateHook, callback: js.Function1[/* data */ HookData, Unit]): Unit = js.native
  /**
    * Save hook
    * @param hook
    * @param options
    */
  def update(
    data: UpdateHook,
    callback: js.Function1[/* data */ WithResponse[HookData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def update(
    data: UpdateHook,
    callback: js.Function1[/* data */ HookData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Save hook
    * @param hook
    * @param options
    */
  def update(data: UpdateHook, options: MethodOptionWithResponse): js.Promise[WithResponse[HookData]] = js.native
  def update(data: UpdateHook, options: MethodOptionWithoutResponse): js.Promise[HookData] = js.native
}

