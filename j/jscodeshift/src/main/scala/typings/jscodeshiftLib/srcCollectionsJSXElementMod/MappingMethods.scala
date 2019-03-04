package typings
package jscodeshiftLib.srcCollectionsJSXElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingMethods extends js.Object {
  /**
    * Given a JSXElement, returns its "root" name. E.g. it would return "Foo" for
    * both <Foo /> and <Foo.Bar />.
    */
  def getRootName(path: ASTPath[_]): java.lang.String
}

object MappingMethods {
  @scala.inline
  def apply(getRootName: js.Function1[ASTPath[_], java.lang.String]): MappingMethods = {
    val __obj = js.Dynamic.literal(getRootName = getRootName)
  
    __obj.asInstanceOf[MappingMethods]
  }
}

