package typings
package jsDashYamlLib.jsDashYamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TypeConstructorOptions extends js.Object {
  var construct: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var defaultStyle: js.UndefOr[java.lang.String] = js.undefined
  var instanceOf: js.UndefOr[js.Object] = js.undefined
  var kind: js.UndefOr[
    jsDashYamlLib.jsDashYamlLibStrings.sequence | jsDashYamlLib.jsDashYamlLibStrings.scalar | jsDashYamlLib.jsDashYamlLibStrings.mapping
  ] = js.undefined
  var predicate: js.UndefOr[java.lang.String] = js.undefined
  var represent: js.UndefOr[
    (js.Function1[/* data */ js.Object, _]) | (ScalablyTyped.runtime.StringDictionary[js.Function1[/* data */ js.Object, _]])
  ] = js.undefined
  var resolve: js.UndefOr[js.Function1[/* data */ js.Any, scala.Boolean]] = js.undefined
  var styleAliases: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
}

