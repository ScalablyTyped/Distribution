package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.extendObject")
@js.native
object extendObject extends js.Object {
  /**
    * Copy the properties from one object to another object.
    *
    * Example:
    * ```
    * makerjs.extendObject({ abc: 123 }, { xyz: 789 }); //returns { abc: 123, xyz: 789 }
    * ```
    *
    * @param target The object to extend. It will receive the new properties.
    * @param other An object containing properties to merge in.
    * @returns The original object after merging.
    */
  def apply(target: js.Object, other: js.Object): js.Object = js.native
}

