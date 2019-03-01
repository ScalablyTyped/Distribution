package typings
package jscodeshiftLib.srcCoreMod.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filters extends js.Object {
  var JSXElement: jscodeshiftLib.srcCollectionsJSXElementMod.FilterMethods
  var VariableDeclarator: jscodeshiftLib.srcCollectionsVariableDeclaratorMod.FilterMethods
}

object Filters {
  @scala.inline
  def apply(
    JSXElement: jscodeshiftLib.srcCollectionsJSXElementMod.FilterMethods,
    VariableDeclarator: jscodeshiftLib.srcCollectionsVariableDeclaratorMod.FilterMethods
  ): Filters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("JSXElement")(JSXElement)
    __obj.updateDynamic("VariableDeclarator")(VariableDeclarator)
    __obj.asInstanceOf[Filters]
  }
}

