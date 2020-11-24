package typings.kolite

import typings.kolite.anon.Opacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KoLiteActivity extends js.Object {
  
  def apply(options: KoLiteActivityOptions): JQuery = js.native
  
  var defaults: KoLiteActivityOptions = js.native
  
  def getOpacity(options: Opacity, i: Double): Double = js.native
}
