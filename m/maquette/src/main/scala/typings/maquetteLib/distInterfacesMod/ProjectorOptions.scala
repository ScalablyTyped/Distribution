package typings
package maquetteLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectorOptions extends js.Object {
  /**
    * Can be used to log performance metrics
    */
  var performanceLogger: js.UndefOr[ProjectorPerformanceLogger] = js.undefined
  /**
    * May be used to add vendor prefixes when applying inline styles when needed.
    * This function is called when [[styles]] is used.
    * This function should execute `domNode.style[styleName] = value` or do something smarter.
    *
    * @param domNode   The DOM Node that needs to receive the style
    * @param styleName The name of the style that should be applied, for example `transform`.
    * @param value     The value of this style, for example `rotate(45deg)`.
    */
  var styleApplyer: js.UndefOr[
    js.Function3[
      /* domNode */ stdLib.HTMLElement, 
      /* styleName */ java.lang.String, 
      /* value */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
}

