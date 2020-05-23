package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeBindings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets the next layer of bindings in a recursive fashion.
    *
    */
  var bindings: js.UndefOr[IgTreeBindingsBindings] = js.undefined
  /**
    * Gets the name of the data source property the value of which would hold the node's
    * check state. The check state itself is represented by a string enumeration with the
    * checked|partially checked|unchecked states being respectively "on|partial|off".
    *
    */
  var checkedKey: js.UndefOr[String] = js.undefined
  /**
    * Gets the name of the data source property that holds the child data of the current layer node.
    *
    */
  var childDataProperty: js.UndefOr[String] = js.undefined
  /**
    * Gets the XPath to the child data node. Used in client-only binding directly to XML.
    *
    */
  var childDataXPath: js.UndefOr[String] = js.undefined
  /**
    * Gets the name of the data source property the value of which would hold the node`s
    * expanded state. The expanded state is represented by a boolean.
    *
    */
  var expandedKey: js.UndefOr[String] = js.undefined
  /**
    * Gets the name of the data source property the value of which would be used as a URL for the node image.
    *
    */
  var imageUrlKey: js.UndefOr[String] = js.undefined
  /**
    * Gets the XPath to the image URL attribute/node. Used in client-only binding directly to XML.
    *
    */
  var imageUrlXPath: js.UndefOr[String] = js.undefined
  /**
    * Gets the name of the data source property the value of which would be used as an href attribute for the node anchor.
    *
    */
  var navigateUrlKey: js.UndefOr[String] = js.undefined
  /**
    * Gets the XPath to the navigate URL attribute/node. Used in client-only binding directly to XML.
    *
    */
  var navigateUrlXPath: js.UndefOr[String] = js.undefined
  /**
    * Gets the node content template for the current layer of bindings. The igTree utilizes igTemplating
    * for generating node content templates. A good example of how to setup templating can be found here http://www.infragistics.com/community/blogs/marina_stoyanova/archive/2014/06/17/how-to-use-templates-to-style-the-different-nodes-of-the-ignite-ui-tree-control.aspx
    *
    */
  var nodeContentTemplate: js.UndefOr[String] = js.undefined
  /**
    * Gets the name of the data source property the value of which is the primary key attribute
    * for the data. This property is used when load on demand is enabled and if specified the node paths
    * would be generated using primary keys instead of indices.
    *
    */
  var primaryKey: js.UndefOr[String] = js.undefined
  /**
    * Gets the XPath to the root data node. Used in client-only binding directly to XML.
    *
    */
  var searchFieldXPath: js.UndefOr[String] = js.undefined
  /**
    * Gets the name of the data source property the value of which would be used as a target
    * attribute for the node anchor.
    *
    */
  var targetKey: js.UndefOr[String] = js.undefined
  /**
    * Gets the name of the data source property the value of which would be the node text.
    *
    */
  var textKey: js.UndefOr[String] = js.undefined
  /**
    * Gets the XPath to the text attribute/node. Used in client-only binding directly to XML.
    *
    */
  var textXPath: js.UndefOr[String] = js.undefined
  /**
    * Gets the name of the data source property the value of which would be the node value.
    *
    */
  var valueKey: js.UndefOr[String] = js.undefined
  /**
    * Gets the XPath to the value attribute/node. Used in client-only binding directly to XML.
    *
    */
  var valueXPath: js.UndefOr[String] = js.undefined
}

object IgTreeBindings {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    bindings: IgTreeBindingsBindings = null,
    checkedKey: String = null,
    childDataProperty: String = null,
    childDataXPath: String = null,
    expandedKey: String = null,
    imageUrlKey: String = null,
    imageUrlXPath: String = null,
    navigateUrlKey: String = null,
    navigateUrlXPath: String = null,
    nodeContentTemplate: String = null,
    primaryKey: String = null,
    searchFieldXPath: String = null,
    targetKey: String = null,
    textKey: String = null,
    textXPath: String = null,
    valueKey: String = null,
    valueXPath: String = null
  ): IgTreeBindings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (checkedKey != null) __obj.updateDynamic("checkedKey")(checkedKey.asInstanceOf[js.Any])
    if (childDataProperty != null) __obj.updateDynamic("childDataProperty")(childDataProperty.asInstanceOf[js.Any])
    if (childDataXPath != null) __obj.updateDynamic("childDataXPath")(childDataXPath.asInstanceOf[js.Any])
    if (expandedKey != null) __obj.updateDynamic("expandedKey")(expandedKey.asInstanceOf[js.Any])
    if (imageUrlKey != null) __obj.updateDynamic("imageUrlKey")(imageUrlKey.asInstanceOf[js.Any])
    if (imageUrlXPath != null) __obj.updateDynamic("imageUrlXPath")(imageUrlXPath.asInstanceOf[js.Any])
    if (navigateUrlKey != null) __obj.updateDynamic("navigateUrlKey")(navigateUrlKey.asInstanceOf[js.Any])
    if (navigateUrlXPath != null) __obj.updateDynamic("navigateUrlXPath")(navigateUrlXPath.asInstanceOf[js.Any])
    if (nodeContentTemplate != null) __obj.updateDynamic("nodeContentTemplate")(nodeContentTemplate.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (searchFieldXPath != null) __obj.updateDynamic("searchFieldXPath")(searchFieldXPath.asInstanceOf[js.Any])
    if (targetKey != null) __obj.updateDynamic("targetKey")(targetKey.asInstanceOf[js.Any])
    if (textKey != null) __obj.updateDynamic("textKey")(textKey.asInstanceOf[js.Any])
    if (textXPath != null) __obj.updateDynamic("textXPath")(textXPath.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey.asInstanceOf[js.Any])
    if (valueXPath != null) __obj.updateDynamic("valueXPath")(valueXPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTreeBindings]
  }
}

