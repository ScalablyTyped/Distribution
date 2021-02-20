package typings.intlMessageformatParser.srcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleFormatElement[T /* <: TYPE */, S /* <: Skeleton */] extends BaseElement[T] {
  
  var style: js.UndefOr[String | S | Null] = js.native
}
object SimpleFormatElement {
  
  @scala.inline
  def apply[T /* <: TYPE */, S /* <: Skeleton */](`type`: T, value: String): SimpleFormatElement[T, S] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleFormatElement[T, S]]
  }
  
  @scala.inline
  implicit class SimpleFormatElementMutableBuilder[Self <: SimpleFormatElement[_, _], T /* <: TYPE */, S /* <: Skeleton */] (val x: Self with (SimpleFormatElement[T, S])) extends AnyVal {
    
    @scala.inline
    def setStyle(value: String | S): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
