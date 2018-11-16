package typings
package atMaterialNotchedDashOutlineLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MDCNotchedOutlineAdapter extends js.Object {
  /**
       * Adds a class to the root element.
       */
  def addClass(className: java.lang.String): scala.Unit
  /**
       * Returns the height of the root element.
       */
  def getHeight(): scala.Double
  /**
       * Returns the idle outline element's computed style value of the given css property `propertyName`.
       * We achieve this via `getComputedStyle(...).getPropertyValue(propertyName)`.
       */
  def getIdleOutlineStyleValue(propertyName: java.lang.String): java.lang.String
  /**
       * Returns the width of the root element.
       */
  def getWidth(): scala.Double
  /**
       * Removes a class from the root element.
       */
  def removeClass(className: java.lang.String): scala.Unit
  /**
       * Sets the "d" attribute of the outline element's SVG path.
       */
  def setOutlinePathAttr(value: java.lang.String): scala.Unit
}

