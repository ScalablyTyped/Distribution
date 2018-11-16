package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandFactory extends js.Object {
  def getOrCreate(commandKey: java.lang.String): CommandBuilder = js.native
  def getOrCreate(commandKey: java.lang.String, commandGroup: java.lang.String): CommandBuilder = js.native
  @JSName("getOrCreate")
  def getOrCreate_RCommandBuilderA0[R](commandKey: java.lang.String): CommandBuilderA0[R] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RCommandBuilderA0[R](commandKey: java.lang.String, commandGroup: java.lang.String): CommandBuilderA0[R] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTCommandBuilderA1[R, T](commandKey: java.lang.String): CommandBuilderA1[R, T] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTCommandBuilderA1[R, T](commandKey: java.lang.String, commandGroup: java.lang.String): CommandBuilderA1[R, T] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUCommandBuilderA2[R, T, U](commandKey: java.lang.String): CommandBuilderA2[R, T, U] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUCommandBuilderA2[R, T, U](commandKey: java.lang.String, commandGroup: java.lang.String): CommandBuilderA2[R, T, U] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUVCommandBuilderA3[R, T, U, V](commandKey: java.lang.String): CommandBuilderA3[R, T, U, V] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUVCommandBuilderA3[R, T, U, V](commandKey: java.lang.String, commandGroup: java.lang.String): CommandBuilderA3[R, T, U, V] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUVWCommandBuilderA4[R, T, U, V, W](commandKey: java.lang.String): CommandBuilderA4[R, T, U, V, W] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUVWCommandBuilderA4[R, T, U, V, W](commandKey: java.lang.String, commandGroup: java.lang.String): CommandBuilderA4[R, T, U, V, W] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUVWXCommandBuilderA5[R, T, U, V, W, X](commandKey: java.lang.String): CommandBuilderA5[R, T, U, V, W, X] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUVWXCommandBuilderA5[R, T, U, V, W, X](commandKey: java.lang.String, commandGroup: java.lang.String): CommandBuilderA5[R, T, U, V, W, X] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUVWXYCommandBuilderA6[R, T, U, V, W, X, Y](commandKey: java.lang.String): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUVWXYCommandBuilderA6[R, T, U, V, W, X, Y](commandKey: java.lang.String, commandGroup: java.lang.String): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUVWXYZCommandBuilderA7[R, T, U, V, W, X, Y, Z](commandKey: java.lang.String): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  @JSName("getOrCreate")
  def getOrCreate_RTUVWXYZCommandBuilderA7[R, T, U, V, W, X, Y, Z](commandKey: java.lang.String, commandGroup: java.lang.String): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  def resetCache(): scala.Unit = js.native
}

