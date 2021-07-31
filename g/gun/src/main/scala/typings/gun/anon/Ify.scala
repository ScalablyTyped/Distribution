package typings.gun.anon

import typings.gun.gunBooleans.`false`
import typings.gun.mod.Gun.ChainReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ify extends StObject {
  
  /** Returns a "gun-ified" variant of the json input by injecting a new gun ID into the metadata field. */
  def ify(json: js.Any): js.Any
  
  /** Returns true if data is a gun node, otherwise false. */
  def is(anything: js.Any): /* is gun.gun.Gun.ChainReference<any, any, false> */ Boolean
  
  /**
    * Returns data's gun ID (instead of manually grabbing its metadata i.e. data["_"]["#"], which is faster but could change in the future)
    *
    * Returns undefined if data is not correct gun data.
    */
  @JSName("soul")
  def soul_false(data: ChainReference[js.Any, js.Any, `false`]): String
}
object Ify {
  
  @scala.inline
  def apply(
    ify: js.Any => js.Any,
    is: js.Any => /* is gun.gun.Gun.ChainReference<any, any, false> */ Boolean,
    soul: ChainReference[js.Any, js.Any, `false`] => String
  ): Ify = {
    val __obj = js.Dynamic.literal(ify = js.Any.fromFunction1(ify), is = js.Any.fromFunction1(is), soul = js.Any.fromFunction1(soul))
    __obj.asInstanceOf[Ify]
  }
  
  @scala.inline
  implicit class IfyMutableBuilder[Self <: Ify] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIfy(value: js.Any => js.Any): Self = StObject.set(x, "ify", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIs(value: js.Any => /* is gun.gun.Gun.ChainReference<any, any, false> */ Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSoul(value: ChainReference[js.Any, js.Any, `false`] => String): Self = StObject.set(x, "soul", js.Any.fromFunction1(value))
  }
}
