package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Resolvers extends js.Object {
  var inheritResolversFromInterfaces: js.UndefOr[scala.Boolean] = js.undefined
  var onTypeConflict: js.UndefOr[graphqlDashToolsLib.distStitchingMergeSchemasMod.OnTypeConflict] = js.undefined
  var resolvers: js.UndefOr[graphqlDashToolsLib.distInterfacesMod.IResolversParameter] = js.undefined
  var schemaDirectives: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[
      ScalablyTyped.runtime.Instantiable1[
        /* config */ Anon_Name, 
        graphqlDashToolsLib.distSchemaVisitorMod.SchemaDirectiveVisitor
      ]
    ]
  ] = js.undefined
  var schemas: js.Array[
    java.lang.String | graphqlLib.graphqlMod.GraphQLSchema | js.Array[graphqlLib.typeDefinitionMod.GraphQLNamedType]
  ]
}

