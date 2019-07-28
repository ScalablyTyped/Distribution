package typings.jpegDashAutorotate.jpegDashAutorotateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait errors extends js.Object

@JSImport("jpeg-autorotate", "errors")
@js.native
object errors extends js.Object {
  @js.native
  sealed trait correct_orientation extends errors
  
  @js.native
  sealed trait no_orientation extends errors
  
  @js.native
  sealed trait read_exif extends errors
  
  @js.native
  sealed trait read_file extends errors
  
  @js.native
  sealed trait rotate_file extends errors
  
  @js.native
  sealed trait unknown_orientation extends errors
  
  /* "correct_orientation" */ val correct_orientation: typings.jpegDashAutorotate.jpegDashAutorotateMod.errors.correct_orientation with String = js.native
  /* "no_orientation" */ val no_orientation: typings.jpegDashAutorotate.jpegDashAutorotateMod.errors.no_orientation with String = js.native
  /* "read_exif" */ val read_exif: typings.jpegDashAutorotate.jpegDashAutorotateMod.errors.read_exif with String = js.native
  /* "read_file" */ val read_file: typings.jpegDashAutorotate.jpegDashAutorotateMod.errors.read_file with String = js.native
  /* "rotate_file" */ val rotate_file: typings.jpegDashAutorotate.jpegDashAutorotateMod.errors.rotate_file with String = js.native
  /* "unknown_orientation" */ val unknown_orientation: typings.jpegDashAutorotate.jpegDashAutorotateMod.errors.unknown_orientation with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[errors with String] = js.native
}

