package typings.inversify.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryableString extends js.Object {
  def contains(searchString: String): Boolean
  def endsWith(searchString: String): Boolean
  def equals(compareString: String): Boolean
  def startsWith(searchString: String): Boolean
  def value(): String
}

object QueryableString {
  @scala.inline
  def apply(
    contains: String => Boolean,
    endsWith: String => Boolean,
    equals: String => Boolean,
    startsWith: String => Boolean,
    value: () => String
  ): QueryableString = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), endsWith = js.Any.fromFunction1(endsWith), equals = js.Any.fromFunction1(equals), startsWith = js.Any.fromFunction1(startsWith), value = js.Any.fromFunction0(value))
  
    __obj.asInstanceOf[QueryableString]
  }
}

