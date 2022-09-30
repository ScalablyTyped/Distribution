package typings.hippyReact.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListView
  extends Component[ListViewProps, js.Object, Any] {
  
  def collapsePullHeader(): Unit = js.native
  
  def scrollToContentOffset(xOffset: Double, yOffset: Double, animated: Boolean): Unit = js.native
  
  def scrollToIndex(xIndex: Double, yIndex: Double, animated: Boolean): Unit = js.native
}
