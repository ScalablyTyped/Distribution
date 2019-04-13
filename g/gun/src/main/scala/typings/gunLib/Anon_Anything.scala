package typings
package gunLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Anything extends js.Object {
  /** Returns a "gun-ified" variant of the json input by injecting a new gun ID into the metadata field. */
  def ify(json: js.Any): js.Any
  /** Returns true if data is a gun node, otherwise false. */
  def is(anything: js.Any): /* is gun.gun.Gun.ChainReference<any, any, false> */ scala.Boolean
  /**
    * Returns data's gun ID (instead of manually grabbing its metadata i.e. data["_"]["#"], which is faster but could change in the future)
    *
    * Returns undefined if data is not correct gun data.
    */
  def soul(data: gunLib.gunMod.GunNs.ChainReference[_, _, gunLib.gunLibNumbers.`false`]): java.lang.String
}

object Anon_Anything {
  @scala.inline
  def apply(
    ify: js.Any => js.Any,
    is: js.Any => /* is gun.gun.Gun.ChainReference<any, any, false> */ scala.Boolean,
    soul: gunLib.gunMod.GunNs.ChainReference[_, _, gunLib.gunLibNumbers.`false`] => java.lang.String
  ): Anon_Anything = {
    val __obj = js.Dynamic.literal(ify = js.Any.fromFunction1(ify), is = js.Any.fromFunction1(is), soul = js.Any.fromFunction1(soul))
  
    __obj.asInstanceOf[Anon_Anything]
  }
}

