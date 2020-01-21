package typings.jpegAutorotate.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[errors with String] = js.native
  /* "correct_orientation" */ @js.native
  object correct_orientation extends TopLevel[correct_orientation with String]
  
  /* "no_orientation" */ @js.native
  object no_orientation extends TopLevel[no_orientation with String]
  
  /* "read_exif" */ @js.native
  object read_exif extends TopLevel[read_exif with String]
  
  /* "read_file" */ @js.native
  object read_file extends TopLevel[read_file with String]
  
  /* "rotate_file" */ @js.native
  object rotate_file extends TopLevel[rotate_file with String]
  
  /* "unknown_orientation" */ @js.native
  object unknown_orientation extends TopLevel[unknown_orientation with String]
  
}

