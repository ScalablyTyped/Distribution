package typings.locutus.locutusMod.php

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("locutus", "php.funchand")
@js.native
object funchand extends js.Object {
  @js.native
  object call_user_func extends js.Object {
    def apply(args: js.Any*): js.Any = js.native
  }
  
  @js.native
  object call_user_func_array extends js.Object {
    def apply(): js.Any = js.native
    def apply(cb: js.Any): js.Any = js.native
    def apply(cb: js.Any, parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  object create_function extends js.Object {
    def apply(): js.Any = js.native
    def apply(args: js.Any): js.Any = js.native
    def apply(args: js.Any, code: js.Any): js.Any = js.native
  }
  
  @js.native
  object function_exists extends js.Object {
    def apply(): js.Any = js.native
    def apply(funcName: js.Any): js.Any = js.native
  }
  
  @js.native
  object get_defined_functions extends js.Object {
    def apply(): js.Any = js.native
  }
  
}

