package typings
package inkDashTestingDashLibraryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  def write(data: js.Any): scala.Boolean
}

object Anon_Data {
  @scala.inline
  def apply(write: js.Any => scala.Boolean): Anon_Data = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[Anon_Data]
  }
}

