package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CreateCreateTempGqTypeSchemaComposer
  extends org.scalablytyped.runtime.Instantiable1[
      /* gqType */ graphqlLib.graphqlMod.GraphQLInterfaceType, 
      graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[js.Object, js.Object]
    ] {
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
  def create[TSrc, TCtx](typeDef: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposerDefinition[TCtx]): graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](typeDef: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposerDefinition[TCtx]): graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
}

