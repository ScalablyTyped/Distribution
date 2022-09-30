package typings.hippyReact.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullHeader
  extends Component[PullHeaderProps, js.Object, Any] {
  
  /**
    * Collapse the PullView and hide the content
    * @param {CollapsePullHeaderOptions} [options] - additional config for pull header
    */
  def collapsePullHeader(options: CollapsePullHeaderOptions): Unit = js.native
  
  /**
    * Expand the PullView and display the content
    */
  def expandPullHeader(): Unit = js.native
}
