package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CreateCreateTempGqTypeSchemaComposerTypeDef
  extends org.scalablytyped.runtime.Instantiable1[
      /* gqType */ graphqlLib.graphqlMod.GraphQLUnionType, 
      graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[js.Object, js.Object]
    ] {
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
  def create[TSrc, TCtx](typeDef: graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposerDefinition[TCtx]): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](typeDef: graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposerDefinition[TCtx]): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
}

