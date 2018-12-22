package typings
package jpegDashAutorotateLib.jpegDashAutorotateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait errors extends js.Object

@JSImport("jpeg-autorotate", "errors")
@js.native
object errors extends js.Object {
  @js.native
  sealed trait correct_orientation
    extends jpegDashAutorotateLib.jpegDashAutorotateMod.errors
  
  @js.native
  sealed trait no_orientation
    extends jpegDashAutorotateLib.jpegDashAutorotateMod.errors
  
  @js.native
  sealed trait read_exif
    extends jpegDashAutorotateLib.jpegDashAutorotateMod.errors
  
  @js.native
  sealed trait read_file
    extends jpegDashAutorotateLib.jpegDashAutorotateMod.errors
  
  @js.native
  sealed trait rotate_file
    extends jpegDashAutorotateLib.jpegDashAutorotateMod.errors
  
  @js.native
  sealed trait unknown_orientation
    extends jpegDashAutorotateLib.jpegDashAutorotateMod.errors
  
  /* "correct_orientation" */ val correct_orientation: correct_orientation with java.lang.String = js.native
  /* "no_orientation" */ val no_orientation: no_orientation with java.lang.String = js.native
  /* "read_exif" */ val read_exif: read_exif with java.lang.String = js.native
  /* "read_file" */ val read_file: read_file with java.lang.String = js.native
  /* "rotate_file" */ val rotate_file: rotate_file with java.lang.String = js.native
  /* "unknown_orientation" */ val unknown_orientation: unknown_orientation with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[jpegDashAutorotateLib.jpegDashAutorotateMod.errors with java.lang.String] = js.native
}

