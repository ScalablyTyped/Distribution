package typings
package graphqlDashComposeLib.graphqlDashComposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "TypeComposerClass")
@js.native
class TypeComposerClass[TSource, TContext] protected ()
  extends graphqlDashComposeLib.libTypeComposerMod.TypeComposer[TSource, TContext] {
  def this(gqType: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]) = this()
}

/* static members */
@JSImport("graphql-compose", "TypeComposerClass")
@js.native
object TypeComposerClass extends js.Object {
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
  def create[TSrc, TCtx](typeDef: graphqlDashComposeLib.libTypeComposerMod.TypeComposerDefinition[TCtx]): graphqlDashComposeLib.libTypeComposerMod.TypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](typeDef: graphqlDashComposeLib.libTypeComposerMod.TypeComposerDefinition[TCtx]): graphqlDashComposeLib.libTypeComposerMod.TypeComposer[TSrc, TCtx] = js.native
}

