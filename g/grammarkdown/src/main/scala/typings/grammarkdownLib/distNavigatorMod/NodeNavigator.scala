package typings
package grammarkdownLib.distNavigatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/navigator", "NodeNavigator")
@js.native
class NodeNavigator protected () extends js.Object {
  def this(other: NodeNavigator) = this()
  def this(sourceFile: grammarkdownLib.distNodesMod.SourceFile) = this()
  var afterNavigate: js.Any = js.native
  var arrayStack: js.Any = js.native
  var beforeNavigate: js.Any = js.native
  var copyOnNavigate: js.Any = js.native
  var currentArray: js.Any = js.native
  var currentDepth: js.Any = js.native
  var currentEdge: js.Any = js.native
  var currentNode: js.Any = js.native
  var currentOffset: js.Any = js.native
  var edgeStack: js.Any = js.native
  var hasAnyChildren: js.Any = js.native
  var hasChild: js.Any = js.native
  var initialize: js.Any = js.native
  var moveToChild: js.Any = js.native
  var moveToElement: js.Any = js.native
  var moveToPositionWorker: js.Any = js.native
  var moveToSibling: js.Any = js.native
  var nodeStack: js.Any = js.native
  var offsetStack: js.Any = js.native
  var parentNode: js.Any = js.native
  var popEdge: js.Any = js.native
  var pushEdge: js.Any = js.native
  var reset: js.Any = js.native
  var setEdge: js.Any = js.native
  var sourceFile: js.Any = js.native
  def getArray(): js.UndefOr[
    js.Array[grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]]
  ] = js.native
  def getDepth(): scala.Double = js.native
  def getKind(): grammarkdownLib.distTokensMod.SyntaxKind = js.native
  def getName(): js.UndefOr[java.lang.String] = js.native
  def getNode(): grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind] = js.native
  def getOffset(): scala.Double = js.native
  def getParent(): js.UndefOr[grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  def getRoot(): grammarkdownLib.distNodesMod.SourceFile = js.native
  def hasAncestor(): scala.Boolean = js.native
  def hasAncestor(
    predicate: js.Function1[
      /* node */ grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def hasChildren(): scala.Boolean = js.native
  def hasChildren(
    predicate: js.Function1[
      /* node */ grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def isArray(): scala.Boolean = js.native
  def isSamePosition(other: NodeNavigator): scala.Boolean = js.native
  def moveTo(other: NodeNavigator): scala.Boolean = js.native
  def moveToAncestor(
    predicate: js.Function1[
      /* node */ grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def moveToAncestorOrSelf(
    predicate: js.Function1[
      /* node */ grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def moveToDeclaration(): scala.Boolean = js.native
  def moveToFirstChild(): scala.Boolean = js.native
  def moveToFirstChild(name: java.lang.String): scala.Boolean = js.native
  def moveToFirstChild(
    predicate: js.Function1[
      /* node */ grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def moveToFirstElement(): scala.Boolean = js.native
  def moveToFirstElement(
    predicate: js.Function1[
      /* node */ grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def moveToFirstSibling(): scala.Boolean = js.native
  def moveToFirstSibling(name: java.lang.String): scala.Boolean = js.native
  def moveToFirstSibling(
    predicate: js.Function1[
      /* node */ grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def moveToLastChild(): scala.Boolean = js.native
  def moveToLastChild(name: java.lang.String): scala.Boolean = js.native
  def moveToLastChild(
    predicate: js.Function1[
      /* node */ grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def moveToLastElement(): scala.Boolean = js.native
  def moveToLastElement(
    predicate: js.Function1[
      /* node */ grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def moveToLastSibling(): scala.Boolean = js.native
  def moveToLastSibling(name: java.lang.String): scala.Boolean = js.native
  def moveToLastSibling(
    predicate: js.Function1[
      /* node */ grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def moveToName(): scala.Boolean = js.native
  def moveToNextElement(): scala.Boolean = js.native
  def moveToNextElement(
    predicate: js.Function1[
      /* node */ grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def moveToNextSibling(): scala.Boolean = js.native
  def moveToNextSibling(name: java.lang.String): scala.Boolean = js.native
  def moveToNextSibling(
    predicate: js.Function1[
      /* node */ grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def moveToParent(): scala.Boolean = js.native
  def moveToParent(
    predicate: js.Function1[
      /* node */ grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def moveToPosition(position: grammarkdownLib.distCoreMod.Position): scala.Boolean = js.native
  def moveToPreviousElement(): scala.Boolean = js.native
  def moveToPreviousElement(
    predicate: js.Function1[
      /* node */ grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def moveToPreviousSibling(): scala.Boolean = js.native
  def moveToPreviousSibling(name: java.lang.String): scala.Boolean = js.native
  def moveToPreviousSibling(
    predicate: js.Function1[
      /* node */ grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def moveToRoot(): scala.Boolean = js.native
  def moveToSourceElement(): scala.Boolean = js.native
}

