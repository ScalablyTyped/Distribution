package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ENUM extends js.Object {
  var ENUM: graphqlLib.graphqlLibStrings.ENUM
  var INPUT_OBJECT: graphqlLib.graphqlLibStrings.INPUT_OBJECT
  var INTERFACE: graphqlLib.graphqlLibStrings.INTERFACE
  var LIST: graphqlLib.graphqlLibStrings.LIST
  var NON_NULL: graphqlLib.graphqlLibStrings.NON_NULL
  var OBJECT: graphqlLib.graphqlLibStrings.OBJECT
  var SCALAR: graphqlLib.graphqlLibStrings.SCALAR
  var UNION: graphqlLib.graphqlLibStrings.UNION
}

object Anon_ENUM {
  @scala.inline
  def apply(
    ENUM: graphqlLib.graphqlLibStrings.ENUM,
    INPUT_OBJECT: graphqlLib.graphqlLibStrings.INPUT_OBJECT,
    INTERFACE: graphqlLib.graphqlLibStrings.INTERFACE,
    LIST: graphqlLib.graphqlLibStrings.LIST,
    NON_NULL: graphqlLib.graphqlLibStrings.NON_NULL,
    OBJECT: graphqlLib.graphqlLibStrings.OBJECT,
    SCALAR: graphqlLib.graphqlLibStrings.SCALAR,
    UNION: graphqlLib.graphqlLibStrings.UNION
  ): Anon_ENUM = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ENUM")(ENUM)
    __obj.updateDynamic("INPUT_OBJECT")(INPUT_OBJECT)
    __obj.updateDynamic("INTERFACE")(INTERFACE)
    __obj.updateDynamic("LIST")(LIST)
    __obj.updateDynamic("NON_NULL")(NON_NULL)
    __obj.updateDynamic("OBJECT")(OBJECT)
    __obj.updateDynamic("SCALAR")(SCALAR)
    __obj.updateDynamic("UNION")(UNION)
    __obj.asInstanceOf[Anon_ENUM]
  }
}

