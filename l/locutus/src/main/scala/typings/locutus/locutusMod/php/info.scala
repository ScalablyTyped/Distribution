package typings.locutus.locutusMod.php

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("locutus", "php.info")
@js.native
object info extends js.Object {
  @js.native
  object assert_options extends js.Object {
    def apply(): js.Any = js.native
    def apply(what: js.Any): js.Any = js.native
    def apply(what: js.Any, value: js.Any): js.Any = js.native
  }
  
  @js.native
  object getenv extends js.Object {
    def apply(): js.Any = js.native
    def apply(varname: js.Any): js.Any = js.native
  }
  
  @js.native
  object ini_get extends js.Object {
    def apply(): js.Any = js.native
    def apply(varname: js.Any): js.Any = js.native
  }
  
  @js.native
  object ini_set extends js.Object {
    def apply(): js.Any = js.native
    def apply(varname: js.Any): js.Any = js.native
    def apply(varname: js.Any, newvalue: js.Any): js.Any = js.native
  }
  
  @js.native
  object set_time_limit extends js.Object {
    def apply(): js.Any = js.native
    def apply(seconds: js.Any): js.Any = js.native
  }
  
  @js.native
  object version_compare extends js.Object {
    def apply(): js.Any = js.native
    def apply(v1: js.Any): js.Any = js.native
    def apply(v1: js.Any, v2: js.Any): js.Any = js.native
    def apply(v1: js.Any, v2: js.Any, operator: js.Any): js.Any = js.native
  }
  
}

