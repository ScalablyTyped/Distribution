package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTreeBindings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets the next layer of bindings in a recursive fashion.
    *
    */
  var bindings: js.UndefOr[IgTreeBindingsBindings] = js.native
  
  /**
    * Gets the name of the data source property the value of which would hold the node's
    * check state. The check state itself is represented by a string enumeration with the
    * checked|partially checked|unchecked states being respectively "on|partial|off".
    *
    */
  var checkedKey: js.UndefOr[String] = js.native
  
  /**
    * Gets the name of the data source property that holds the child data of the current layer node.
    *
    */
  var childDataProperty: js.UndefOr[String] = js.native
  
  /**
    * Gets the XPath to the child data node. Used in client-only binding directly to XML.
    *
    */
  var childDataXPath: js.UndefOr[String] = js.native
  
  /**
    * Gets the name of the data source property the value of which would hold the node`s
    * expanded state. The expanded state is represented by a boolean.
    *
    */
  var expandedKey: js.UndefOr[String] = js.native
  
  /**
    * Gets the name of the data source property the value of which would be used as a URL for the node image.
    *
    */
  var imageUrlKey: js.UndefOr[String] = js.native
  
  /**
    * Gets the XPath to the image URL attribute/node. Used in client-only binding directly to XML.
    *
    */
  var imageUrlXPath: js.UndefOr[String] = js.native
  
  /**
    * Gets the name of the data source property the value of which would be used as an href attribute for the node anchor.
    *
    */
  var navigateUrlKey: js.UndefOr[String] = js.native
  
  /**
    * Gets the XPath to the navigate URL attribute/node. Used in client-only binding directly to XML.
    *
    */
  var navigateUrlXPath: js.UndefOr[String] = js.native
  
  /**
    * Gets the node content template for the current layer of bindings. The igTree utilizes igTemplating
    * for generating node content templates. A good example of how to setup templating can be found here http://www.infragistics.com/community/blogs/marina_stoyanova/archive/2014/06/17/how-to-use-templates-to-style-the-different-nodes-of-the-ignite-ui-tree-control.aspx
    *
    */
  var nodeContentTemplate: js.UndefOr[String] = js.native
  
  /**
    * Gets the name of the data source property the value of which is the primary key attribute
    * for the data. This property is used when load on demand is enabled and if specified the node paths
    * would be generated using primary keys instead of indices.
    *
    */
  var primaryKey: js.UndefOr[String] = js.native
  
  /**
    * Gets the XPath to the root data node. Used in client-only binding directly to XML.
    *
    */
  var searchFieldXPath: js.UndefOr[String] = js.native
  
  /**
    * Gets the name of the data source property the value of which would be used as a target
    * attribute for the node anchor.
    *
    */
  var targetKey: js.UndefOr[String] = js.native
  
  /**
    * Gets the name of the data source property the value of which would be the node text.
    *
    */
  var textKey: js.UndefOr[String] = js.native
  
  /**
    * Gets the XPath to the text attribute/node. Used in client-only binding directly to XML.
    *
    */
  var textXPath: js.UndefOr[String] = js.native
  
  /**
    * Gets the name of the data source property the value of which would be the node value.
    *
    */
  var valueKey: js.UndefOr[String] = js.native
  
  /**
    * Gets the XPath to the value attribute/node. Used in client-only binding directly to XML.
    *
    */
  var valueXPath: js.UndefOr[String] = js.native
}
object IgTreeBindings {
  
  @scala.inline
  def apply(): IgTreeBindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeBindings]
  }
  
  @scala.inline
  implicit class IgTreeBindingsOps[Self <: IgTreeBindings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBindings(value: IgTreeBindingsBindings): Self = this.set("bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
    
    @scala.inline
    def setCheckedKey(value: String): Self = this.set("checkedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedKey: Self = this.set("checkedKey", js.undefined)
    
    @scala.inline
    def setChildDataProperty(value: String): Self = this.set("childDataProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildDataProperty: Self = this.set("childDataProperty", js.undefined)
    
    @scala.inline
    def setChildDataXPath(value: String): Self = this.set("childDataXPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildDataXPath: Self = this.set("childDataXPath", js.undefined)
    
    @scala.inline
    def setExpandedKey(value: String): Self = this.set("expandedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedKey: Self = this.set("expandedKey", js.undefined)
    
    @scala.inline
    def setImageUrlKey(value: String): Self = this.set("imageUrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrlKey: Self = this.set("imageUrlKey", js.undefined)
    
    @scala.inline
    def setImageUrlXPath(value: String): Self = this.set("imageUrlXPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrlXPath: Self = this.set("imageUrlXPath", js.undefined)
    
    @scala.inline
    def setNavigateUrlKey(value: String): Self = this.set("navigateUrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigateUrlKey: Self = this.set("navigateUrlKey", js.undefined)
    
    @scala.inline
    def setNavigateUrlXPath(value: String): Self = this.set("navigateUrlXPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigateUrlXPath: Self = this.set("navigateUrlXPath", js.undefined)
    
    @scala.inline
    def setNodeContentTemplate(value: String): Self = this.set("nodeContentTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeContentTemplate: Self = this.set("nodeContentTemplate", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: String): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    
    @scala.inline
    def setSearchFieldXPath(value: String): Self = this.set("searchFieldXPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchFieldXPath: Self = this.set("searchFieldXPath", js.undefined)
    
    @scala.inline
    def setTargetKey(value: String): Self = this.set("targetKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetKey: Self = this.set("targetKey", js.undefined)
    
    @scala.inline
    def setTextKey(value: String): Self = this.set("textKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextKey: Self = this.set("textKey", js.undefined)
    
    @scala.inline
    def setTextXPath(value: String): Self = this.set("textXPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextXPath: Self = this.set("textXPath", js.undefined)
    
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueKey: Self = this.set("valueKey", js.undefined)
    
    @scala.inline
    def setValueXPath(value: String): Self = this.set("valueXPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueXPath: Self = this.set("valueXPath", js.undefined)
  }
}
