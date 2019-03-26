package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object languageVisitorMod {
  type ASTVisitor = Visitor[
    graphqlLib.languageAstMod.ASTKindToNode, 
    graphqlLib.languageAstMod.UnionTypeDefinitionNode | graphqlLib.languageAstMod.FragmentSpreadNode | graphqlLib.languageAstMod.OperationDefinitionNode | graphqlLib.languageAstMod.EnumTypeDefinitionNode | graphqlLib.languageAstMod.StringValueNode | graphqlLib.languageAstMod.ArgumentNode | graphqlLib.languageAstMod.BooleanValueNode | graphqlLib.languageAstMod.NameNode | graphqlLib.languageAstMod.FieldDefinitionNode | graphqlLib.languageAstMod.ObjectTypeDefinitionNode | graphqlLib.languageAstMod.EnumValueDefinitionNode | graphqlLib.languageAstMod.FloatValueNode | graphqlLib.languageAstMod.NullValueNode | graphqlLib.languageAstMod.DirectiveNode | graphqlLib.languageAstMod.VariableNode | graphqlLib.languageAstMod.ScalarTypeExtensionNode | graphqlLib.languageAstMod.IntValueNode | graphqlLib.languageAstMod.SchemaExtensionNode | graphqlLib.languageAstMod.DirectiveDefinitionNode | graphqlLib.languageAstMod.InputObjectTypeExtensionNode | graphqlLib.languageAstMod.ScalarTypeDefinitionNode | graphqlLib.languageAstMod.UnionTypeExtensionNode | graphqlLib.languageAstMod.FragmentDefinitionNode | graphqlLib.languageAstMod.SelectionSetNode | graphqlLib.languageAstMod.NamedTypeNode | graphqlLib.languageAstMod.VariableDefinitionNode | graphqlLib.languageAstMod.EnumTypeExtensionNode | graphqlLib.languageAstMod.ObjectValueNode | graphqlLib.languageAstMod.OperationTypeDefinitionNode | graphqlLib.languageAstMod.EnumValueNode | graphqlLib.languageAstMod.ObjectFieldNode | graphqlLib.languageAstMod.FieldNode | graphqlLib.languageAstMod.InputObjectTypeDefinitionNode | graphqlLib.languageAstMod.InputValueDefinitionNode | graphqlLib.languageAstMod.NonNullTypeNode | graphqlLib.languageAstMod.InlineFragmentNode | graphqlLib.languageAstMod.InterfaceTypeDefinitionNode | graphqlLib.languageAstMod.ListTypeNode | graphqlLib.languageAstMod.InterfaceTypeExtensionNode | graphqlLib.languageAstMod.ListValueNode | graphqlLib.languageAstMod.SchemaDefinitionNode | graphqlLib.languageAstMod.ObjectTypeExtensionNode | graphqlLib.languageAstMod.DocumentNode
  ]
  type EnterLeaveVisitor[KindToNode, Nodes] = EnterLeave[
    (VisitFn[Nodes, Nodes]) | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof KindToNode ]:? graphql.graphql/language/visitor.VisitFn<Nodes, KindToNode[K]>}
    */ graphqlLib.graphqlLibStrings.EnterLeaveVisitor with KindToNode)
  ]
  type ShapeMapVisitor[KindToNode, Nodes] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof KindToNode ]:? graphql.graphql/language/visitor.VisitFn<Nodes, KindToNode[K]> | graphql.graphql/language/visitor.EnterLeave<graphql.graphql/language/visitor.VisitFn<Nodes, KindToNode[K]>>}
    */ graphqlLib.graphqlLibStrings.ShapeMapVisitor with js.Any
  type VisitFn[TAnyNode, TVisitedNode] = js.Function5[
    /* node */ TVisitedNode, 
    /* key */ js.UndefOr[java.lang.String | scala.Double], 
    /* parent */ js.UndefOr[TAnyNode | js.Array[TAnyNode]], 
    /* path */ js.Array[java.lang.String | scala.Double], 
    /* ancestors */ js.Array[TAnyNode | js.Array[TAnyNode]], 
    js.Any
  ]
  type Visitor[KindToNode, Nodes] = (EnterLeaveVisitor[KindToNode, Nodes]) | (ShapeMapVisitor[KindToNode, Nodes])
  type VisitorKeyMap[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.ReadonlyArray<keyof T[P]>}
    */ graphqlLib.graphqlLibStrings.VisitorKeyMap with T
}
