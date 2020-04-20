package typings.jscodeshift.jsxelementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingMethods extends js.Object {
  /**
    * Given a JSXElement, returns its "root" name. E.g. it would return "Foo" for
    * both <Foo /> and <Foo.Bar />.
    */
  def getRootName(path: ASTPath[_]): String
}

object MappingMethods {
  @scala.inline
  def apply(getRootName: ASTPath[_] => String): MappingMethods = {
    val __obj = js.Dynamic.literal(getRootName = js.Any.fromFunction1(getRootName))
    __obj.asInstanceOf[MappingMethods]
  }
}

