package typings
package graphqlDashToolsLib.distMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/mock", "MockList")
@js.native
class MockList protected () extends js.Object {
  def this(len: js.Array[scala.Double]) = this()
  def this(len: scala.Double) = this()
  def this(len: js.Array[scala.Double], wrappedFunction: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]]) = this()
  def this(len: scala.Double, wrappedFunction: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]]) = this()
  var len: js.Any = js.native
  var randint: js.Any = js.native
  var wrappedFunction: js.Any = js.native
  def mock(
    root: js.Any,
    args: ScalablyTyped.runtime.StringDictionary[js.Any],
    context: js.Any,
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    fieldType: graphqlLib.typeDefinitionMod.GraphQLList[_],
    mockTypeFunc: graphqlDashToolsLib.distInterfacesMod.IMockTypeFn
  ): js.Array[_] = js.native
}

