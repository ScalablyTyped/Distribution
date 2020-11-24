package typings.jpegAutorotate.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait errors extends js.Object
@JSImport("jpeg-autorotate", "errors")
@js.native
object errors extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[errors with String] = js.native
  
  @js.native
  sealed trait correct_orientation extends errors
  /* "correct_orientation" */ @js.native
  object correct_orientation extends TopLevel[correct_orientation with String]
  
  @js.native
  sealed trait no_orientation extends errors
  /* "no_orientation" */ @js.native
  object no_orientation extends TopLevel[no_orientation with String]
  
  @js.native
  sealed trait read_exif extends errors
  /* "read_exif" */ @js.native
  object read_exif extends TopLevel[read_exif with String]
  
  @js.native
  sealed trait read_file extends errors
  /* "read_file" */ @js.native
  object read_file extends TopLevel[read_file with String]
  
  @js.native
  sealed trait rotate_file extends errors
  /* "rotate_file" */ @js.native
  object rotate_file extends TopLevel[rotate_file with String]
  
  @js.native
  sealed trait unknown_orientation extends errors
  /* "unknown_orientation" */ @js.native
  object unknown_orientation extends TopLevel[unknown_orientation with String]
}
