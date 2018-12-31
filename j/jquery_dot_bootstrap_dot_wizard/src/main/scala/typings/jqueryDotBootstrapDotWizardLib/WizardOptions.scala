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

