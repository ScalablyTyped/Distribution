package typings.jqueryDashAnimateDashScroll

import typings.jqueryDashAnimateDashScroll.jqueryDashAnimateDashScrollMod.Global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Container extends js.Object {
  @JSName("$container")
  var $container: JQuery
  var offset: Double
  var speed: Double
}

object Anon_Container {
  @scala.inline
  def apply($container: JQuery, offset: Double, speed: Double): Anon_Container = {
    val __obj = js.Dynamic.literal($container = $container, offset = offset, speed = speed)
  
    __obj.asInstanceOf[Anon_Container]
  }
}

