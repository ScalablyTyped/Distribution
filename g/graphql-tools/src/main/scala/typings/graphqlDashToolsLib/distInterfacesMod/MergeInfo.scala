package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeInfo extends js.Object {
  var delegate: js.Function6[
    /* type */ graphqlDashToolsLib.graphqlDashToolsLibStrings.query | graphqlDashToolsLib.graphqlDashToolsLibStrings.mutation | graphqlDashToolsLib.graphqlDashToolsLibStrings.subscription, 
    /* fieldName */ java.lang.String, 
    /* args */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* context */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
    /* transforms */ js.UndefOr[js.Array[Transform]], 
    _
  ]
  var fragments: js.Array[graphqlDashToolsLib.Anon_Fragment]
  def delegateToSchema[TContext](options: IDelegateToSchemaOptions[TContext]): js.Any
}

