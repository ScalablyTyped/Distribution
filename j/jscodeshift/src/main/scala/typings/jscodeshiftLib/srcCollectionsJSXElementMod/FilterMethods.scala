package typings
package jscodeshiftLib.srcCollectionsJSXElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMethods extends js.Object {
  /**
    * Filter method for attributes.
    */
  def hasAttributes(attributeFilter: org.scalablytyped.runtime.StringDictionary[js.Any]): Filter
  /**
    * Filter elements which contain a specific child type
    */
  def hasChildren(name: java.lang.String): Filter
}

object FilterMethods {
  @scala.inline
  def apply(
    hasAttributes: org.scalablytyped.runtime.StringDictionary[js.Any] => Filter,
    hasChildren: java.lang.String => Filter
  ): FilterMethods = {
    val __obj = js.Dynamic.literal(hasAttributes = js.Any.fromFunction1(hasAttributes), hasChildren = js.Any.fromFunction1(hasChildren))
  
    __obj.asInstanceOf[FilterMethods]
  }
}

