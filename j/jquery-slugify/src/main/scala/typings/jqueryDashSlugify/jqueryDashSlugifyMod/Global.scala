package typings.jqueryDashSlugify.jqueryDashSlugifyMod

import typings.jqueryDashSlugify.jqueryDashSlugifyMod.Global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object Global extends js.Object {
  @js.native
  trait JQuery extends js.Object {
    def slugify(source: String): JQuery = js.native
    def slugify(source: String, options: Options): JQuery = js.native
  }
  
  @js.native
  trait JQueryStatic extends js.Object {
    def slugify(source: String): String = js.native
    def slugify(source: String, options: Options): String = js.native
  }
  
}

