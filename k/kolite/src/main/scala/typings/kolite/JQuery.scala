package typings.kolite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def activity(options: KoLiteActivityOptions): JQuery = js.native
  
  def activityEx(isLoading: Boolean): JQuery = js.native
  
  @JSName("activity")
  var activity_Original: KoLiteActivity = js.native
}
