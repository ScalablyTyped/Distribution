package typings.hippyReact.mod

import typings.hippyReact.anon.Animated
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollView
  extends Component[ScrollViewProps, js.Object, Any] {
  
  def scrollTo(param: Animated): Unit = js.native
  def scrollTo(x: Double, y: Double, animated: Boolean): Unit = js.native
  
  def scrollToWithDuration(x: Double, y: Double, duration: Double): Unit = js.native
}
