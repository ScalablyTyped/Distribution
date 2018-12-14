package typings
package graphqlDashExtensionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphqlDashExtensionsMod {
  type EndHandler = js.Function1[/* repeated */nodeLib.Error, scala.Unit]
  type FieldIteratorFn = js.Function3[
    /* fieldDef */ graphqlLib.typeDefinitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]], 
    /* typeName */ java.lang.String, 
    /* fieldName */ java.lang.String, 
    scala.Unit
  ]
}
