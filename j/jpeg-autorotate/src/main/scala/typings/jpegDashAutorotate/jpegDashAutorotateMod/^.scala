package typings.jpegDashAutorotate.jpegDashAutorotateMod

import typings.jpegDashAutorotate.Anon_Buffer
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jpeg-autorotate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def rotate(path_or_buffer: String, options: RotateOptions): js.Promise[Anon_Buffer] = js.native
  def rotate(
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
  def rotate(path_or_buffer: Buffer, options: RotateOptions): js.Promise[Anon_Buffer] = js.native
  def rotate(
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
  @JSName("rotate")
  def rotate_Unit(path_or_buffer: String, options: RotateOptions): Unit = js.native
  @JSName("rotate")
  def rotate_Unit(path_or_buffer: Buffer, options: RotateOptions): Unit = js.native
}

