package typings.inversifyRestifyUtils.interfacesMod.interfaces

import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _RouteOptions extends js.Object

object _RouteOptions {
  @scala.inline
  def AnonPath(path: StrOrRegex): _RouteOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_RouteOptions]
  }
  @scala.inline
  def optionsObjectpathStrOrReg(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    options: js.Object,
    path: StrOrRegex,
    propertyIsEnumerable: PropertyKey => Boolean
  ): _RouteOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[_RouteOptions]
  }
}

