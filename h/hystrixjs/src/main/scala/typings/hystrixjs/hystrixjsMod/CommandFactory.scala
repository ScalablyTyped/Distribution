package typings.hystrixjs.hystrixjsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandFactory extends js.Object {
  def getOrCreate(commandKey: String): CommandBuilder = js.native
  def getOrCreate(commandKey: String, commandGroup: String): CommandBuilder = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUVWXYZ_CommandBuilderA7[R, T, U, V, W, X, Y, Z](commandKey: String): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUVWXYZ_CommandBuilderA7[R, T, U, V, W, X, Y, Z](commandKey: String, commandGroup: String): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUVWXY_CommandBuilderA6[R, T, U, V, W, X, Y](commandKey: String): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUVWXY_CommandBuilderA6[R, T, U, V, W, X, Y](commandKey: String, commandGroup: String): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUVWX_CommandBuilderA5[R, T, U, V, W, X](commandKey: String): CommandBuilderA5[R, T, U, V, W, X] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUVWX_CommandBuilderA5[R, T, U, V, W, X](commandKey: String, commandGroup: String): CommandBuilderA5[R, T, U, V, W, X] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUVW_CommandBuilderA4[R, T, U, V, W](commandKey: String): CommandBuilderA4[R, T, U, V, W] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUVW_CommandBuilderA4[R, T, U, V, W](commandKey: String, commandGroup: String): CommandBuilderA4[R, T, U, V, W] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUV_CommandBuilderA3[R, T, U, V](commandKey: String): CommandBuilderA3[R, T, U, V] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUV_CommandBuilderA3[R, T, U, V](commandKey: String, commandGroup: String): CommandBuilderA3[R, T, U, V] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTU_CommandBuilderA2[R, T, U](commandKey: String): CommandBuilderA2[R, T, U] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTU_CommandBuilderA2[R, T, U](commandKey: String, commandGroup: String): CommandBuilderA2[R, T, U] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RT_CommandBuilderA1[R, T](commandKey: String): CommandBuilderA1[R, T] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RT_CommandBuilderA1[R, T](commandKey: String, commandGroup: String): CommandBuilderA1[R, T] = js.native
  @JSName("getOrCreate")
  def getOrCreate_R_CommandBuilderA0[R](commandKey: String): CommandBuilderA0[R] = js.native
  @JSName("getOrCreate")
  def getOrCreate_R_CommandBuilderA0[R](commandKey: String, commandGroup: String): CommandBuilderA0[R] = js.native
  def resetCache(): Unit = js.native
}

@JSImport("hystrixjs", "commandFactory")
@js.native
object commandFactory extends TopLevel[CommandFactory]

