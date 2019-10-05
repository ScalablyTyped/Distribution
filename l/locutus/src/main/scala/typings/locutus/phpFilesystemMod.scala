package typings.locutus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("locutus/php/filesystem", JSImport.Namespace)
@js.native
object phpFilesystemMod extends js.Object {
  @js.native
  object basename extends js.Object {
    def apply(): js.Any = js.native
    def apply(path: js.Any): js.Any = js.native
    def apply(path: js.Any, suffix: js.Any): js.Any = js.native
  }
  
  @js.native
  object dirname extends js.Object {
    def apply(): js.Any = js.native
    def apply(path: js.Any): js.Any = js.native
  }
  
  @js.native
  object file_get_contents extends js.Object {
    def apply(): js.Any = js.native
    def apply(url: js.Any): js.Any = js.native
    def apply(url: js.Any, flags: js.Any): js.Any = js.native
    def apply(url: js.Any, flags: js.Any, context: js.Any): js.Any = js.native
    def apply(url: js.Any, flags: js.Any, context: js.Any, offset: js.Any): js.Any = js.native
    def apply(url: js.Any, flags: js.Any, context: js.Any, offset: js.Any, maxLen: js.Any): js.Any = js.native
  }
  
  @js.native
  object pathinfo extends js.Object {
    def apply(args: js.Any*): js.Any = js.native
  }
  
  @js.native
  object realpath extends js.Object {
    def apply(): js.Any = js.native
    def apply(path: js.Any): js.Any = js.native
  }
  
}

