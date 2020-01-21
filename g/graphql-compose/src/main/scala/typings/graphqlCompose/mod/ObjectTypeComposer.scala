package typings.graphqlCompose.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.mod.GraphQLObjectType
import typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposeDefinition
import typings.graphqlCompose.schemaComposerMod.SchemaComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "ObjectTypeComposer")
@js.native
class ObjectTypeComposer[TSource, TContext] protected ()
  extends typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[TSource, TContext] {
  def this(gqType: GraphQLObjectType[_, _, StringDictionary[_]], schemaComposer: SchemaComposer[TContext]) = this()
}

/* static members */
@JSImport("graphql-compose", "ObjectTypeComposer")
@js.native
object ObjectTypeComposer extends js.Object {
  /**
    * Create `ObjectTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TSrc, TCtx](typeDef: ObjectTypeComposeDefinition[TSrc, TCtx], schemaComposer: SchemaComposer[TCtx]): typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[TSrc, TCtx] = js.native
  /**
    * Create `ObjectTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TSrc, TCtx](typeDef: ObjectTypeComposeDefinition[TSrc, TCtx]): typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](typeDef: ObjectTypeComposeDefinition[TSrc, TCtx], schemaComposer: SchemaComposer[TCtx]): typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[TSrc, TCtx] = js.native
}

