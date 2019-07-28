package typings.jsDashYaml.jsDashYamlMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsDashYaml.jsDashYamlStrings.mapping
import typings.jsDashYaml.jsDashYamlStrings.scalar
import typings.jsDashYaml.jsDashYamlStrings.sequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeConstructorOptions extends js.Object {
  var construct: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var defaultStyle: js.UndefOr[String] = js.undefined
  var instanceOf: js.UndefOr[js.Object] = js.undefined
  var kind: js.UndefOr[sequence | scalar | mapping] = js.undefined
  var predicate: js.UndefOr[js.Function1[/* data */ js.Object, Boolean]] = js.undefined
  var represent: js.UndefOr[
    (js.Function1[/* data */ js.Object, _]) | (StringDictionary[js.Function1[/* data */ js.Object, _]])
  ] = js.undefined
  var resolve: js.UndefOr[js.Function1[/* data */ js.Any, Boolean]] = js.undefined
  var styleAliases: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object TypeConstructorOptions {
  @scala.inline
  def apply(
    construct: /* data */ js.Any => _ = null,
    defaultStyle: String = null,
    instanceOf: js.Object = null,
    kind: sequence | scalar | mapping = null,
    predicate: /* data */ js.Object => Boolean = null,
    represent: (js.Function1[/* data */ js.Object, _]) | (StringDictionary[js.Function1[/* data */ js.Object, _]]) = null,
    resolve: /* data */ js.Any => Boolean = null,
    styleAliases: StringDictionary[js.Any] = null
  ): TypeConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (construct != null) __obj.updateDynamic("construct")(js.Any.fromFunction1(construct))
    if (defaultStyle != null) __obj.updateDynamic("defaultStyle")(defaultStyle)
    if (instanceOf != null) __obj.updateDynamic("instanceOf")(instanceOf)
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (predicate != null) __obj.updateDynamic("predicate")(js.Any.fromFunction1(predicate))
    if (represent != null) __obj.updateDynamic("represent")(represent.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction1(resolve))
    if (styleAliases != null) __obj.updateDynamic("styleAliases")(styleAliases)
    __obj.asInstanceOf[TypeConstructorOptions]
  }
}

