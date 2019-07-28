package typings.graphqlDashExtensions

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphqlDashExtensionsMod {
  type EndHandler = js.Function1[/* repeated */ Error, Unit]
  type FieldIteratorFn = js.Function3[
    /* fieldDef */ GraphQLField[js.Any, js.Any, StringDictionary[js.Any]], 
    /* typeName */ String, 
    /* fieldName */ String, 
    Unit
  ]
}
