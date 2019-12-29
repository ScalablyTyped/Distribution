package typings.grammarkdown

import typings.grammarkdown.distCoreMod.Position
import typings.grammarkdown.distNodesMod.Node
import typings.grammarkdown.distNodesMod.SourceFile
import typings.grammarkdown.distTokensMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/navigator", JSImport.Namespace)
@js.native
object distNavigatorMod extends js.Object {
  @js.native
  class NodeNavigator protected () extends js.Object {
    def this(other: NodeNavigator) = this()
    def this(sourceFile: SourceFile) = this()
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
    def getArray(): js.UndefOr[js.Array[Node[SyntaxKind]]] = js.native
    def getDepth(): Double = js.native
    def getKind(): SyntaxKind = js.native
    def getName(): js.UndefOr[String] = js.native
    def getNode(): Node[SyntaxKind] = js.native
    def getOffset(): Double = js.native
    def getParent(): js.UndefOr[Node[SyntaxKind]] = js.native
    def getRoot(): SourceFile = js.native
    def hasAncestor(): Boolean = js.native
    def hasAncestor(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    def hasChildren(): Boolean = js.native
    def hasChildren(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    def isArray(): Boolean = js.native
    def isSamePosition(other: NodeNavigator): Boolean = js.native
    def moveTo(other: NodeNavigator): Boolean = js.native
    def moveToAncestor(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    def moveToAncestorOrSelf(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    def moveToDeclaration(): Boolean = js.native
    def moveToFirstChild(): Boolean = js.native
    def moveToFirstChild(name: String): Boolean = js.native
    def moveToFirstChild(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    def moveToFirstElement(): Boolean = js.native
    def moveToFirstElement(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    def moveToFirstSibling(): Boolean = js.native
    def moveToFirstSibling(name: String): Boolean = js.native
    def moveToFirstSibling(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    def moveToLastChild(): Boolean = js.native
    def moveToLastChild(name: String): Boolean = js.native
    def moveToLastChild(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    def moveToLastElement(): Boolean = js.native
    def moveToLastElement(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    def moveToLastSibling(): Boolean = js.native
    def moveToLastSibling(name: String): Boolean = js.native
    def moveToLastSibling(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    def moveToName(): Boolean = js.native
    def moveToNextElement(): Boolean = js.native
    def moveToNextElement(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    def moveToNextSibling(): Boolean = js.native
    def moveToNextSibling(name: String): Boolean = js.native
    def moveToNextSibling(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    def moveToParent(): Boolean = js.native
    def moveToParent(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    def moveToPosition(position: Position): Boolean = js.native
    def moveToPreviousElement(): Boolean = js.native
    def moveToPreviousElement(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    def moveToPreviousSibling(): Boolean = js.native
    def moveToPreviousSibling(name: String): Boolean = js.native
    def moveToPreviousSibling(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    def moveToRoot(): Boolean = js.native
    def moveToSourceElement(): Boolean = js.native
  }
  
}

