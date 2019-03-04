package typings
package jqueryDashAnimateDashScrollLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Container extends js.Object {
  @JSName("$container")
  var $container: jqueryDashAnimateDashScrollLib.jqueryDashAnimateDashScrollMod.Global.JQuery
  var offset: scala.Double
  var speed: scala.Double
}

object Anon_Container {
  @scala.inline
  def apply(
    $container: jqueryDashAnimateDashScrollLib.jqueryDashAnimateDashScrollMod.Global.JQuery,
    offset: scala.Double,
    speed: scala.Double
  ): Anon_Container = {
    val __obj = js.Dynamic.literal($container = $container, offset = offset, speed = speed)
  
    __obj.asInstanceOf[Anon_Container]
  }
}

