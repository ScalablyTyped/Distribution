package typings.jscodeshift.jsxelementMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMethods extends js.Object {
  /**
    * Filter method for attributes.
    */
  def hasAttributes(attributeFilter: StringDictionary[js.Any]): Filter
  /**
    * Filter elements which contain a specific child type
    */
  def hasChildren(name: String): Filter
}

object FilterMethods {
  @scala.inline
  def apply(hasAttributes: StringDictionary[js.Any] => Filter, hasChildren: String => Filter): FilterMethods = {
    val __obj = js.Dynamic.literal(hasAttributes = js.Any.fromFunction1(hasAttributes), hasChildren = js.Any.fromFunction1(hasChildren))
  
    __obj.asInstanceOf[FilterMethods]
  }
}

