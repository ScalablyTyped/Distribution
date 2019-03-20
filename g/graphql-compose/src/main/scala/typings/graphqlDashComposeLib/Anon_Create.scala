package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Create
  extends org.scalablytyped.runtime.Instantiable1[
      /* gqType */ graphqlLib.graphqlMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]], 
      graphqlDashComposeLib.libTypeComposerMod.TypeComposer[js.Object, js.Object]
    ] {
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
  def create[TSrc, TCtx](typeDef: graphqlDashComposeLib.libTypeComposerMod.TypeComposerDefinition[TCtx]): graphqlDashComposeLib.libTypeComposerMod.TypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](typeDef: graphqlDashComposeLib.libTypeComposerMod.TypeComposerDefinition[TCtx]): graphqlDashComposeLib.libTypeComposerMod.TypeComposer[TSrc, TCtx] = js.native
}

