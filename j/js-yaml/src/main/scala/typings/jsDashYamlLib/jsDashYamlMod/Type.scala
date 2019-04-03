package typings
package jsDashYamlLib.jsDashYamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-yaml", "Type")
@js.native
class Type protected () extends js.Object {
  def this(tag: java.lang.String) = this()
  def this(tag: java.lang.String, opts: TypeConstructorOptions) = this()
  var defaultStyle: java.lang.String | scala.Null = js.native
  var instanceOf: js.Object | scala.Null = js.native
  var kind: jsDashYamlLib.jsDashYamlLibStrings.sequence | jsDashYamlLib.jsDashYamlLibStrings.scalar | jsDashYamlLib.jsDashYamlLibStrings.mapping | scala.Null = js.native
  var predicate: (js.Function1[/* data */ js.Object, scala.Boolean]) | scala.Null = js.native
  var represent: (js.Function1[/* data */ js.Object, _]) | (org.scalablytyped.runtime.StringDictionary[js.Function1[/* data */ js.Object, _]]) | scala.Null = js.native
  var styleAliases: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def construct(data: js.Any): js.Any = js.native
  def resolve(data: js.Any): scala.Boolean = js.native
}

