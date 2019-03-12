package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryableString extends js.Object {
  def contains(searchString: java.lang.String): scala.Boolean
  def endsWith(searchString: java.lang.String): scala.Boolean
  def equals(compareString: java.lang.String): scala.Boolean
  def startsWith(searchString: java.lang.String): scala.Boolean
  def value(): java.lang.String
}

object QueryableString {
  @scala.inline
  def apply(
    contains: java.lang.String => scala.Boolean,
    endsWith: java.lang.String => scala.Boolean,
    equals: java.lang.String => scala.Boolean,
    startsWith: java.lang.String => scala.Boolean,
    value: () => java.lang.String
  ): QueryableString = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), endsWith = js.Any.fromFunction1(endsWith), equals = js.Any.fromFunction1(equals), startsWith = js.Any.fromFunction1(startsWith), value = js.Any.fromFunction0(value))
  
    __obj.asInstanceOf[QueryableString]
  }
}

