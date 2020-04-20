package typings.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object visitorMod {
  type ASTVisitor = typings.graphql.visitorMod.Visitor[
    typings.graphql.astMod.ASTKindToNode, 
    typings.graphql.astMod.EnumValueDefinitionNode | typings.graphql.astMod.ObjectValueNode | typings.graphql.astMod.FieldDefinitionNode | typings.graphql.astMod.SchemaDefinitionNode | typings.graphql.astMod.InputObjectTypeDefinitionNode | typings.graphql.astMod.DocumentNode | typings.graphql.astMod.DirectiveDefinitionNode | typings.graphql.astMod.InputValueDefinitionNode | typings.graphql.astMod.ListValueNode | typings.graphql.astMod.ScalarTypeDefinitionNode | typings.graphql.astMod.IntValueNode | typings.graphql.astMod.OperationDefinitionNode | typings.graphql.astMod.ArgumentNode | typings.graphql.astMod.FragmentDefinitionNode | typings.graphql.astMod.OperationTypeDefinitionNode | typings.graphql.astMod.FieldNode | typings.graphql.astMod.StringValueNode | typings.graphql.astMod.NameNode | typings.graphql.astMod.ObjectFieldNode | typings.graphql.astMod.EnumValueNode | typings.graphql.astMod.SchemaExtensionNode | typings.graphql.astMod.UnionTypeExtensionNode | typings.graphql.astMod.VariableDefinitionNode | typings.graphql.astMod.VariableNode | typings.graphql.astMod.ObjectTypeDefinitionNode | typings.graphql.astMod.EnumTypeExtensionNode | typings.graphql.astMod.InterfaceTypeDefinitionNode | typings.graphql.astMod.FloatValueNode | typings.graphql.astMod.NonNullTypeNode | typings.graphql.astMod.DirectiveNode | typings.graphql.astMod.SelectionSetNode | typings.graphql.astMod.InputObjectTypeExtensionNode | typings.graphql.astMod.ScalarTypeExtensionNode | typings.graphql.astMod.UnionTypeDefinitionNode | typings.graphql.astMod.NullValueNode | typings.graphql.astMod.InterfaceTypeExtensionNode | typings.graphql.astMod.InlineFragmentNode | typings.graphql.astMod.EnumTypeDefinitionNode | typings.graphql.astMod.NamedTypeNode | typings.graphql.astMod.BooleanValueNode | typings.graphql.astMod.ListTypeNode | typings.graphql.astMod.ObjectTypeExtensionNode | typings.graphql.astMod.FragmentSpreadNode
  ]
  // TODO: Should be `[]`, but that requires TypeScript@3
  type EmptyTuple = js.Array[scala.Nothing]
  type EnterLeaveVisitor[KindToNode, Nodes] = typings.graphql.visitorMod.EnterLeave[
    (typings.graphql.visitorMod.VisitFn[Nodes, Nodes]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof KindToNode ]:? graphql.graphql/language/visitor.VisitFn<Nodes, KindToNode[K]>}
    */ typings.graphql.graphqlStrings.EnterLeaveVisitor with org.scalablytyped.runtime.TopLevel[KindToNode])
  ]
  type ShapeMapVisitor[KindToNode, Nodes] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof KindToNode ]:? graphql.graphql/language/visitor.VisitFn<Nodes, KindToNode[K]> | graphql.graphql/language/visitor.EnterLeave<graphql.graphql/language/visitor.VisitFn<Nodes, KindToNode[K]>>}
    */ typings.graphql.graphqlStrings.ShapeMapVisitor with org.scalablytyped.runtime.TopLevel[js.Any]
  type VisitFn[TAnyNode, TVisitedNode] = js.Function5[
    /* node */ TVisitedNode, 
    /* key */ js.UndefOr[java.lang.String | scala.Double], 
    /* parent */ js.UndefOr[TAnyNode | js.Array[TAnyNode]], 
    /* path */ js.Array[java.lang.String | scala.Double], 
    /* ancestors */ js.Array[TAnyNode | js.Array[TAnyNode]], 
    js.Any
  ]
  type Visitor[KindToNode, Nodes] = (typings.graphql.visitorMod.EnterLeaveVisitor[KindToNode, Nodes]) | (typings.graphql.visitorMod.ShapeMapVisitor[KindToNode, Nodes])
  type VisitorKeyMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.ReadonlyArray<keyof T[P]>}
    */ typings.graphql.graphqlStrings.VisitorKeyMap with org.scalablytyped.runtime.TopLevel[js.Any]
}
