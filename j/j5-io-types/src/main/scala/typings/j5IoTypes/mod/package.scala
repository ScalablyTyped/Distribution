package typings.j5IoTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type I2CReadBufferCallback = js.Function2[
    /* err */ scala.Null | typings.std.Error | java.lang.String, 
    /* data */ scala.Null | typings.node.Buffer, 
    scala.Unit
  ]
  type I2CReadNumberCallback = js.Function2[
    /* err */ scala.Null | typings.std.Error | java.lang.String, 
    /* data */ scala.Null | scala.Double, 
    scala.Unit
  ]
  type I2CWriteCallback = js.Function1[/* err */ scala.Null | typings.std.Error | java.lang.String, scala.Unit]
  type SerialCallback = js.Function0[scala.Unit]
  type SerialErrorCallback = js.Function1[/* err */ js.UndefOr[typings.std.Error | java.lang.String], scala.Unit]
}
