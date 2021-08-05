package typings.grammarkdown

import typings.grammarkdown.nodesMod.Node
import typings.grammarkdown.nodesMod.SourceFile
import typings.grammarkdown.tokensMod.SyntaxKind
import typings.grammarkdown.typesMod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigatorMod {
  
  @JSImport("grammarkdown/dist/navigator", "NodeNavigator")
  @js.native
  class NodeNavigator protected () extends StObject {
    /**
      * @param other A {@link NodeNavigator} whose position information is used to create this navigator.
      */
    def this(other: NodeNavigator) = this()
    /**
      * @param sourceFile The {@link SourceFile} to use as the root of the navigator.
      */
    def this(sourceFile: SourceFile) = this()
    
    /* private */ var _afterNavigate: js.Any = js.native
    
    /* private */ var _arrayStack: js.Any = js.native
    
    /* private */ var _beforeNavigate: js.Any = js.native
    
    /* private */ var _copyOnNavigate: js.Any = js.native
    
    /* private */ var _currentArray: js.Any = js.native
    
    /* private */ var _currentDepth: js.Any = js.native
    
    /* private */ var _currentEdge: js.Any = js.native
    
    /* private */ var _currentNode: js.Any = js.native
    
    /* private */ var _currentOffset: js.Any = js.native
    
    /* private */ var _edgeStack: js.Any = js.native
    
    /* private */ var _hasAnyChildren: js.Any = js.native
    
    /* private */ var _moveToChild: js.Any = js.native
    
    /* private */ var _moveToElement: js.Any = js.native
    
    /* private */ var _moveToPositionWorker: js.Any = js.native
    
    /* private */ var _moveToSibling: js.Any = js.native
    
    /* private */ var _nodeStack: js.Any = js.native
    
    /* private */ var _offsetStack: js.Any = js.native
    
    /* private */ var _parentNode: js.Any = js.native
    
    /* private */ var _popEdge: js.Any = js.native
    
    /* private */ var _pushEdge: js.Any = js.native
    
    /* private */ var _reset: js.Any = js.native
    
    /* private */ var _setEdge: js.Any = js.native
    
    /* private */ var _sourceFile: js.Any = js.native
    
    /**
      * Gets the containing node array of {@link Node} the navigator is currently focused on.
      */
    def getArray(): js.UndefOr[js.Array[Node[SyntaxKind]]] = js.native
    
    /**
      * Gets the current depth within the syntax-tree of the current focus of the navigator.
      */
    def getDepth(): Double = js.native
    
    /**
      * Gets the {@link SyntaxKind} of the {@link Node} the navigator is currently focused on.
      */
    def getKind(): SyntaxKind = js.native
    
    /**
      * Gets the name of the property on the parent {@link Node} the navigator is currently focused on.
      */
    def getName(): js.UndefOr[String] = js.native
    
    /**
      * Gets the {@link Node} the navigator is currently focused on.
      */
    def getNode(): Node[SyntaxKind] = js.native
    
    /**
      * Gets the ordinal offset within the containing node array of {@link Node} the navigator is currently focused on.
      */
    def getOffset(): Double = js.native
    
    /**
      * Gets the parent {@link Node} of the {@link Node} the navigator is currently focused on.
      */
    def getParent(): js.UndefOr[Node[SyntaxKind]] = js.native
    
    /**
      * Gets the root {@link SourceFile} node for this navigator.
      */
    def getRoot(): SourceFile = js.native
    
    /**
      * Determines whether the focused {@link Node} has an ancestor that matches the supplied predicate.
      * @param predicate An optional callback used to filter the ancestors of the node.
      * @returns `true` if the focused {@link Node} contains an ancestor that matches the supplied predicate; otherwise, `false`.
      */
    def hasAncestor(): Boolean = js.native
    /**
      * Determines whether the focused {@link Node} has an ancestor that matches the supplied predicate.
      * @param predicate An optional callback used to filter the ancestors of the node.
      * @returns `true` if the focused {@link Node} contains an ancestor that matches the supplied predicate; otherwise, `false`.
      */
    def hasAncestor(kind: SyntaxKind): Boolean = js.native
    def hasAncestor(predicate: js.Function1[/* ancestor */ Node[SyntaxKind], Boolean]): Boolean = js.native
    
    /**
      * Determines whether the focused {@link Node} has any children that match the supplied predicate.
      * @param predicate An optional callback that can be used to filter the children of the node.
      * @returns `true` if the focused {@link Node} contains a child that matches the supplied predicate; otherwise, `false`.
      */
    def hasChildren(): Boolean = js.native
    /**
      * Determines whether the focused {@link Node} has any children with the provided {@link SyntaxKind}.
      * @param kind The {@link SyntaxKind} that at least one child must match.
      * @returns `true` if the focused {@link Node} contains a matching child; otherwise, `false`.
      */
    def hasChildren(kind: SyntaxKind): Boolean = js.native
    def hasChildren(predicate: js.Function1[/* child */ Node[SyntaxKind], Boolean]): Boolean = js.native
    
    /**
      * Returns a value indicating whether the focus of the navigator points to a {@link Node} in an array.
      */
    def isArray(): Boolean = js.native
    
    /**
      * Determines whether the focused {@link Node} matches the supplied {@link SyntaxKind}.
      * @param kind The {@link SyntaxKind} that the focused {@link Node} must match.
      * @returns `true` if the focused {@link Node} matches; otherwise, `false`.
      */
    def isMatch(kind: SyntaxKind): Boolean = js.native
    /**
      * Determines whether the focused {@link Node} matches the supplied predicate.
      * @param predicate A callback used to match the focused {@link Node}.
      * @returns `true` if the focused {@link Node} matches; otherwise, `false`.
      */
    def isMatch(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    
    /**
      * Determines whether this navigator is focused on the same location within the tree as another navigator.
      * @param other The other navigator.
      * @returns `true` if both navigators are focused on the same location within the tree; otherwise, `false`.
      */
    def isSamePosition(other: NodeNavigator): Boolean = js.native
    
    /**
      * Moves the focus of this navigator to the same position within the syntax tree as another navigator.
      * @param other The other navigator.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveTo(other: NodeNavigator): Boolean = js.native
    
    /**
      * Moves the focus of the navigator to the nearest ancestor matching the supplied {@link SyntaxKind}.
      * @param kind The {@link SyntaxKind} that the ancestor must match.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToAncestor(kind: SyntaxKind): Boolean = js.native
    /**
      * Moves the focus of the navigator to the nearest ancestor matching the supplied predicate.
      * @param predicate A callback used to match an ancestor.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToAncestor(predicate: js.Function1[/* ancestor */ Node[SyntaxKind], Boolean]): Boolean = js.native
    
    /**
      * Moves the focus of the navigator to the nearest ancestor matching the supplied predicate. If the current node
      * matches the predicate, the focus does not change.
      * @param kind The {@link SyntaxKind} that the focused {@link Node} or one of its ancestors must match.
      * @returns `true` if the current node matched the predicate or the navigator's focus changed; otherwise, `false`.
      */
    def moveToAncestorOrSelf(kind: SyntaxKind): Boolean = js.native
    /**
      * Moves the focus of the navigator to the nearest ancestor matching the supplied predicate. If the current node
      * matches the predicate, the focus does not change.
      * @param predicate A callback used to match an ancestor.
      * @returns `true` if the current node matched the predicate or the navigator's focus changed; otherwise, `false`.
      */
    def moveToAncestorOrSelf(predicate: js.Function1[/* ancestorOrSelf */ Node[SyntaxKind], Boolean]): Boolean = js.native
    
    /**
      * Moves the focus of the navigator to the parent of the focused {@link Node} if that parent is either a {@link Parameter} or a {@link Production}.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToDeclaration(): Boolean = js.native
    
    /**
      * Moves the focus of the navigator to the first child of the focused {@link Node}.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToFirstChild(): Boolean = js.native
    /**
      * Moves the focus of the navigator to the first child of the focused {@link Node} matching the provided {@link SyntaxKind}.
      * @param kind The {@link SyntaxKind} that the child must match.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToFirstChild(kind: SyntaxKind): Boolean = js.native
    /**
      * Moves the focus of the navigator to the first child of the focused {@link Node} with the provided property name.
      * @param name The name of the property on the focused {@link Node}.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToFirstChild(name: String): Boolean = js.native
    /**
      * Moves the focus of the navigator to the first child of the focused {@link Node} matching the supplied predicate.
      * @param predicate A callback used to match a child node.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToFirstChild(predicate: js.Function1[/* child */ Node[SyntaxKind], Boolean]): Boolean = js.native
    
    /**
      * Moves the focus of the navigator to the first element of the containing array of the focused {@link Node} matching the supplied predicate.
      * @param predicate A callback used to match a node.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToFirstElement(): Boolean = js.native
    /**
      * Moves the focus of the navigator to the first element of the containing array of the focused {@link Node} matching the provided {@link SyntaxKind}.
      * @param kind The {@link SyntaxKind} that the element must match.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToFirstElement(kind: SyntaxKind): Boolean = js.native
    def moveToFirstElement(predicate: js.Function1[/* element */ Node[SyntaxKind], Boolean]): Boolean = js.native
    
    /**
      * Moves the focus of the navigator to the first sibling of the focused {@link Node}.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToFirstSibling(): Boolean = js.native
    /**
      * Moves the focus of the navigator to the first sibling of the focused {@link Node} matching the provided {@link SyntaxKind}.
      * @param kind The {@link SyntaxKind} that the sibling must match.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToFirstSibling(kind: SyntaxKind): Boolean = js.native
    /**
      * Moves the focus of the navigator to the first sibling of the focused {@link Node} with the provided property name.
      * @param name The name of a property on the parent of the focused {@link Node}.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToFirstSibling(name: String): Boolean = js.native
    /**
      * Moves the focus of the navigator to the first sibling of the focused {@link Node} that matches the provided predicate.
      * @param predicate A callback used to match a sibling node.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToFirstSibling(predicate: js.Function1[/* sibling */ Node[SyntaxKind], Boolean]): Boolean = js.native
    
    /**
      * Moves the focus of the navigator to the last child of the focused {@link Node}.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToLastChild(): Boolean = js.native
    /**
      * Moves the focus of the navigator to the last child of the focused {@link Node} matching the provided {@link SyntaxKind}.
      * @param kind The {@link SyntaxKind} that the child must match.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToLastChild(kind: SyntaxKind): Boolean = js.native
    /**
      * Moves the focus of the navigator to the last child of the focused {@link Node} with the provided property name.
      * @param name The name of the property on the focused {@link Node}.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToLastChild(name: String): Boolean = js.native
    /**
      * Moves the focus of the navigator to the last child of the focused {@link Node} matching the supplied predicate.
      * @param predicate A callback used to match a child node.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToLastChild(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    
    /**
      * Moves the focus of the navigator to the last element of the containing array of the focused {@link Node} matching the supplied predicate.
      * @param predicate A callback used to match a node.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToLastElement(): Boolean = js.native
    /**
      * Moves the focus of the navigator to the last element of the containing array of the focused {@link Node} matching the provided {@link SyntaxKind}.
      * @param kind The {@link SyntaxKind} that the element must match.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToLastElement(kind: SyntaxKind): Boolean = js.native
    def moveToLastElement(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    
    /**
      * Moves the focus of the navigator to the last sibling of the focused {@link Node}.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToLastSibling(): Boolean = js.native
    /**
      * Moves the focus of the navigator to the last sibling of the focused {@link Node} matching the provided {@link SyntaxKind}.
      * @param kind The {@link SyntaxKind} that the sibling must match.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToLastSibling(kind: SyntaxKind): Boolean = js.native
    /**
      * Moves the focus of the navigator to the last sibling of the focused {@link Node} with the provided property name.
      * @param name The name of a property on the parent of the focused {@link Node}.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToLastSibling(name: String): Boolean = js.native
    /**
      * Moves the focus of the navigator to the last sibling of the focused {@link Node} that matches the provided predicate.
      * @param predicate A callback used to match a sibling node.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToLastSibling(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    
    /**
      * Moves the focus of the navigator to the nearest {@link Identifier}.
      * @returns `true` if the current node is an {@link Identifier} or the navigator's focus changed; otherwise, `false`.
      * @remarks
      * The "nearest {@link Identifier}" is determined using the following rules:
      * <ul>
      * <li>If the focus or its nearest ancestor is a {@link Parameter}, move to the `name` of the {@link Parameter}.</li>
      * <li>If the focus or its nearest ancestor is an {@link Argument}, move to the `name` of the {@link Argument}.</li>
      * <li>If the focus or its nearest ancestor is a {@link Nonterminal}, move to the `name` of the {@link Nonterminal}.</li>
      * <li>If the focus or its nearest ancestor is a {@link LexicalGoalAssertion}, move to the `symbol` of the of the {@link LexicalGoalAssertion}.</li>
      * <li>If the focus or its nearest ancestor is a {@link Define}, move to the `key` of the {@link Define}.</li>
      * <li>If the focus or its nearest ancestor is a {@link Constraints}, move to the `name` of the of the first {@link Argument} of the {@link Constraints}.</li>
      * <li>If the focus is not within the `body` of a {@link Production} and the focus or its nearest ancestor is a {@link Production}, move to the `name` of the {@link Production}.</li>
      * </ul>
      */
    def moveToName(): Boolean = js.native
    
    /**
      * Moves the focus of the navigator to the next element in the containing array of the focused {@link Node} matching the supplied predicate.
      * @param predicate A callback used to match a node.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToNextElement(): Boolean = js.native
    /**
      * Moves the focus of the navigator to the next element in the containing array of the focused {@link Node} matching the provided {@link SyntaxKind}.
      * @param kind The {@link SyntaxKind} that the element must match.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToNextElement(kind: SyntaxKind): Boolean = js.native
    def moveToNextElement(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    
    /**
      * Moves the focus of the navigator to the next sibling of the focused {@link Node}.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToNextSibling(): Boolean = js.native
    /**
      * Moves the focus of the navigator to the next sibling of the focused {@link Node} matching the provided {@link SyntaxKind}.
      * @param kind The {@link SyntaxKind} that the sibling must match.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToNextSibling(kind: SyntaxKind): Boolean = js.native
    /**
      * Moves the focus of the navigator to the next sibling of the focused {@link Node} with the provided property name.
      * @param name The name of a property on the parent of the focused {@link Node}.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToNextSibling(name: String): Boolean = js.native
    /**
      * Moves the focus of the navigator to the next sibling of the focused {@link Node} that matches the provided predicate.
      * @param predicate A callback used to match a sibling node.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToNextSibling(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    
    /**
      * Moves the focus of the navigator to the parent {@link Node} of the focused {@link Node}.
      * @param predicate An optional callback that determines whether the focus should move to the parent node.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToParent(): Boolean = js.native
    /**
      * Moves the focus of the navigator to the parent {@link Node} of the focused {@link Node}.
      * @param kind The required {@link SyntaxKind} of the parent node.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToParent(kind: SyntaxKind): Boolean = js.native
    def moveToParent(predicate: js.Function1[/* parent */ Node[SyntaxKind], Boolean]): Boolean = js.native
    
    /**
      * Moves the focus of the navigator to the {@link Node} that contains the provided [Position](xref:grammarkdown!Position:interface).
      * @param position The [Position](xref:grammarkdown!Position:interface) at which to focus the navigator.
      * @param outermost When `true`, moves to the outermost node containing the provided position.
      * When `false` or not specified, moves to the innermost node containing the provided position.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToPosition(position: Position): Boolean = js.native
    def moveToPosition(position: Position, outermost: Boolean): Boolean = js.native
    
    /**
      * Moves the focus of the navigator to the previous element in the containing array of the focused {@link Node} matching the supplied predicate.
      * @param predicate A callback used to match a node.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToPreviousElement(): Boolean = js.native
    /**
      * Moves the focus of the navigator to the previous element in the containing array of the focused {@link Node} matching the provided {@link SyntaxKind}.
      * @param kind The {@link SyntaxKind} that the element must match.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToPreviousElement(kind: SyntaxKind): Boolean = js.native
    def moveToPreviousElement(predicate: js.Function1[/* node */ Node[SyntaxKind], Boolean]): Boolean = js.native
    
    /**
      * Moves the focus of the navigator to the previous sibling of the focused {@link Node}.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToPreviousSibling(): Boolean = js.native
    /**
      * Moves the focus of the navigator to the previous sibling of the focused {@link Node} matching the provided {@link SyntaxKind}.
      * @param kind The {@link SyntaxKind} that the sibling must match.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToPreviousSibling(kind: SyntaxKind): Boolean = js.native
    /**
      * Moves the focus of the navigator to the previous sibling of the focused {@link Node} with the provided property name.
      * @param name The name of a property on the parent of the focused {@link Node}.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToPreviousSibling(name: String): Boolean = js.native
    /**
      * Moves the focus of the navigator to the previous sibling of the focused {@link Node} that matches the provided predicate.
      * @param predicate A callback used to match a sibling node.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToPreviousSibling(predicate: js.Function1[/* sibling */ Node[SyntaxKind], Boolean]): Boolean = js.native
    
    /**
      * Moves the focus of the navigator to the root of the syntax tree.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToRoot(): Boolean = js.native
    
    /**
      * Moves the focus of the navigator to the parent of the focused {@link Node} if that parent is a {@link SourceElement}.
      * @returns `true` if the navigator's focus changed; otherwise, `false`.
      */
    def moveToSourceElement(): Boolean = js.native
  }
}
