package typings.locutus.locutusMod.php

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("locutus", "php.datetime")
@js.native
object datetime extends js.Object {
  @js.native
  object checkdate extends js.Object {
    def apply(): js.Any = js.native
    def apply(m: js.Any): js.Any = js.native
    def apply(m: js.Any, d: js.Any): js.Any = js.native
    def apply(m: js.Any, d: js.Any, y: js.Any): js.Any = js.native
  }
  
  @js.native
  object date extends js.Object {
    def apply(): js.Any = js.native
    def apply(format: js.Any): js.Any = js.native
    def apply(format: js.Any, timestamp: js.Any): js.Any = js.native
  }
  
  @js.native
  object date_parse extends js.Object {
    def apply(): js.Any = js.native
    def apply(date: js.Any): js.Any = js.native
  }
  
  @js.native
  object getdate extends js.Object {
    def apply(): js.Any = js.native
    def apply(timestamp: js.Any): js.Any = js.native
  }
  
  @js.native
  object gettimeofday extends js.Object {
    def apply(): js.Any = js.native
    def apply(returnFloat: js.Any): js.Any = js.native
  }
  
  @js.native
  object gmdate extends js.Object {
    def apply(): js.Any = js.native
    def apply(format: js.Any): js.Any = js.native
    def apply(format: js.Any, timestamp: js.Any): js.Any = js.native
  }
  
  @js.native
  object gmmktime extends js.Object {
    def apply(args: js.Any*): js.Any = js.native
  }
  
  @js.native
  object gmstrftime extends js.Object {
    def apply(): js.Any = js.native
    def apply(format: js.Any): js.Any = js.native
    def apply(format: js.Any, timestamp: js.Any): js.Any = js.native
  }
  
  @js.native
  object idate extends js.Object {
    def apply(): js.Any = js.native
    def apply(format: js.Any): js.Any = js.native
    def apply(format: js.Any, timestamp: js.Any): js.Any = js.native
  }
  
  @js.native
  object microtime extends js.Object {
    def apply(): js.Any = js.native
    def apply(getAsFloat: js.Any): js.Any = js.native
  }
  
  @js.native
  object mktime extends js.Object {
    def apply(args: js.Any*): js.Any = js.native
  }
  
  @js.native
  object strftime extends js.Object {
    def apply(): js.Any = js.native
    def apply(fmt: js.Any): js.Any = js.native
    def apply(fmt: js.Any, timestamp: js.Any): js.Any = js.native
  }
  
  @js.native
  object strptime extends js.Object {
    def apply(): js.Any = js.native
    def apply(dateStr: js.Any): js.Any = js.native
    def apply(dateStr: js.Any, format: js.Any): js.Any = js.native
  }
  
  @js.native
  object strtotime extends js.Object {
    def apply(): js.Any = js.native
    def apply(text: js.Any): js.Any = js.native
    def apply(text: js.Any, now: js.Any): js.Any = js.native
  }
  
  @js.native
  object time extends js.Object {
    def apply(): js.Any = js.native
  }
  
}

