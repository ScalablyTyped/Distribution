package typings
package graphqlDashComposeLib.esmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm", "ObjectTypeComposer")
@js.native
class ObjectTypeComposer[TSource, TContext] protected ()
  extends graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[TSource, TContext] {
  def this(gqType: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]], schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext]) = this()
}

/* static members */
@JSImport("graphql-compose/esm", "ObjectTypeComposer")
@js.native
object ObjectTypeComposer extends js.Object {
  /**
    * Create `ObjectTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[TSrc, TCtx] = js.native
  /**
    * Create `ObjectTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TSrc, TCtx](typeDef: graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposeDefinition[TSrc, TCtx]): graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[TSrc, TCtx] = js.native
}

