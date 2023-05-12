package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import typings.vscode.mod.TreeItemLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.TreeItem")
@js.native
open class TreeItem protected ()
  extends typings.vscode.mod.TreeItem {
  /**
  		 * @param label A human-readable string describing this item
  		 * @param collapsibleState {@link TreeItemCollapsibleState} of the tree item. Default is {@link TreeItemCollapsibleState.None}
  		 */
  def this(label: String) = this()
  def this(label: TreeItemLabel) = this()
  /**
  		 * @param resourceUri The {@link Uri} of the resource representing this item.
  		 * @param collapsibleState {@link TreeItemCollapsibleState} of the tree item. Default is {@link TreeItemCollapsibleState.None}
  		 */
  def this(resourceUri: typings.vscode.mod.Uri) = this()
  def this(label: String, collapsibleState: typings.vscode.mod.TreeItemCollapsibleState) = this()
  def this(label: TreeItemLabel, collapsibleState: typings.vscode.mod.TreeItemCollapsibleState) = this()
  def this(resourceUri: typings.vscode.mod.Uri, collapsibleState: typings.vscode.mod.TreeItemCollapsibleState) = this()
}
