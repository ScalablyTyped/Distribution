package typings.jpegDashAutorotate.jpegDashAutorotateMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jpeg-autorotate", "rotate")
@js.native
object rotate extends js.Object {
  def apply(path_or_buffer: String, options: RotateOptions): Unit = js.native
  def apply(
    path_or_buffer: String,
    options: RotateOptions,
    module_callback: js.Function5[
      /* error */ CustomError | Null, 
      /* buffer */ Buffer, 
      /* orientation */ Double | Null, 
      /* dimensions */ RotateDimensions | Null, 
      /* quality */ Double | Null, 
      Unit
    ]
  ): Unit = js.native
  def apply(path_or_buffer: Buffer, options: RotateOptions): Unit = js.native
  def apply(
    path_or_buffer: Buffer,
    options: RotateOptions,
    module_callback: js.Function5[
      /* error */ CustomError | Null, 
      /* buffer */ Buffer, 
      /* orientation */ Double | Null, 
      /* dimensions */ RotateDimensions | Null, 
      /* quality */ Double | Null, 
      Unit
    ]
  ): Unit = js.native
}

