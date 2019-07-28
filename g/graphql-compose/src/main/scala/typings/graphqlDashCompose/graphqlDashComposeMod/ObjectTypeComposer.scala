package typings.graphqlDashCompose.graphqlDashComposeMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLObjectType
import typings.graphqlDashCompose.libObjectTypeComposerMod.ObjectTypeComposeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "ObjectTypeComposer")
@js.native
class ObjectTypeComposer[TSource, TContext] protected ()
  extends typings.graphqlDashCompose.libObjectTypeComposerMod.ObjectTypeComposer[TSource, TContext] {
  def this(
    gqType: GraphQLObjectType[_, _, StringDictionary[_]],
    schemaComposer: typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TContext]
  ) = this()
}

/* static members */
@JSImport("graphql-compose", "ObjectTypeComposer")
@js.native
object ObjectTypeComposer extends js.Object {
  /**
    * Create `ObjectTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TSrc, TCtx](
    typeDef: ObjectTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.libObjectTypeComposerMod.ObjectTypeComposer[TSrc, TCtx] = js.native
  /**
    * Create `ObjectTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TSrc, TCtx](typeDef: ObjectTypeComposeDefinition[TSrc, TCtx]): typings.graphqlDashCompose.libObjectTypeComposerMod.ObjectTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](
    typeDef: ObjectTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.libObjectTypeComposerMod.ObjectTypeComposer[TSrc, TCtx] = js.native
}

