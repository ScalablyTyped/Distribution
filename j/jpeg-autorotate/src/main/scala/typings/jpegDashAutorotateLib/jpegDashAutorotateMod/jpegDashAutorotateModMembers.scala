package typings
package jpegDashAutorotateLib.jpegDashAutorotateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jpeg-autorotate", JSImport.Namespace)
@js.native
object jpegDashAutorotateModMembers extends js.Object {
  def rotate(path_or_buffer: java.lang.String): scala.Unit = js.native
  def rotate(path_or_buffer: java.lang.String, options: jpegDashAutorotateLib.Anon_Quality): scala.Unit = js.native
  def rotate(
    path_or_buffer: java.lang.String,
    options: jpegDashAutorotateLib.Anon_Quality,
    module_callback: js.Function4[
      /* error */ CustomError | scala.Null, 
      /* buffer */ nodeLib.Buffer | scala.Null, 
      /* orientation */ scala.Double | scala.Null, 
      /* dimensions */ jpegDashAutorotateLib.Anon_Height | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def rotate(path_or_buffer: nodeLib.Buffer): scala.Unit = js.native
  def rotate(path_or_buffer: nodeLib.Buffer, options: jpegDashAutorotateLib.Anon_Quality): scala.Unit = js.native
  def rotate(
    path_or_buffer: nodeLib.Buffer,
    options: jpegDashAutorotateLib.Anon_Quality,
    module_callback: js.Function4[
      /* error */ CustomError | scala.Null, 
      /* buffer */ nodeLib.Buffer | scala.Null, 
      /* orientation */ scala.Double | scala.Null, 
      /* dimensions */ jpegDashAutorotateLib.Anon_Height | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

