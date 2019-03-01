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
    (js.Function1[/* data */ js.Object, _]) | (org.scalablytyped.runtime.StringDictionary[js.Function1[/* data */ js.Object, _]])
  ] = js.undefined
  var resolve: js.UndefOr[js.Function1[/* data */ js.Any, scala.Boolean]] = js.undefined
  var styleAliases: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object TypeConstructorOptions {
  @scala.inline
  def apply(
    construct: js.Function1[/* data */ js.Any, _] = null,
    defaultStyle: java.lang.String = null,
    instanceOf: js.Object = null,
    kind: jsDashYamlLib.jsDashYamlLibStrings.sequence | jsDashYamlLib.jsDashYamlLibStrings.scalar | jsDashYamlLib.jsDashYamlLibStrings.mapping = null,
    predicate: java.lang.String = null,
    represent: (js.Function1[/* data */ js.Object, _]) | (org.scalablytyped.runtime.StringDictionary[js.Function1[/* data */ js.Object, _]]) = null,
    resolve: js.Function1[/* data */ js.Any, scala.Boolean] = null,
    styleAliases: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): TypeConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (construct != null) __obj.updateDynamic("construct")(construct)
    if (defaultStyle != null) __obj.updateDynamic("defaultStyle")(defaultStyle)
    if (instanceOf != null) __obj.updateDynamic("instanceOf")(instanceOf)
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (predicate != null) __obj.updateDynamic("predicate")(predicate)
    if (represent != null) __obj.updateDynamic("represent")(represent.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (styleAliases != null) __obj.updateDynamic("styleAliases")(styleAliases)
    __obj.asInstanceOf[TypeConstructorOptions]
  }
}

