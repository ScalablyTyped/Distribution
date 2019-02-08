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

