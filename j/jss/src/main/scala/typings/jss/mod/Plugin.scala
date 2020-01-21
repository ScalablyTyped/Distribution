package typings.jss.mod

import typings.jss.jssBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var onChangeValue: js.UndefOr[
    js.Function3[/* value */ String, /* prop */ String, /* rule */ Rule, String | Null | `false`]
  ] = js.undefined
  var onCreateRule: js.UndefOr[
    js.Function3[/* name */ String, /* decl */ JssStyle, /* options */ RuleOptions, Rule]
  ] = js.undefined
  var onProcessRule: js.UndefOr[
    js.Function2[
      /* rule */ Rule, 
      /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
      Unit
    ]
  ] = js.undefined
  var onProcessSheet: js.UndefOr[
    js.Function1[/* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], Unit]
  ] = js.undefined
  var onProcessStyle: js.UndefOr[
    js.Function3[
      /* style */ JssStyle, 
      /* rule */ Rule, 
      /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
      JssStyle
    ]
  ] = js.undefined
  var onUpdate: js.UndefOr[
    js.Function3[
      /* data */ js.Object, 
      /* rule */ Rule, 
      /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
      Unit
    ]
  ] = js.undefined
}

object Plugin {
  @scala.inline
  def apply(
    onChangeValue: (/* value */ String, /* prop */ String, /* rule */ Rule) => String | Null | `false` = null,
    onCreateRule: (/* name */ String, /* decl */ JssStyle, /* options */ RuleOptions) => Rule = null,
    onProcessRule: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => Unit = null,
    onProcessSheet: /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]] => Unit = null,
    onProcessStyle: (/* style */ JssStyle, /* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => JssStyle = null,
    onUpdate: (/* data */ js.Object, /* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => Unit = null
  ): Plugin = {
    val __obj = js.Dynamic.literal()
    if (onChangeValue != null) __obj.updateDynamic("onChangeValue")(js.Any.fromFunction3(onChangeValue))
    if (onCreateRule != null) __obj.updateDynamic("onCreateRule")(js.Any.fromFunction3(onCreateRule))
    if (onProcessRule != null) __obj.updateDynamic("onProcessRule")(js.Any.fromFunction2(onProcessRule))
    if (onProcessSheet != null) __obj.updateDynamic("onProcessSheet")(js.Any.fromFunction1(onProcessSheet))
    if (onProcessStyle != null) __obj.updateDynamic("onProcessStyle")(js.Any.fromFunction3(onProcessStyle))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction3(onUpdate))
    __obj.asInstanceOf[Plugin]
  }
}

