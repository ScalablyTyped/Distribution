package typings
package materialDashDesignDashLiteLib.MaterialDesignLiteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentHandler extends js.Object {
  /**
           * Downgrade either a given node, an array of nodes, or a NodeList.
           *
           * @param {!Array<!Node>} nodes The list of nodes.
           */
  def downgradeElements(nodes: js.Array[stdLib.Node]): scala.Unit = js.native
  /**
           * Downgrade either a given node, an array of nodes, or a NodeList.
           *
           * @param {!Node} nodes The list of nodes.
           */
  def downgradeElements(nodes: stdLib.Node): scala.Unit = js.native
  /**
           * Downgrade either a given node, an array of nodes, or a NodeList.
           *
           * @param {!NodeList} nodes The list of nodes.
           */
  def downgradeElements(nodes: stdLib.NodeList): scala.Unit = js.native
  /**
           * Registers a class for future use and attempts to upgrade existing DOM.
           *
           * @param {componentHandler.ComponentConfigPublic} config the registration configuration
           */
  def register(config: ComponentConfigPublic): scala.Unit = js.native
  /**
           * Allows user to be alerted to any upgrades that are performed for a given
           * component type
           *
           * @param {string} jsClass The class name of the MDL component we wish
           * to hook into for any upgrades performed.
           * @param {function(!HTMLElement)} callback The function to call upon an
           * upgrade. This function should expect 1 parameter - the HTMLElement which
           * got upgraded.
           */
  def registerUpgradedCallback(jsClass: java.lang.String, callback: js.Function1[/* element */ stdLib.HTMLElement, _]): scala.Unit = js.native
  /**
           * Upgrades all registered components found in the current DOM. This is
           * automatically called on window load.
           */
  def upgradeAllRegistered(): scala.Unit = js.native
  /**
           * Searches existing DOM for elements of our component type and upgrades them
           * if they have not already been upgraded.
           */
  def upgradeDom(): scala.Unit = js.native
  /**
           * Searches existing DOM for elements of our component type and upgrades them
           * if they have not already been upgraded.
           *
           * @param {string} jsClass the programatic name of the element class we
           * need to create a new instance of.
           */
  def upgradeDom(jsClass: java.lang.String): scala.Unit = js.native
  /**
           * Searches existing DOM for elements of our component type and upgrades them
           * if they have not already been upgraded.
           *
           * @param {string} jsClass the programatic name of the element class we
           * need to create a new instance of.
           * @param {string} cssClass the name of the CSS class elements of this
           * type will have.
           */
  def upgradeDom(jsClass: java.lang.String, cssClass: java.lang.String): scala.Unit = js.native
  /**
           * Upgrades a specific element rather than all in the DOM.
           *
           * @param {!Element} element The element we wish to upgrade.
           */
  def upgradeElement(element: stdLib.HTMLElement): scala.Unit = js.native
  /**
           * Upgrades a specific element rather than all in the DOM.
           *
           * @param {!Element} element The element we wish to upgrade.
           * @param {string} jsClass Optional name of the class we want to upgrade
           * the element to.
           */
  def upgradeElement(element: stdLib.HTMLElement, jsClass: java.lang.String): scala.Unit = js.native
  /**
           * Upgrades a specific list of elements rather than all in the DOM.
           *
           * @param {!Array<!Element>} elements
           * The elements we wish to upgrade.
           */
  def upgradeElements(elements: js.Array[stdLib.HTMLElement]): scala.Unit = js.native
  /**
           * Upgrades a specific list of elements rather than all in the DOM.
           *
           * @param {!HTMLCollection} elements
           * The elements we wish to upgrade.
           */
  def upgradeElements(elements: stdLib.HTMLCollection): scala.Unit = js.native
  /**
           * Upgrades a specific list of elements rather than all in the DOM.
           *
           * @param {!Element} elements
           * The elements we wish to upgrade.
           */
  def upgradeElements(elements: stdLib.HTMLElement): scala.Unit = js.native
  /**
           * Upgrades a specific list of elements rather than all in the DOM.
           *
           * @param {!NodeList} elements
           * The elements we wish to upgrade.
           */
  def upgradeElements(elements: stdLib.NodeList): scala.Unit = js.native
}

