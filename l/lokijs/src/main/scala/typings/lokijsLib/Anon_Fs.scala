package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fs extends js.Object {
  var fs: _LokiFsAdapter
  var localStorage: _LokiLocalStorageAdapter
}

object Anon_Fs {
  @scala.inline
  def apply(fs: _LokiFsAdapter, localStorage: _LokiLocalStorageAdapter): Anon_Fs = {
    val __obj = js.Dynamic.literal(fs = fs, localStorage = localStorage)
  
    __obj.asInstanceOf[Anon_Fs]
  }
}

