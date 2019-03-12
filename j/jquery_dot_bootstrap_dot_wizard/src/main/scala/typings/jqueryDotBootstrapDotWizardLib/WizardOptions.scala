package typings
package jqueryDotBootstrapDotWizardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WizardOptions extends js.Object {
  var firstSelector: js.UndefOr[java.lang.String] = js.undefined
  var lastSelector: js.UndefOr[java.lang.String] = js.undefined
  var nextSelector: js.UndefOr[java.lang.String] = js.undefined
  var onFirst: js.UndefOr[
    js.Function3[
      /* activeTab */ js.Any, 
      /* navigation */ js.Any, 
      /* firstIndex */ scala.Double, 
      scala.Boolean
    ]
  ] = js.undefined
  var onInit: js.UndefOr[
    js.Function3[
      /* activeTab */ js.Any, 
      /* navigation */ js.Any, 
      /* currentIndex */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var onLast: js.UndefOr[
    js.Function3[
      /* activeTab */ js.Any, 
      /* navigation */ js.Any, 
      /* lastIndex */ scala.Double, 
      scala.Boolean
    ]
  ] = js.undefined
  var onNext: js.UndefOr[
    js.Function3[
      /* activeTab */ js.Any, 
      /* navigation */ js.Any, 
      /* nextIndex */ scala.Double, 
      scala.Boolean
    ]
  ] = js.undefined
  var onPrevious: js.UndefOr[
    js.Function3[
      /* activeTab */ js.Any, 
      /* navigation */ js.Any, 
      /* previousIndex */ scala.Double, 
      scala.Boolean
    ]
  ] = js.undefined
  var onShow: js.UndefOr[
    js.Function3[
      /* activeTab */ js.Any, 
      /* navigation */ js.Any, 
      /* nextIndex */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var onTabClick: js.UndefOr[
    js.Function3[
      /* activeTab */ js.Any, 
      /* navigation */ js.Any, 
      /* currentIndex */ scala.Double, 
      scala.Boolean
    ]
  ] = js.undefined
  var onTabShow: js.UndefOr[
    js.Function3[
      /* activeTab */ js.Any, 
      /* navigation */ js.Any, 
      /* currentIndex */ scala.Double, 
      scala.Boolean
    ]
  ] = js.undefined
  var previousSelector: js.UndefOr[java.lang.String] = js.undefined
  var tabClass: js.UndefOr[java.lang.String] = js.undefined
}

object WizardOptions {
  @scala.inline
  def apply(
    firstSelector: java.lang.String = null,
    lastSelector: java.lang.String = null,
    nextSelector: java.lang.String = null,
    onFirst: (/* activeTab */ js.Any, /* navigation */ js.Any, /* firstIndex */ scala.Double) => scala.Boolean = null,
    onInit: (/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ scala.Double) => scala.Unit = null,
    onLast: (/* activeTab */ js.Any, /* navigation */ js.Any, /* lastIndex */ scala.Double) => scala.Boolean = null,
    onNext: (/* activeTab */ js.Any, /* navigation */ js.Any, /* nextIndex */ scala.Double) => scala.Boolean = null,
    onPrevious: (/* activeTab */ js.Any, /* navigation */ js.Any, /* previousIndex */ scala.Double) => scala.Boolean = null,
    onShow: (/* activeTab */ js.Any, /* navigation */ js.Any, /* nextIndex */ scala.Double) => scala.Unit = null,
    onTabClick: (/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ scala.Double) => scala.Boolean = null,
    onTabShow: (/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ scala.Double) => scala.Boolean = null,
    previousSelector: java.lang.String = null,
    tabClass: java.lang.String = null
  ): WizardOptions = {
    val __obj = js.Dynamic.literal()
    if (firstSelector != null) __obj.updateDynamic("firstSelector")(firstSelector)
    if (lastSelector != null) __obj.updateDynamic("lastSelector")(lastSelector)
    if (nextSelector != null) __obj.updateDynamic("nextSelector")(nextSelector)
    if (onFirst != null) __obj.updateDynamic("onFirst")(js.Any.fromFunction3(onFirst))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction3(onInit))
    if (onLast != null) __obj.updateDynamic("onLast")(js.Any.fromFunction3(onLast))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction3(onNext))
    if (onPrevious != null) __obj.updateDynamic("onPrevious")(js.Any.fromFunction3(onPrevious))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction3(onShow))
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction3(onTabClick))
    if (onTabShow != null) __obj.updateDynamic("onTabShow")(js.Any.fromFunction3(onTabShow))
    if (previousSelector != null) __obj.updateDynamic("previousSelector")(previousSelector)
    if (tabClass != null) __obj.updateDynamic("tabClass")(tabClass)
    __obj.asInstanceOf[WizardOptions]
  }
}

