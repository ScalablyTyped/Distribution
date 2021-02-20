package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventComposite[T] extends IEvent[T] {
  
  /**
    * EventObjects (may be a single body, constraint, composite or a mixed array of these)
    */
  var `object`: js.Any = js.native
}
object IEventComposite {
  
  @scala.inline
  def apply[T](name: String, `object`: js.Any, source: T): IEventComposite[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventComposite[T]]
  }
  
  @scala.inline
  implicit class IEventCompositeMutableBuilder[Self <: IEventComposite[_], T] (val x: Self with IEventComposite[T]) extends AnyVal {
    
    @scala.inline
    def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
