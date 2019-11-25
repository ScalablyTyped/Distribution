package typings.jscodeshift.srcCoreMod

import typings.jscodeshift.srcCollectionsJSXElementMod.MappingMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mappings extends js.Object {
  var JSXElement: MappingMethods
}

object Mappings {
  @scala.inline
  def apply(JSXElement: MappingMethods): Mappings = {
    val __obj = js.Dynamic.literal(JSXElement = JSXElement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Mappings]
  }
}

