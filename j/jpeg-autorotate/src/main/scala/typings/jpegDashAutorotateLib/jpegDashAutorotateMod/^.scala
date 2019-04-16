package typings
package jpegDashAutorotateLib.jpegDashAutorotateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jpeg-autorotate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def rotate(path_or_buffer: java.lang.String, options: RotateOptions): js.Promise[jpegDashAutorotateLib.Anon_Buffer] = js.native
  def rotate(
    path_or_buffer: java.lang.String,
    options: RotateOptions,
    module_callback: js.Function5[
      /* error */ CustomError | scala.Null, 
      /* buffer */ nodeLib.Buffer, 
      /* orientation */ scala.Double | scala.Null, 
      /* dimensions */ RotateDimensions | scala.Null, 
      /* quality */ scala.Double | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def rotate(path_or_buffer: nodeLib.Buffer, options: RotateOptions): js.Promise[jpegDashAutorotateLib.Anon_Buffer] = js.native
  def rotate(
    path_or_buffer: nodeLib.Buffer,
    options: RotateOptions,
    module_callback: js.Function5[
      /* error */ CustomError | scala.Null, 
      /* buffer */ nodeLib.Buffer, 
      /* orientation */ scala.Double | scala.Null, 
      /* dimensions */ RotateDimensions | scala.Null, 
      /* quality */ scala.Double | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("rotate")
  def rotate_Unit(path_or_buffer: java.lang.String, options: RotateOptions): scala.Unit = js.native
  @JSName("rotate")
  def rotate_Unit(path_or_buffer: nodeLib.Buffer, options: RotateOptions): scala.Unit = js.native
}

