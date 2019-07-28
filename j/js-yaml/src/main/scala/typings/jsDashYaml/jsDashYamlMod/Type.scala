package typings.jsDashYaml.jsDashYamlMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsDashYaml.jsDashYamlStrings.mapping
import typings.jsDashYaml.jsDashYamlStrings.scalar
import typings.jsDashYaml.jsDashYamlStrings.sequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-yaml", "Type")
@js.native
class Type protected () extends js.Object {
  def this(tag: String) = this()
  def this(tag: String, opts: TypeConstructorOptions) = this()
  var defaultStyle: String | Null = js.native
  var instanceOf: js.Object | Null = js.native
  var kind: sequence | scalar | mapping | Null = js.native
  var predicate: (js.Function1[/* data */ js.Object, Boolean]) | Null = js.native
  var represent: (js.Function1[/* data */ js.Object, _]) | (StringDictionary[js.Function1[/* data */ js.Object, _]]) | Null = js.native
  var styleAliases: StringDictionary[js.Any] = js.native
  def construct(data: js.Any): js.Any = js.native
  def resolve(data: js.Any): Boolean = js.native
}

